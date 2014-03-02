package br.usjt.autenticacao.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIO", uniqueConstraints = { @UniqueConstraint(columnNames = "LOGIN", name = "login"),
        @UniqueConstraint(columnNames = "EMAIL", name = "email"), @UniqueConstraint(columnNames = "CPF", name = "cpf") })
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

    @Column(length = 11, name = "CPF")
    private String cpf;

    @Column(name = "RG", length = 15)
    private String rg;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "PASSWORD", nullable = false)
    private String senha;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, mappedBy = "usuario")
    private Set<Perfil> perfil;

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

    public Set<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(Set<Perfil> perfil) {
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

}
