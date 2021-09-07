package secondDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3mousehover {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.className("nav-action-inner")).click();
		Thread.sleep(2000);
		String expectedTitle="Amazon SignIn";
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title is : "+actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title matched");
		else
			System.out.println("Title not matching");
		driver.close();		
		
	}

}
