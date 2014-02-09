package br.usjt.autenticacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "PERFIL")
@SequenceGenerator(name = "default_gen", sequenceName = "perfil_seq", initialValue = 1, allocationSize = 50)
public class Perfil extends AbstractEntity<Integer> {

    private static final long serialVersionUID = -7150450920822142743L;

    @Column(name = "NAME", unique = true, nullable = false)
    public String nome;

    @Column(name = "DESCRIPTION")
    public String descricao;

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

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(nome).append(descricao).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nome", nome).append("descricao", descricao).toString();
    }

}
