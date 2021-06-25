package br.com.javaparaweb.financeiro.web;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

import br.com.javaparaweb.financeiro.usuario.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private String confirmarSenha;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

}
