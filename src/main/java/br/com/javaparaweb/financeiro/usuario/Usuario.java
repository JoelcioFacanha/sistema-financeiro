package br.com.javaparaweb.financeiro.usuario;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nome;
	private String email;
	@NaturalId
	private String login;
	private String senha;
	private Date nascimento;
	private String celular;
	private String idioma;
	private boolean ativo;

	public Usuario() {

	}

	public Usuario(Integer codigo, String nome, String email, String login, String senha, Date nascimento,
			String celular, String idioma, boolean ativo) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.nascimento = nascimento;
		this.celular = celular;
		this.idioma = idioma;
		this.ativo = ativo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(celular, email, idioma, login, nascimento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(celular, other.celular) && Objects.equals(email, other.email)
				&& Objects.equals(idioma, other.idioma) && Objects.equals(login, other.login)
				&& Objects.equals(nascimento, other.nascimento) && Objects.equals(nome, other.nome);
	}

}
