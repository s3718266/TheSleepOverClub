package productInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;


public class ProductInfo {
	
	int productID;
	String prodName;
	double price;
	double cost;
	String prodDescript;
	String Stock;

		
	public static void main(String [] args)
	 {
		
		String prodSelect;
		
	 List<String> products = new ArrayList<>();
	 products.add("Milk");
	 products.add("Bread");
	 products.add("Cheese");
	 
	 List<String> milk = new ArrayList<>();
	 milk.add("001");
	 milk.add("Milk");
	 milk.add("Moo Farms");
	 
	 //Integer c[] = new Integer [] {1,2,3};
	 
	 //List<Integer> = list Arrays.asList(c); 
	 
	 //List<costs> list = new ArrayList<>(costs.asList(1, 2, 3));
			 
	 for (String i : products) {
		 JOptionPane.showMessageDialog(null,i);
	    }
	 
	 prodSelect = JOptionPane.showInputDialog("What Item would you like to select?");
		if (prodSelect.contains("Milk")) {
			JOptionPane.showMessageDialog(null, "milk costs $3");
			JOptionPane.showInputDialog("Milk costs $3. Would you like to buy Milk?");
		}
			else {
				if (prodSelect.contains("Bread")) {
					JOptionPane.showInputDialog("bread costs $2. Would you like to buy bread?");
			}
				else {
					if (prodSelect.contains("cheese")) {
						JOptionPane.showInputDialog("cheese costs $5. Would you like to buy cheese?");
				}
		      }
			}
		
	 }
	
	
}
