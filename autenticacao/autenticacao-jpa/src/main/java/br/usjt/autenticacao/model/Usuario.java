package br.usjt.autenticacao.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "USUARIO", uniqueConstraints = { @UniqueConstraint(columnNames = "LOGIN"), @UniqueConstraint(columnNames = "EMAIL"),
        @UniqueConstraint(columnNames = "CPF") })
@SequenceGenerator(name = "default_gen", sequenceName = "usuario_seq", initialValue = 1, allocationSize = 50)
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

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "PERFIL_ID_FK", nullable = true)
    private Perfil perfil;

    @Column(name = "LOGIN", nullable = false, unique = true)
    private String login;

    @Column(name = "PASSWORD", nullable = false)
    private String senha;

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

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(nome).append(sobrenome).append(email).append(endereco).append(telefoneCelular).append(telefoneComercial)
                .append(cpf).append(cep).append(rg).append(login).append(senha).append(perfil).toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nome", nome).append("sobrenome", sobrenome).append("email", email).append("endereco", endereco)
                .append("telefoneCelular", telefoneCelular).append("telefoneComercial", telefoneComercial).append("cpf", cpf).append("cep", cep)
                .append("rg", rg).append("senha", senha).append("login", login).append("perfil", perfil).toString();
    }

}
