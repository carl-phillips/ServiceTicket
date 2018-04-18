import java.awt.*;
import javax.swing.*;

public class GUI extends TicketList {

	private JFrame frame;
	JPanel panel;
	private JLabel[] make = new JLabel[25];
	private JLabel[] model = new JLabel[25];
	private JLabel[] year = new JLabel[25];
	private JLabel[] priority = new JLabel[25];
	
	//Constructs the GUI
	public GUI() {
		
 		frame = new JFrame("Service Ticket");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setSize(500, 350);
		panel.setLayout(null);
		frame.add(panel);
	}
	
	//Creates and displays the GUI
	public void displayGUI(TicketList List) {
		Font headFont = new Font("Arial", Font.BOLD, 20);
		Font textFont = new Font("Arial", Font.PLAIN, 15);
		int x = 100;
		int y = 3;
		int width = 70;
		int height = 20;
		JLabel tMake = new JLabel("Make");		//Creates the header variables in the GUI
		JLabel tModel = new JLabel("Model");
		JLabel tYear = new JLabel("Year");
		JLabel tPriority = new JLabel("Priority");
		tMake.setBounds(x, y, width, height);
		tMake.setFont(headFont);
		panel.add(tMake);
		tModel.setBounds(x += 70, y, width, height);
		tModel.setFont(headFont);
		panel.add(tModel);
		tYear.setBounds(x += 70, y, width, height);
		tYear.setFont(headFont);
		panel.add(tYear);
		tPriority.setBounds(x += 70, y, width, height);
		tPriority.setFont(headFont);
		panel.add(tPriority);
		Link current = List.getFirst();
		y = 25;
		for(int i = 0; i < List.getCount(); i++) {				//Creates each ticket in a list in a GUI until there are none left.
			ServiceTicket t = current.getTicket();
			current = current.next;
			x = 100;
			make[i] = new JLabel(t.getMake());  		//creates the label
			make[i].setBounds(x, y, width, height);		//tells it where to go	
			make[i].setFont(textFont);					//sets the font
			make[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));		//sets the border
			panel.add(make[i]);				//adds it to the panel
			model[i] = new JLabel(t.getModel());
			model[i].setBounds(x += 70, y, width, height);
			model[i].setFont(textFont);
			model[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(model[i]);
			year[i] = new JLabel();
			year[i].setText(String.valueOf(t.getYear()));
			year[i].setBounds(x += 70, y, width, height);
			year[i].setFont(textFont);
			year[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(year[i]);
			priority[i] = new JLabel();
			priority[i].setText(String.valueOf(t.getPriority()));
			priority[i].setBounds(x += 70, y, width, height);
			priority[i].setFont(textFont);
			priority[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			panel.add(priority[i]);
			y = y + 20;				//Moves the next part of the list down
			}
		panel.repaint();
	}	
}
