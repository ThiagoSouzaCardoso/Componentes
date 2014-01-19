package br.usjt.autenticacao.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import br.usjt.autenticacao.facade.UsuarioBeanRemote;
import br.usjt.autenticacao.model.Usuario;

@Named
@SessionScoped
public class LoginController {

	@EJB
	UsuarioBeanRemote bean;
	
	
	public void teste(){
		Usuario usuario = new Usuario();
		usuario.setNome("Thiago");
		usuario.setSobrenome("Souza");
		bean.adiciona(usuario);
	}
	
}
