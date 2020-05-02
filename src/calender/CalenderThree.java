package calender;

import java.util.List;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderThree {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.expedia.com/");

		WebElement to = driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));

		to.sendKeys("KL");

		List<WebElement> toList = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));

		for (int i = 0; i < toList.size(); i++) {

			WebElement element = toList.get(i);

			String text = element.getText();

			if (text.contains("Kuala Lumpur, Malaysia (KUL-Kuala Lumpur Intl.) (KL International Airport)")) {

				element.click();
				break;
			}

		}

		driver.quit();

	}
}