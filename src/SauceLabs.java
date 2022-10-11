import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {
	//inprogress
	
	public static final String USERNAME ="gwalaanitha4131@gmail.com";
	public static final String ACCESS_KEY ="003673f0-d73b-4f69-8d53-547adf81cbd8";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	WebDriverManager.chromedriver.setup();

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
				
		ChromeOptions cap = new ChromeOptions();
		cap.setPlatformName("Windows 8.1");
		cap.setBrowserVersion("106");
		
		//URL url = new URL("https://YOUR_USERNAME:YOUR_ACCESS_KEY@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		//RemoteWebDriver driver = new RemoteWebDriver(URL(URL), cap);
		
		WebDriver driver=new RemoteWebDriver(new URL(URL),cap);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
