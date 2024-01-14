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

//		fetchEmployeeData(ss);
		save(ss);

	}

	private static void save(Session ss) {
		Transaction tx = ss.beginTransaction();

		List<Employee> el = new LinkedList<>();
		List<Address> ll = new LinkedList<>();
		Employee em1 = new Employee("Aman", "male", 12021);
		Employee em2 = new Employee("suresh", "male", 12312);
		Employee em3 = new Employee("Gagan", "male", 20001);
		Employee em4 = new Employee("Vimal", "male", 10000);

		Address add1 = new Address("JNP", "UP", 201305);
		Address add2 = new Address("BSB", "UP", 226013);
		Address add3 = new Address("LKO", "UP", 221101);
		Address add4 = new Address("AZM", "UP", 276127);
		el.add(em1);
		el.add(em2);
		el.add(em3);
		el.add(em4);

		ll.add(add1);
		ll.add(add2);
		ll.add(add3);
		ll.add(add4);
		
		add1.setEmployee(el);
		add2.setEmployee(el);
		add4.setEmployee(el);
		add4.setEmployee(el);
		
		em1.setAddresses(ll);
		em2.setAddresses(ll);
		em3.setAddresses(ll);
		em4.setAddresses(ll);
		
		
		ss.persist(em1);
		ss.persist(em2);
		ss.persist(em3);
		ss.persist(em4);
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
