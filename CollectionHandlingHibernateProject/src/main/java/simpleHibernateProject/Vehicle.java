package simpleHibernateProject;

import javax.persistence.Embeddable;

@Embeddable
public class Vehicle {
	
	private int VehicleID;
	private String VehicleName;
	
	public int getVehicleID() {
		return VehicleID;
	}
	public void setVehicleID(int vehicleID) {
		VehicleID = vehicleID;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	
	

}
