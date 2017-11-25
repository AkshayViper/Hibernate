package simpleHibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private String name;
	private String sex;
	private String City;
	
	public Users(String name, String sex, String City)
	{
		this.name = name;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	

}
