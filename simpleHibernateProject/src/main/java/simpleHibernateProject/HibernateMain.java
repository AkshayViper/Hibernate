package simpleHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx =  session.beginTransaction();
	
	Users user = new Users();
	user.setName("Randy Orton");
	user.setSex("Male");
	user.setCity("Shegaon");
	try{
		session.save(user);
		tx.commit();
	}
	catch(Exception e)
	{
		tx.rollback();
	}
		Users userFetch = (Users)session.get(Users.class, "Akshay Pant");
		System.out.println("User Detail is : "+ userFetch.getName() 
		+ "\t City: " + userFetch.getCity() +"\t Sex: " + userFetch.getSex());
	}

}
