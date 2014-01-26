package br.usjt.autenticacao.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import br.usjt.autenticacao.facade.UsuarioBeanRemote;

@Named
@SessionScoped
public class LoginController {

    @EJB
    UsuarioBeanRemote bean;

    public void teste() {

        bean.consultarTodosUsuarios();

    }

}
