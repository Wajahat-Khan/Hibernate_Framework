package com.hibernate.wajahat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class main {

	public static void main(String[] args) {
		users u1=new users();
		u1.setId(1);
		u1.setUsername("admin");
		u1.setPassword("admin");	
		final SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(u1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
	}

}
