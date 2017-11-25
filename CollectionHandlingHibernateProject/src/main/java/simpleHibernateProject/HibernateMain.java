package simpleHibernateProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	//Session session = factory.getCurrentSession();
	Transaction tx =  session.beginTransaction();
	
	Users user = new Users();
	user.setName("Akshay Pant");
	user.setCity("Amravati");
	
	Vehicle vehicle = new Vehicle();
	vehicle.setVehicleID(1);
	vehicle.setVehicleName("FZ");
	
	Vehicle vehicle2 = new Vehicle();
	vehicle2.setVehicleID(2);
	vehicle2.setVehicleName("Karizma");
	
	user.getVehicle().add(vehicle);
	user.getVehicle().add(vehicle2);
	
//	List<Vehicle> list = user.getVehicle();
//	list.add(vehicle);
//	list.add(vehicle2);
//	user.setVehicle(list);
	
	
		try{
			session.save(user);
			tx.commit();
		}
		catch(Exception e)
		{
			tx.rollback();
		}
		
	Users userVehicle = (Users)session.get(Users.class, 1);
	System.out.println("User Details" + "\n" + "User Name : " + userVehicle.getName());
	List<Vehicle> v= userVehicle.getVehicle();
	for(Vehicle vehicle1: v) {
		
		System.out.println("User " + userVehicle.getName() + " has " + vehicle1.getVehicleName());
		
	}
	
	}

}
