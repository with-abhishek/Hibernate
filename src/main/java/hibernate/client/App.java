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
		
//		Employee emp = new Employee();
	
		
		SessionFactory sf = config.getSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
//		Aggregate Method
		
//		String hql ="from Employee where id=1";
//		Query q = ss.createQuery(hql);
//		List list = q.list();	
//		System.out.println(list);
		
//		Pagination 
		
//		String hql ="from Employee";
//		Query q = ss.createQuery(hql);
//		q.setFirstResult(1);
//		q.setMaxResults(10);
//		List list = q.list();	
//		System.out.println(list);
		
//		From Clause
		
//		String hql ="from Employee";
//		Query q = ss.createQuery(hql);
//		List list = q.list();	
//		System.out.println(list);
		
//		Delete Clause
		
//		String hql ="delete from Employee where id=:id";
//		Query q = ss.createQuery(hql);
//		q.setParameter("id", 20);
//		int res=q.executeUpdate();
//		System.out.println(res);
//		

//		Update Clause
		
//		String hql ="update Employee set salary=:sal where id=:id";
//		Query q = ss.createQuery(hql);
//		q.setParameter("sal", 31200);
//		q.setParameter("id", 5);
//		int res=q.executeUpdate();
//		System.out.println(res);
		
//		ss.save(emp);
		tx.commit();
		
	}

}
