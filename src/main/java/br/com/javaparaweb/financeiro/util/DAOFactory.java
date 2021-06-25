package br.com.javaparaweb.financeiro.util;

import br.com.javaparaweb.financeiro.usuario.UsuarioDAO;
import br.com.javaparaweb.financeiro.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		return new UsuarioDAOHibernate(HibernateUtil.getSessionFactory().getCurrentSession());
	}

}
