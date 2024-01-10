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
//		Transaction tx = ss.beginTransaction();
//		save(ss);
//		fetchDataFromEmployee(ss);
		fetchDataFromAddress(ss);

	}

	private static void fetchDataFromEmployee(Session ss) {

		List<Employee> emp = ss.createQuery("From Employee", Employee.class).getResultList();
		System.out.println("..........Employee data...........");
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		System.out.println(emp.get(1).getAdd());
	}

	private static void fetchDataFromAddress(Session ss) {

		List<Address> Add = ss.createQuery("From Address", Address.class).getResultList();
		System.out.println("..........Employee data...........");
		for (Address Address : Add) {
			System.out.println(Address);
		}
	}

	public static void save(Session ss) {
		Transaction tx = ss.beginTransaction();
		Employee emp = new Employee();

		emp.setName("Hari");
		emp.setGender("male");
		emp.setSalary(21356);
		Address add = new Address("LKO", "UP", 222601);
//		Address add = new Address();
//		add.setCity("GZB");
//		add.setState("UP");
//		add.setPin_code(201201);
		add.setEmployee(emp);
		emp.setAdd(add);
//		ss.persist(add);
		ss.persist(emp);
		tx.commit();

	}
}
