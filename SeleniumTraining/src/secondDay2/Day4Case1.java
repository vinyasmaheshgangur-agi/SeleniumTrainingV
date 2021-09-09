package secondDay2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Case1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
		System.out.println("Title is:"+driver.getTitle());
		//clicking on Help
		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-GB']")).click();
		Set<String> wIDs=driver.getWindowHandles();
		//System.out.println(wIDs);
		//Choose the Window IDs and switch to the necessary window
		Iterator<String> wIt=wIDs.iterator();
		String parentID=wIt.next();
		String childID=wIt.next();
		driver.switchTo().window(childID);
		System.out.println("Title is:"+driver.getTitle());
		Thread.sleep(3000);	
		//[CDwindow-8E5EAF2FB29B7B6E457C69BDBC221D78, CDwindow-8A635AA33EFA0E080DA4BC5B7E02B5AF]
				
		driver.quit();
	}

}
