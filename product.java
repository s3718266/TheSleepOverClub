package productInfo;

import java.util.ArrayList;
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
	    
	 for (String i : products) {
		 JOptionPane.showMessageDialog(null,i);
	    }
	 
	 prodSelect = JOptionPane.showInputDialog("What Item would you like to select?");
		if (prodSelect.contains("Milk")) {
			JOptionPane.showMessageDialog(null, "milk costs $3");
			JOptionPane.showInputDialog("Milk costs $3. Would you like to buy Milk?");
		      }
	 }
/*		else {
			if (prodSelect.contains("Bread")) {
			      System.out.println("bread costs $2");
		}
		}
			
		else {
				if (prodSelect.contains("Cheese")) {
				      System.out.println("cheese costs $5");
			}
				
			}
		}*/

	 
		
	


	public int getProductID() {
		return this.productID;
	}
	
	public String prodName() {
		return this.prodName;
	}
	
	public double price() {
		return this.price;
	}	
	
	public double cost() {
		return this.cost;
	}	
	
	public String prodDescript() {
		return this.prodDescript;
	}
	
	public String Stock() {
		return this.Stock;
	}
	
	
}
