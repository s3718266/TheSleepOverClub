import javax.swing.JOptionPane;

public class customer {

	
	public static void main(String[] args) {
		String firstName = null;
		String lastName = null;
		int phoneNumber = 0;
		int points = 0;
		int creditCard = 0;
		
		enterDetails(firstName, lastName, phoneNumber, points, creditCard);
	
	}

	 public static void enterDetails(String firstName, String lastName, int phoneNumber, int points, int creditCard) {
			String input = JOptionPane.showInputDialog("Enter first name");
			input = firstName;
			
			String input1 = JOptionPane.showInputDialog("Enter last name:");
			input1 = lastName;
			
			String input2;
			phoneNumber = Integer.parseInt(input2 = JOptionPane.showInputDialog("Enter phone number:"));
			
		}

}

class getPoints{
 private int points = 0;
 {
  this.points = points;
 }
}