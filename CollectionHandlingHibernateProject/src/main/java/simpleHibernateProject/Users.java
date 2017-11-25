package simpleHibernateProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String City;
	
	@ElementCollection
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public Users(String name, int id, String City)
	{
		this.name = name;
		this.id = id;
		this.City = City;
	}
	//  For implementing parameterized constructor default Constructor is must.
	//  if you won’t have no-args constructor in entity beans, hibernate will fail to instantiate it and you will get HibernateException.
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	

}
