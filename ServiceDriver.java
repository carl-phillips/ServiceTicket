
/**
 * @author Carl Phillips
 * @description creates tickets, adds them to a linked list, sorts them based on insertion sort, and displays them in a GUI
 * @gui creates the GUI
 * @stList creates the Service Ticket List 
 * @insert inserts each ticket to the list
 * @displayList displays the list in the console
 * @displayGUI displays the list in a GUI
 */
public class ServiceDriver {

	public static void main(String[] args) {
		
		GUI gui = new GUI();
		
		TicketList stList = new TicketList();
		ServiceTicket impala = new ServiceTicket("Chevy", "Impala", 2008, 2);
		ServiceTicket f150 = new ServiceTicket("Ford", "F150", 2012, 4);
		ServiceTicket cruze = new ServiceTicket("Chevy", "Cruze", 2013, 1);
		ServiceTicket civic = new ServiceTicket("Honda", "Civic", 2000, 5);
		ServiceTicket prius = new ServiceTicket("Toyota", "Prius", 2010, 3);
		ServiceTicket sonata = new ServiceTicket("Hyundai", "Sonata", 2009, 4);
		ServiceTicket r8 = new ServiceTicket("Audi", "R8", 2012, 1);
		ServiceTicket m5 = new ServiceTicket("BMW", "M5", 2013, 2);
		ServiceTicket escalade = new ServiceTicket("Cadillac", "Escalade", 2015, 1);
		
		stList.insert(impala);
		stList.insert(f150);
		stList.insert(cruze);
		stList.insert(civic);
		stList.insert(prius);
		stList.insert(sonata);
		stList.insert(r8);
		stList.insert(m5);
		stList.insert(escalade);
		
		stList.displayList();
		gui.displayGUI(stList);

	}
}
