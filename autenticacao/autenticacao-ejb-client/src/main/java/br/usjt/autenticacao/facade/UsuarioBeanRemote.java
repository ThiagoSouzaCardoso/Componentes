package br.usjt.autenticacao.facade;

import java.util.List;

import br.usjt.autenticacao.model.Usuario;

public interface UsuarioBeanRemote {
	
	void salvar(Usuario usuario);

    void atualizar(Usuario usuario);

    void deletar(Usuario usuario);

    Usuario consultarPorCPF(String cpf);

    Usuario consultarPorEmail(String email);

    List<Usuario> consultarTodosUsuarios();
}
