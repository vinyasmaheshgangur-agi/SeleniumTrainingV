package secondDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4ParentandSibling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://www.youcandealwithit.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='header']/ul[2]/li[1]"));
		WebElement borrowerMenu=driver.findElement(By.xpath("//div[@id='header']/ul[2]/li[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(borrowerMenu);
		WebElement borrowerSubMenu=driver.findElement(By.xpath("//a[@href='/borrowers/calculators-and-resources/index.shtml']"));
		act.moveToElement(borrowerSubMenu);
		act.click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/borrowers/calculators-and-resources/calculators/index.shtml']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/borrowers/calculators-and-resources/calculators/budget-builder.shtml']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		String subTitle=driver.findElement(By.id("main")).getText();
		System.out.println("Title is: "+title);
		System.out.println("Sub title is :"+subTitle);
				
		driver.quit();
		
		
		
	}

}
