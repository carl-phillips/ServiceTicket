/**
 * @author Carl Phillips
 * @TicketList creates a new list
 * @isEmpty tells you if the list is empty
 * @insert inserts a ticket into the list and sorts the list
 * @deleteFirst deletes the first link in the list
 * @displayList iterates through the list and prints each one
 * @getFirst returns the first link in the list
 * @getCount returns the number of items in the list
 * @iterateList iterates through the list and returns the priority
 */

public class TicketList extends ServiceTicket {
	private Link first;
	private Link last;
	public int count;
	
	//Constructor to create the ticket list
	public TicketList() {
		first = null;
		last = null;
	}
	
	//Will tell you if the list is empty
	public boolean isEmpty(){
		return first == null;
	}
	
	//Creates a link and inserts the link and sorts it using insertion sort upon insertion.
	public void insert(ServiceTicket entry) {
		Link newLink = new Link(entry);
		if(isEmpty()) {		//if the link is empty put the link in the first spot
			first = newLink;
		} else if (entry.getPriority() < first.getPriority()) {    	//otherwise if the priority is
			newLink.next = first;							//less than the first insert the link in the first spot
			first = newLink;
		} else {					//OTHERWISE iterate through the list and find the correct spot to insert the link
			Link tmp;
			Link prv;
			tmp = first.next;
			prv = first;
			while (prv.next != null && entry.getPriority() > prv.next.getPriority()) {
				prv = tmp;
				tmp = tmp.next;
			}
			newLink.next = tmp;
			prv.next = newLink;
		}
		count++;		//increments the counter
	}
	
	public ServiceTicket deleteFirst(){			//moves the first link to the next one in the list, deleting the first one
		ServiceTicket tmp = first.newTicket;
		if(first.next == null)
			last = null;
		first = first.next;
		count--;
		return tmp;
	}
	
	//Prints the list out from beginning to end
	public void displayList() {	
		System.out.println("The list from first to last");
		Link current = first;
		while(current != null){		//iterates through the list until there is no more list
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

	//Returns the first link
	public Link getFirst() {
		return first;
	}
	
	//Returns the number of tickets
	public int getCount() {
		return count;
	}
	
	//Iterates through the list and returns the priority
	public void iterateList(ServiceTicket entry) {
		Link current = first;
		while(current != null)
			current.getPriority();
	}
}
