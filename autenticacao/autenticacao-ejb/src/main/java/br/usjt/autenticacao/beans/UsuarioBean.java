package br.usjt.autenticacao.beans;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.usjt.autenticacao.facade.UsuarioBeanRemote;
import br.usjt.autenticacao.model.Usuario;


@Stateless
@LocalBean
@Remote(UsuarioBeanRemote.class)
public class UsuarioBean implements UsuarioBeanRemote {

	@EJB
	UsuarioSession session;
	
    public UsuarioBean() {
    }

	@Override
	public void adiciona(Usuario usuario) {
		System.out.println(session.constainLogin(usuario));
		System.out.println(usuario);
		session.addLogins(usuario);
		System.out.println(session.constainLogin(usuario));
		
	}

    
    
}
