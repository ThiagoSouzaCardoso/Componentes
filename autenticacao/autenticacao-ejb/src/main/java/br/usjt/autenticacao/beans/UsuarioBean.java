package br.usjt.autenticacao.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.usjt.autenticacao.facade.UsuarioBeanRemote;
import br.usjt.autenticacao.model.Usuario;

@Stateless
@LocalBean
@Remote(UsuarioBeanRemote.class)
public class UsuarioBean implements UsuarioBeanRemote {

    public UsuarioBean() {
    }

    @Override
    public void salvar(Usuario usuario) {

    }

    @Override
    public void atualizar(Usuario usuario) {

    }

    @Override
    public void deletar(Usuario usuario) {

    }

    @Override
    public Usuario consultarPorCPF(String cpf) {
        return null;
    }

    @Override
    public Usuario consultarPorEmail(String email) {
        return null;
    }

    @Override
    public List<Usuario> consultarTodosUsuarios() {

        Usuario u = new Usuario();
        u.setNome("Thiago");
        u.setSobrenome("Thiago");

        Usuario u2 = new Usuario();
        u2.setNome("Thiago");
        u2.setSobrenome("Thiago");

        System.out.println(u.equals(u2));

        return null;
    }

}
