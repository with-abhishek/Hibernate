package hibernate.client;

import hibernate.entity.Address;
import hibernate.entity.Employee;
import hibernate.util.config;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

		SessionFactory sf = config.getSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

//		
		fectAllData(ss);
//		save(ss);

	}

	public static void save(Session ss) {

		Employee emp = new Employee();

		emp.setName("Arpit");
		emp.setGender("male");
		emp.setSalary(164251);
		Address add = new Address("JNP", "UP", 201301);
//		Address add = new Address();
//		add.setCity("GZB");
//		add.setState("UP");
//		add.setPin_code(201201);
//		
//		emp.setAdd(add);
//		
//		
//		ss.persist(add);
//		ss.persist(emp);
//		
//		tx.commit();
	}

	public static void fectAllData(Session ss) {
		System.out.println("............Data Fetching............");
		List<Employee> Emp = ss.createQuery("From Employee", Employee.class).getResultList();

		for (Employee E : Emp) {
			System.out.println(E);
		}
	}
}
