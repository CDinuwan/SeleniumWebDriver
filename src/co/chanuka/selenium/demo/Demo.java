package co.chanuka.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chanuka Dinuwan\\Desktop\\Automation\\Auto Help\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("hecdinuwan@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		String at=driver.getTitle();
		String et="gmail";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successfull");
		}else {
			System.out.println("Test Failure");
		}
	}

}
