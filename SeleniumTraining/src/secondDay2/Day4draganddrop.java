package secondDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4draganddrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable//");
		Thread.sleep(3000);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		System.out.println(driver.findElement(By.id("draggable")).getText());
		WebElement vDrag=driver.findElement(By.id("draggable"));
		WebElement vDrop=driver.findElement(By.id("droppable"));
		Actions act=new Actions (driver);
		act.dragAndDrop(vDrag, vDrop).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		String dragTitle=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Title is :"+dragTitle);
		
		driver.quit();
	}

}
