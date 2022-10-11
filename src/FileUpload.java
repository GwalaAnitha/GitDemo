
import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;



import org.testng.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class FileUpload {



public static void main(String[] args) throws InterruptedException, IOException {

// TODO Auto-generated method stub

String downloadPath=System.getProperty("user.dir");

System.setProperty("webdriver.chrome.driver","C:\\Users\\Anitha\\Downloads\\chromedriver_v106\\chromedriver.exe");

HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

ChromeOptions options=new ChromeOptions();

options.setExperimentalOption("prefs", chromePrefs);

WebDriver driver=new ChromeDriver(options);

driver.get("https://smallpdf.com/pdf-to-jpg");

driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 ejRuwW']")).click();

Thread.sleep(3000);

Runtime.getRuntime().exec("C:\\Users\\Anitha\\Documents\\check\\Fileupload.exe");
//Thread.sleep(10000);

driver.findElement(By.xpath("(//div[@class='sc-1mszb21-1 cuYLAk'])[1]")).click();

WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));


wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='r5zwp6-3 jHcIvq'])[1]")));

driver.findElement(By.xpath("//span[@class='r5zwp6-3 jHcIvq'])[1]")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='r5zwp6-2 ghYfBB'])[2]")));

driver.findElement(By.xpath("(//div[@class='r5zwp6-2 ghYfBB'])[2")).click();

Thread.sleep(5000);

File f=new File(downloadPath+"/converted.zip");

if(f.exists())

{

Assert.assertTrue(f.exists());

if(f.delete())

System.out.println("file deleted");

}

}



}

