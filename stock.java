package productInfo;

import java.util.Scanner;


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

		        int currentStock;
		        System.out.print("Enter current stock: ");
		        while (true)
		            try {
		            	currentStock = Integer.parseInt(b.nextLine());
		                break;
		            } catch (NumberFormatException nfe) {
		                System.err.println("Invalid input! Please enter again: ");
		                System.err.println("NumberFormationException");
		            }

		        int stocklevelreminder = 0;
		        do {
		            System.out.println("Low stock remider at: " + stocklevelreminder + " unit/s");
		            while (true)
		                try {
		                	stocklevelreminder = Integer.parseInt(b.nextLine());
		                    break;
		                } catch (NumberFormatException nfe) {
		                    System.err.println("Invalid input! Please enter again: ");
		                    System.err.println("NumberFormationException");
		                }
		        } while (currentStock < stocklevelreminder);//keep looping until current stock is bigger then low stock warning

		        System.out.println("Low Stock! Please order stock and enter new current stock count");
		    }

}
