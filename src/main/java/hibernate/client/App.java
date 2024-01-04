package hibernate.client;
import hibernate.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
public class App {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
//		em.setId(9);w
		emp.setName("Abhinav");
		emp.setGender("Male");
		emp.setSalary(41000);
		
		ServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata data = new MetadataSources(ssr).getMetadataBuilder().build();
		
//		Configuration cfg = new Configuration().configure();
		SessionFactory sf = data.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tn = ss.beginTransaction();
		
		ss.save(emp);
		
//		em = ss.load(Employee.class, 1); 
//		System.out.println(em);
		tn.commit();
		
	}

}
