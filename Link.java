/**
 * @author Carl Phillips
 * @Description the link class for the list
 * @Link creates the link to each new ticket
 * @displayLink prints the ticket coordinated with the link to the console
 * @getTicket returns the ticket
 * @getPriority returns the priority of the ticket
 */
public class Link {
	public ServiceTicket newTicket;
	public Link next;
	public Link previous;

	//Constructor for the link 
	public Link(ServiceTicket Ticket) {		//creates a new can in the list
		newTicket = Ticket;
	}
	
	//If called, prints the ticket link in the console
	public void displayLink() {
		System.out.println(newTicket);
	}
	
	//Returns the ticket back to what is called
	public ServiceTicket getTicket() {
		return newTicket;
	}
	
	//Returns the priority of the ticket
	public int getPriority() {
		return newTicket.getPriority();
	}
}
