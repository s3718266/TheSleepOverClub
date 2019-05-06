package productInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Product {
	 String name;
	 Double price;
	 Map<String, Object> propMap;
	
	public static void main(String [] args)
	 {
	
	/*	ArrayList<String> product = new ArrayList<String>();

		product.add("milk");
		product.add("bread");*/
	 }
		
		

			 public Product(String name, Double price) {
			    this.name = name;
			    this.price = price;
			    propMap = new HashMap<>();
			 }

			 public void add2propMap(String key, Object value) {
			    propMap.put(key, value);
			 }

			 public String toString() {
			    return "Product [name=" + name + ", price=" + price + ", propMap=" + propMap + "]";
			 }
			
		
			 public class Milk extends Product {

				 String capacity;

				 public Milk(String name, Double price, String capacity) {
				     super(name, price);
				     this.capacity = capacity;
				 }
		
			 }
			 
			 public class Bread extends Product {

				 Boolean glutenfree;

				 public Bread(String name, Double price, Boolean glutenfree) {
				     super(name, price);
				     this.glutenfree = glutenfree;
				 }
				 
			 }
			 
			 public class ProductsList {

				 public void main(String[] args) {
				     List<Product> productList = new ArrayList<>();

				     Bread bread = new Bread("Bread", 2d, true);
				     bread.add2propMap("prodnum", new Integer(001));
				     bread.add2propMap("Supplyer", "We Make Bread");
				     productList.add(bread);

				     Milk milk = new Milk("Milk", 4d, "No fat");
				     milk.add2propMap("prodnum", new Integer(002));
				     milk.add2propMap("supplyer", "Moo Farms");
				     productList.add(milk);
				     
				     

				    // productList.forEach(product -> System.out.println(product));
				 }
				 
			 }
		
		
 }


