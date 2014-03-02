package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CATEGORIA", uniqueConstraints = { @UniqueConstraint(columnNames = "NOME", name = "nome") })
@SequenceGenerator(name = "default_gen", sequenceName = "categoria_seq", initialValue = 1, allocationSize = 50)
public class Categoria extends AbstractEntity<Integer> {

    private static final long serialVersionUID = 8267732234734274343L;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "MODULO_ID_FK")
    private Modulo modulo;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
    private Set<Recurso> recurso;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORIA_PAI_ID", referencedColumnName = "ID")
    private Categoria parent;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "parent")
    private Set<Categoria> subCategoria;

    public Set<Recurso> getRecurso() {
        return recurso;
    }

    public void setRecurso(Set<Recurso> recurso) {
        this.recurso = recurso;
    }

    public Set<Categoria> getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(Set<Categoria> subCategoria) {
        this.subCategoria = subCategoria;
    }

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

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Categoria getParent() {
        return parent;
    }

    public void setParent(Categoria parent) {
        this.parent = parent;
    }

}
