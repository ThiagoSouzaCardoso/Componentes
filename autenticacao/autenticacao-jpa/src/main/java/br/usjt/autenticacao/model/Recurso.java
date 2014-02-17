package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "recurso_seq", initialValue = 1, allocationSize = 50)
public class Recurso extends AbstractEntity<Integer> {

    private static final long serialVersionUID = -2374129220625090906L;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORIA_ID_FK", nullable = true)
    private Categoria categoria;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "PERFIL_ID_FK", nullable = true)
    private Set<Perfil> perfil;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
