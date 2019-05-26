package productInfo;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class StockCount {
	
	public int productID;
	public String location;
	public String supplier;
	public int prevStock;
	public int currentStock;
	boolean inStock;
	public int productBought;
	public int productSold;
	
	
	public StockCount(int ProductID, String Supplier, int PrevStock, int CurrentStock) {
		
		
	}
	
	
	public int getProductID() {
		return this.productID;
	}
	
	public String getSupplier() {
		return this.supplier;
	}
	
	public int getPrevStock() {
		return this.prevStock;
	}
	
	public int getCurrentStock() {
		return this.currentStock;
	}
	
	
	public boolean instock(int currentStock) {
		if (this.currentStock == 0) {
			return false;
			
		}
		else {
			return true;
		}		
	}
	
	
	public static void main(String... args) throws Exception { //Handle expected Exceptions in the Method
		//Throw unexpected Exceptions (one by one)
		    	
		        Scanner b = new Scanner(System.in);

		        int currentStock = 0;
		        do {
		        System.out.print("Enter current stock: ");
		        }
		        while (currentStock > 5); {
		            try {
		            	currentStock = Integer.parseInt(b.nextLine());
		               /* break;*/
		            } catch (NumberFormatException nfe) {
		                System.err.println("Invalid input! Please enter again: ");
		                System.err.println("NumberFormationException");
		            }
		        
		       /* else {
		        	System.out.println("Low Stock! Please order stock");
		        
		        }*/
		        }
		        
	
		        
		        int order;
		            System.out.println("How much stock would you like to order?");
		            while (true)
		                try {
		                	order = Integer.parseInt(b.nextLine());
		                	currentStock = order + currentStock;
		                    break;
		                } catch (NumberFormatException nfe) {
		                    System.err.println("Invalid input! Please enter again: ");
		                    System.err.println("NumberFormationException");
		                }
		        
		        System.out.println("New current stock:" + currentStock);
		        
	}
		        

		        
		    }
