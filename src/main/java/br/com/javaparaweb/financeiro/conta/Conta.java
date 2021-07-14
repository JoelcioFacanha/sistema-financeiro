package br.com.javaparaweb.financeiro.conta;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import br.com.javaparaweb.financeiro.usuario.Usuario;

@Entity
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer conta;
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(nullable = false)
	private Usuario usuario;
	private String descricao;
	@Column(nullable = false, updatable = false)
	private Date dataCadastro;
	private float saldoInicial;
	private boolean favorita;

	public Conta() {

	}

	public Conta(Integer conta, Usuario usuario, String descricao, Date dataCadastro, float saldoInicial,
			boolean favorita) {
		this.conta = conta;
		this.usuario = usuario;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.saldoInicial = saldoInicial;
		this.favorita = favorita;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public float getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public boolean isFavorita() {
		return favorita;
	}

	public void setFavorita(boolean favorita) {
		this.favorita = favorita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCadastro, descricao, favorita, conta, saldoInicial, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(dataCadastro, other.dataCadastro) && Objects.equals(descricao, other.descricao)
				&& favorita == other.favorita && Objects.equals(conta, other.conta)
				&& Float.floatToIntBits(saldoInicial) == Float.floatToIntBits(other.saldoInicial)
				&& Objects.equals(usuario, other.usuario);
	}

}
