package secondDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		int tlink=driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links on Google page: "+tlink);
		Thread.sleep(3000);
		int tbutton=driver.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("Total number of buttons: "+tbutton);
		Thread.sleep(5000);
		
		
		
		
		
	}

}
