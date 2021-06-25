package br.com.javaparaweb.financeiro.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");

			/*
			 * O c�digo acima funcionar� bem no Hibernate 4.3.6, mas o problema � quando se
			 * trabalha com o Hibernate 5 . O problema est� no seguinte c�digo: O problema �
			 * quando voc� passa o StandardServiceRegistryBuilder como um argumento dentro
			 * de buildSessionFactory (). Quando voc� faz isso, a configura��o perde todas
			 * as informa��es de mapeamento adquiridas por meio da
			 * configuration.configure();instru��o. � por isso que o c�digo funcionou bem ao
			 * usar o arquivo hibernate.properties (que n�o usa configuration.configure ()),
			 * mas causou uma exce��o ao usar hibernate.cfg.xml . Ao usar hibernate.cfg.xml
			 * Ao usar o m�todo de configura��o xml do hibernate, voc� pode simplesmente
			 * retornar o sessionFactoryque usa um no-arg buildSessionFactory()m�todo.
			 */

			// cfg.addAnnotatedClass(Contato.class);

			// StandardServiceRegistryBuilder registradorServico = new
			// StandardServiceRegistryBuilder();
			// registradorServico.applySettings(cfg.getProperties());

			// StandardServiceRegistry servico = registradorServico.build();

			// return cfg.buildSessionFactory(servico);
			return cfg.buildSessionFactory();

		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Cria��o inicial do objeto SessionFactory falhou. Erro: " + e);
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
