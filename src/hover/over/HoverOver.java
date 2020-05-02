package hover.over;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.express.com/");

		WebElement Men = driver.findElement(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li[2]"));

		hoverOver(driver, Men);

		driver.findElement(By.xpath("//a[contains(text(),'Gifts for Him')]")).click();

		WebElement gift = driver.findElement(By.tagName("h1"));

		System.out.println(gift.getText());

		driver.quit();

	}

	public static void hoverOver(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);

		act.moveToElement(element).build().perform();

	}

}
