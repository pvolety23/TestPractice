package testing1;

import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class LoginTest {
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n+" "+s);
  }

  @DataProvider
  public Object[][] dp() throws ClassNotFoundException, SQLException {
    return Framework.dbConnection();
//    System.out.println(Arrays.deepToString(sampleObjects));
//    return sampleObjects;
    }
  }

