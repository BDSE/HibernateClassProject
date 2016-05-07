/**
 * this class performs general operations like update,delete,add,show on DB using Hibernate ORM. 
 */
package com.example;

//import java.util.Iterator;
//import java.util.List;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

public class copy {

//	private static SessionFactory sessionFactory;
//
//	public copy() {
//		// getter method to get session factory, if the using for first time
//		// then we
//		// need to get from configuration, if already there then just grab it.
//
//		if (sessionFactory == null) {
//			Configuration configuration = new Configuration().configure();
//			sessionFactory = configuration.buildSessionFactory();
//		}
//	}

	public static void main(String[] args) {

//		copy util = new copy();
//		System.out.println("Hibernate up...SessionFactory created successfully....");
//
//		Person p = new Person("amar", "Hibernate", "amarhibernate", "hibernate", "amar@hibernate.com");
//
//		util.login("amar2", "root");
		// util.save(p);
		// util.showAllRecords();
		/*
		 * try { util.updateRecord(3, "LastName", "hibernateSandhu"); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */
		// util.deleteRecord(8);
	}

//	public String login(String userName, String password) {
//		String queryString = "FROM Person p WHERE p.UserName = :userName";
//		String response = "";
//		Session s = sessionFactory.openSession();
//		Transaction tx = s.beginTransaction();
//		Query query = s.createQuery(queryString);
//		query.setParameter("userName", userName);
//
//		Person p = (Person) query.uniqueResult();
//
//		if (p != null) {
//			p.show();
//			String password_db = p.getPassword();
//			if(password_db.equals(password)){
//				//login success
//				response = "success|"+p.getFirstName()+" "+p.getLastName();
//			}
//		}else{
//			System.out.println("no related data found in DB");
//			response = "failure|no result found";
//		}
//
//		tx.commit();
//		s.close();
//		return response;
//
//	}

//	public void save(Person p) {
//		Session s = sessionFactory.openSession();
//		Transaction tx = s.beginTransaction();
//		s.persist(p);
//		tx.commit();
//		s.close();
//
//		System.out.println("Person record saved successfully....");
//	}
//
//	public void showAllRecords() {
//		Session s = sessionFactory.openSession();
//		Transaction tx = s.beginTransaction();
//
//		List personList = s.createQuery("From Person").list();
//
//		for (Iterator itr = personList.iterator(); itr.hasNext();) {
//			Person p = (Person) itr.next();
//			p.show();
//		}
//		tx.commit();
//		s.close();
//		/*
//		 * for( Object p:personList){ Person p1 = (Person)p; p1.show(); }
//		 */
//	}

//	public void updateRecord(int id, String columnname, String value) throws Exception {
//		Session s = sessionFactory.openSession();
//		Transaction tx = s.beginTransaction();
//
//		Person p = s.get(Person.class, id);
//		if (p == null) {
//			Exception e = new Exception("Id not found in the table");
//			throw e;
//		}
//		p.show();
//		switch (columnname) {
//		case "Firstname":
//			p.setFirstName(value);
//			break;
//		case "LastName":
//			p.setLastName(value);
//			break;
//		case "UserName":
//			p.setUserName(value);
//			break;
//		case "Email":
//			p.setEmail(value);
//			break;
//		}
//		s.update(p);
//		tx.commit();
//		s.close();
//	}
//
//	public void deleteRecord(int id) {
//		Session s = sessionFactory.openSession();
//		Transaction tx = null;
//		try {
//			tx = s.beginTransaction();
//			Person p = s.get(Person.class, id);
//			if (p != null) {
//				p.show();
//
//				s.delete(p);
//				System.out.println("record with id: " + id + " deleted successfully...");
//			} else {
//				System.out.println("id not found in db...");
//			}
//			tx.commit();
//			s.close();
//		} catch (HibernateException he) {
//			he.printStackTrace();
//		}
//
//	}
}
