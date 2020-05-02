package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarPracticeTwo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.expedia.com/");

		WebElement form = driver.findElement(By.id("package-origin-hp-package"));

		form.sendKeys("J");

		List<WebElement> airportList = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']//div"));

		for (int i = 0; i < airportList.size(); i++) {

			WebElement text = airportList.get(i);

			String textOne = text.getText();

			if (textOne.contains("New York, NY, United States (JFK - John F. Kennedy Intl.)")) {

				text.click();
				break;

			}

		}

		driver.quit();

	}
}