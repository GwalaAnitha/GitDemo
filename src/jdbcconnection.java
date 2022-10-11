import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port ="3307";
		Connection con= DriverManager.getConnection
		("jdbc:mysql://"+host+":"+port+"/demo", "root", "@1424@");
		
		Statement s=con.createStatement();
		ResultSet rs= s.executeQuery("select *from credentials where scenario ='rewards' ");
		
		while(rs.next())
		
		{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anitha\\Downloads\\chromedriver_v106\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		driver.close();
		
		}
		//url---> "jdbc:mysql://"+host+":"+port+"/databasename";
		//jdbc:mysql://"+localhost+":"+3307+"/demo"
		
		
		
			
		
		
		
	}
}
