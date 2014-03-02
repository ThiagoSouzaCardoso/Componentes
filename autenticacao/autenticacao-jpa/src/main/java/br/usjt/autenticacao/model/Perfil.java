package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PERFIL", uniqueConstraints = { @UniqueConstraint(columnNames = "NAME", name = "nome") })
@SequenceGenerator(name = "default_gen", sequenceName = "perfil_seq", initialValue = 1, allocationSize = 50)
public class Perfil extends AbstractEntity<Integer> {

    private static final long serialVersionUID = -7150450920822142743L;

    @Column(name = "NAME", nullable = false)
    private String nome;

    @Column(name = "DESCRIPTION")
    private String descricao;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "perfil")
    private Set<Modulo> modulo;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "USUARIO_ID_FK", nullable = true)
    private Set<Usuario> usuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Modulo> getModulos() {
        return modulo;
    }

    public void setModulos(Set<Modulo> modulos) {
        this.modulo = modulos;
    }

    public Set<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Set<Usuario> usuario) {
        this.usuario = usuario;
    }

    public Set<Modulo> getModulo() {
        return modulo;
    }

    public void setModulo(Set<Modulo> modulo) {
        this.modulo = modulo;
    }

}
