package br.usjt.autenticacao.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.usjt.autenticacao.model.Usuario;


@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class UsuarioSession implements Serializable{

	private static final long serialVersionUID = -5554287535962626825L;

    public UsuarioSession() {
    }

    
    private Set<Usuario> logins;

    @PostConstruct
    void startup() {
        logins = new HashSet<Usuario>();
    }

    @Lock(LockType.WRITE)
    public void addLogins(Usuario login) {
        logins.add(login);
    }

    public void removeLogins(Usuario login) {
        logins.remove(login);
    }

    @Lock(LockType.READ)
    public boolean constainLogin(Usuario login) {
        return logins.contains(login);
    }

    
}
