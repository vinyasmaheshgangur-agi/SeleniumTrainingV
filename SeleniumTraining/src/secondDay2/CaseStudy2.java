package secondDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@data-ved='0ahUKEwiw0r-38OryAhVWWX0KHfP0CvsQ39UDCAQ']")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(3000);
		String sValue=driver.findElement(By.name("q")).getText();
		if (sValue.contentEquals("Selenium"))
		{
			System.out.println("PASS: Navigated to the Required Page");
			System.out.println("PASS: Search Engine works as expected");
		}
		else
		{
			{
				System.out.println("Fail");
			}
		}
		String sTime=driver.findElement(By.xpath("//div[@id="appbar"]/div[4]/nobr")).getText();
		System.out.println("Time taken is :"+sTime);
		driver.close();
		
		
		
		
	}

}
