package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "categoria_seq", initialValue = 1, allocationSize = 50)
public class Categoria extends AbstractEntity<Integer> {

    private static final long serialVersionUID = 8267732234734274343L;

    @Column(name = "NOME", nullable = false, unique = true)
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
    private Set<Recurso> recurso;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CATEGORIA_PAI", referencedColumnName = "ID")
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

}
