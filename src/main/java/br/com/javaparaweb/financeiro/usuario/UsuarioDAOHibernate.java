package br.com.javaparaweb.financeiro.usuario;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class UsuarioDAOHibernate implements UsuarioDAO {

	private Session session;

	public UsuarioDAOHibernate(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Usuario usuario) {
		this.session.save(usuario);
	}

	@Override
	public void atualizar(Usuario usuario) {
		this.session.update(usuario);
	}

	@Override
	public void excluir(Usuario usuario) {
		this.session.delete(usuario);
	}

	@Override
	public Usuario carregar(Integer codigo) {
		Usuario usuario = this.session.get(Usuario.class, codigo);
		return usuario;
	}

	@Override
	public Usuario buscarPorLogin(String login) {

		String hql = "select u from Usuario u where u.login=:login";
		Query consulta = this.session.createQuery(hql);
		consulta.setParameter("login", login);

		return (Usuario) consulta.getResultList();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Usuario> listar() {
		return this.session.createCriteria(Usuario.class).list();
	}

}
