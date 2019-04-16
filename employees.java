import java.sql.*;

public class employees {

		private String ID;
		private String firstName;
		private String lastName; {

		
			
			//connecting to sql server
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "28june1999");
			
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from emplooyee");
			while (myRs.next()) {
				System.out.println(myRs.getString("id") + "," + myRs.getString("Name"));
				
			}
		
	      }
		catch (Exception e) {
			e.printStackTrace();
		}	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
