package hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class config {

	public static SessionFactory getSessionFactory() {
		Properties ps = new Properties();

		ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		ps.put(Environment.URL, "jdbc:mysql://localhost:3306/mic");
		ps.put("hibernate.connection.username", "root");
		ps.put("hibernate.connection.password", "3121");
		ps.put(Environment.SHOW_SQL, "true");
		ps.put(Environment.FORMAT_SQL, "true");
		ps.put(Environment.HBM2DDL_AUTO, "update");

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(ps).build();
		// Create a MetadataSources and add annotated entity classes
		MetadataSources metadataSources = new MetadataSources(ssr).addAnnotatedClass(hibernate.entity.Employee.class);
		metadataSources= metadataSources.addAnnotatedClass(hibernate.entity.Address.class);
		Metadata meta = metadataSources.buildMetadata();
		// Create a SessionFactory
		SessionFactory sessionFactory = meta.buildSessionFactory();
		return sessionFactory;

	}

}
