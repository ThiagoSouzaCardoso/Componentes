package br.usjt.autenticacao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@MappedSuperclass
public class AbstractEntity<T extends Number> implements Serializable {

    private static final long serialVersionUID = -1917797514577545855L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_gen")
    private T id;

    @Basic
    @Column(name = "DT_LAST_CHANGE")
    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastChange;

    @Column(name = "DT_CRIATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCriation;

    @Column(name = "STATUS", nullable = false)
    private Boolean ativo = false;

    protected T getId() {
        return id;
    }

    protected void setId(T id) {
        this.id = id;
    }

    protected Date getLastChange() {
        return lastChange;
    }

    protected void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    protected Date getDateCriation() {
        return dateCriation;
    }

    protected void setDateCriation(Date dateCriation) {
        this.dateCriation = dateCriation;
    }

    protected Boolean getAtivo() {
        return ativo;
    }

    protected void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(dateCriation).append(lastChange).append(ativo).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("dateCriation", dateCriation).append("lastChange", lastChange).append("ativo", ativo)
                .toString();
    }

}
