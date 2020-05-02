package window.handle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeOne {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://phptravels.com/");

		// click the target element or log in element.
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));

		login.click();

		// // here we will get all window.
		Set<String> mainWindow = driver.getWindowHandles();

		Iterator<String> itr = mainWindow.iterator();

		String parentWindow = itr.next();

		String chidWindow = itr.next();

		driver.switchTo().window(chidWindow);

		WebElement email = driver.findElement(By.id("inputEmail"));

		email.sendKeys("borson");

		driver.findElement(By.xpath("//input[@id='login']"));

		driver.close();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.linkText("Demo")).click();

		// driver.quit();
	}

}
