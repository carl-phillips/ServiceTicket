/**
 * @author Carl Phillips
 * @ServiceTicket constructor to create service tickets
 * Getters and setters for each field of the ticket
 */
public class ServiceTicket {
	private String make;
	private String model;
	private int year;
	private int priority;
	
	//default constructor for the service ticket class
	public ServiceTicket() {
		
	}
	
	//constructor for the service ticket class defining the variables
	public ServiceTicket(String make, String model, int year, int priority) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.priority = priority;
	}

	
	@Override
	public String toString() {
		return "ServiceTicket [make=" + make + ", model=" + model + ", year=" + year + ", priority=" + priority + "]";
	}

	//Returns the make
	public String getMake() {
		return make;
	}

	//Sets the make
	public void setMake(String make) {
		this.make = make;
	}

	//Gets the model
	public String getModel() {
		return model;
	}

	//Sets the model
	public void setModel(String model) {
		this.model = model;
	}

	//Gets the year
	public int getYear() {
		return year;
	}
	
	//Sets the year
	public void setYear(int year) {
		this.year = year;
	}

	//Gets the priority
	public int getPriority() {
		return priority;
	}

	//Sets the priority
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
}
