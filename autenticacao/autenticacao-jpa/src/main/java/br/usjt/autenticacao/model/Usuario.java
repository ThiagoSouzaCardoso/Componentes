package br.usjt.autenticacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "usuario_seq", initialValue = 1 ,allocationSize = 50)
public class Usuario extends AbstractEntity<Integer> {

	private static final long serialVersionUID = -1484765293112914587L;

	@Column(name = "NAME", length = 80)
	private String nome;

	@Column(name = "LASTNAME", length = 100)
	private String sobrenome;

	@Column(name = "EMAIL", length = 100)
	private String email;

	@Column(name = "ADDRESS")
	private String endereco;

	@Column(name = "CELL_PHONE")
	private String telefoneCelular;

	@Column(name = "BUSINESS_PHONE")
	private String telefoneComercial;

	@Column(unique = true, length = 11, name = "CPF")
	private String cpf;

	@Column(name = "RG", length = 15)
	private String rg;

	@Column(name = "CEP")
	private String cep;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).
			       append(nome).
			       append(sobrenome).
			       append(email).
			       append(endereco).
			       append(telefoneCelular).
			       append(telefoneComercial).
			       append(cpf).
			       append(cep).
			       append(rg).
			       toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		 return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).
				   append("nome",nome).
			       append("sobrenome",sobrenome).
			       append("email",email).
			       append("endereco",endereco).
			       append("telefoneCelular",telefoneCelular).
			       append("telefoneComercial",telefoneComercial).
			       append("cpf",cpf).
			       append("cep",cep).
			       append("rg",rg).
			       toString();
	}
	

}
