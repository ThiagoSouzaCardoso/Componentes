package br.usjt.autenticacao.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.usjt.autenticacao.model.Usuario;

/**
 * Session Bean implementation class UsuarioBean
 */
@Stateless
@LocalBean
public class UsuarioBean {

	Usuario usuario;
	
	
    public UsuarioBean() {
    }

}
