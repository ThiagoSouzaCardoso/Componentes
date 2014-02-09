package br.usjt.autenticacao.mbeans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.usjt.autenticacao.model.Usuario;

@SessionScoped
@Named
public class UsuarioLogado implements Serializable {

    private static final long serialVersionUID = -4055666253949225961L;

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
