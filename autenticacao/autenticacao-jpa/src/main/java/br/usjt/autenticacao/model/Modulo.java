package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "MODULO", uniqueConstraints = { @UniqueConstraint(columnNames = "NOME", name = "nome") })
@SequenceGenerator(name = "default_gen", sequenceName = "modulo_seq", initialValue = 1, allocationSize = 50)
public class Modulo extends AbstractEntity<Integer> {

    private static final long serialVersionUID = -1072591439603842435L;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", nullable = true)
    private String descricao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "PERFIL_ID_FK", nullable = true)
    private Set<Perfil> perfil;

    @OneToMany(mappedBy = "modulo")
    private Set<Categoria> categoria;

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

    public Set<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(Set<Perfil> perfil) {
        this.perfil = perfil;
    }

    public Set<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(Set<Categoria> categoria) {
        this.categoria = categoria;
    }

}
