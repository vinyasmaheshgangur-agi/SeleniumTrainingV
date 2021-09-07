package secondDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java_training\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("food")).sendKeys("200");
		driver.findElement(By.id("clothing")).sendKeys("250");
		driver.findElement(By.id("shelter")).sendKeys("150");
		driver.findElement(By.id("monthlyPay")).sendKeys("750");
		Thread.sleep(5000);
		
		String tMoneyExpenses=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String tMoneyIncome=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		String uOverBudget=driver.findElement(By.id("underOverBudget")).getAttribute("value");
		System.out.println("Monthly Expenses :"+tMoneyExpenses);
		System.out.println("Monthly Income :"+tMoneyIncome);
		System.out.println("Monthly Income :"+uOverBudget);
		driver.close();
	    	
	}

}
