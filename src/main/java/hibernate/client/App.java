package hibernate.client;
import hibernate.entity.Employee;
import hibernate.util.config;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
	
		
		SessionFactory sf = config.getSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		
		List<Employee> employees= ss.createNamedQuery("Employee.findEmployeeById",Employee.class)
				.setParameter("id", 5)
				.getResultList();
		for (Employee employee : employees) {
			System.out.println("Emp: "+employee);
		}
		System.out.println("---------------------------------------------------");
		
		List<Employee> em= ss.createNamedQuery("Employee.findByGender",Employee.class)
				.setParameter("gender", "male").getResultList();

		for (Employee employee : em) {
			System.out.println("Emp: "+employee);
		}
		tx.commit();
		ss.close();
		sf.close();
		
	}

}
