package myprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.whiteboxqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		WebElement resources=driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/a"));
		action.moveToElement(resources).perform();
		System.out.println("done mouse over on resources element");
		
		WebElement suboption=driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/ul/li[2]/a"));
		action.moveToElement(suboption).perform();
		suboption.click();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("maddiralakaveri@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("344656");
		driver.findElement(By.id("login")).click();
		WebElement book=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/aside/section/ul/div/a[6]"));
		action.moveToElement(book).perform();
		book.click();
		WebElement jmeterbook=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[7]/div/div/div/div/table/tbody/tr[4]/td[2]/a"));
		action.moveToElement(jmeterbook).perform();
		jmeterbook.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
		
		System.out.println("mouse over on presentations element");
		
		
		
	}

}
