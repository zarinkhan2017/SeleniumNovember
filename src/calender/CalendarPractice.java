package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarPractice {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.cheapoair.com/");

		WebElement from = driver.findElement(By.xpath("//input[@class='form-control pr-4'][1]"));

		from.sendKeys("j");

		List<WebElement> placeSize = driver
				.findElements(By.xpath("//div[@class='suggestion-box__content is-visible']"));

		for (int i = 0; i < placeSize.size(); i++) {

			if (placeSize.get(i).getText().contains("JFK")) {

				placeSize.get(i).click();
				break;
			}

		}

		driver.quit();
	}
}
