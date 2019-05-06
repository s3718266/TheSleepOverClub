package productInfo;

public class Location {

	private String productID;
	private String section;
	private String aisle;
	boolean inStock;
	
	public Location(String ProductID, String Section, String Aisle) {
		productID = ProductID;
		section = Section;
		aisle = Aisle;

	}
}
