package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PERFIL", uniqueConstraints = { @UniqueConstraint(columnNames = "NOME", name = "nome_perfil") })
@SequenceGenerator(name = "default_gen", sequenceName = "perfil_seq", initialValue = 1, allocationSize = 50)
public class Perfil extends AbstractEntity<Integer> {

    private static final long serialVersionUID = -7150450920822142743L;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "perfil")
    private Set<Modulo> modulo;

    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Modulo> getModulo() {
        return modulo;
    }

    public void setModulo(Set<Modulo> modulo) {
        this.modulo = modulo;
    }

}
