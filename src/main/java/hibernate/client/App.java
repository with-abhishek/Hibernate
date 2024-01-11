package hibernate.client;

import hibernate.entity.Address;
import hibernate.entity.Employee;
import hibernate.util.config;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

		SessionFactory sf = config.getSessionFactory();
		Session ss = sf.openSession();

		fetchEmployeeData(ss);
//		save(ss);

	}

	private static void save(Session ss) {
		Transaction tx= ss.beginTransaction();
		Employee emp = new Employee();
		List<Address> ll= new LinkedList<>();

		emp.setName("Arpit");
		emp.setGender("male");
		emp.setSalary(164251);
		Address add1 = new Address("JNP", "UP", 201301);
		Address add2 = new Address("BSB", "UP", 221211);
		
		ll.add(add1);
		ll.add(add2);
		
		emp.setAddresses(ll);
		
		
//		ss.persist(ll);
		ss.persist(emp);
		tx.commit();
	}

	private static void fetchEmployeeData(Session ss) {
		System.out.println("............Employee Data Fetching............");
		List<Employee> Emp = ss.createQuery("From Employee", Employee.class).getResultList();

		for (Employee employee : Emp) {
			System.out.println(employee);
		}
		System.out.println("...........Employee Data End........");
	}
}
