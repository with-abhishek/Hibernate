package hibernate.client;
import hibernate.entity.Employee;
import hibernate.util.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		
//		emp.setId(1);
		emp.setName("Tiger");
		emp.setGender("Male");
		emp.setSalary(30000);
		
		SessionFactory sf = config.getSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		ss.save(emp);
		tx.commit();
		
	}

}
