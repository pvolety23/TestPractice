package testing1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Framework{
	
public static Object[][] dbConnection() throws SQLException, ClassNotFoundException {
		String[][] fields = new String[3][2];
		String query = "select * from login;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "password123");
		// Create Statement Object
		Statement stmt = con.createStatement();
		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery(query);
		// While Loop to iterate through all data and print results
		int i = 0;
//		String email,password;
		while (rs.next()) {
			String email = rs.getString(1);
			String password = rs.getString(2);
			fields[i][0]=email;
			fields[i][1]=password;
//			System.out.println(email + " " + password);
			i++;

		}
		// closing DB Connection

		con.close();


         return fields;

	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Object[][] s=dbConnection();
		System.out.println(Arrays.deepToString(s));

	}
}
