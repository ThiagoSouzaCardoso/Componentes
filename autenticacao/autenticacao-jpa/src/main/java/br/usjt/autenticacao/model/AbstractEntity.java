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


@MappedSuperclass
public class AbstractEntity<T> implements Serializable {

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

}
