package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectSQLServer {

	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.jdbc.sql.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:sql:12.0.5214:1433,Veriforce_Test","iuser","iuser");
		System.out.println("Connected to SQL server DB");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select top 10 * from tblPersonnel");
		while(rs.next()){
			String firstname=rs.getString("PersFirstName");
			System.out.println("Database record is"+ firstname);
			
		}
	}
	
	
	
}
