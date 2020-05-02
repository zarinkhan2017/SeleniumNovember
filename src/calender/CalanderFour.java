package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderFour {
	
	public static void main(String []args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.com/");
		
		WebElement from = driver.findElement(By.id("package-origin-hp-package"));
		
		from.sendKeys("J");
		
		List<WebElement> fromList = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));

		for(int i=0;i<fromList.size();i++) {
			
			WebElement element = fromList.get(i);
			
			String place = element.getText();
			
			System.out.println(place);
			
			if(place.equalsIgnoreCase("New York, NY (JFK-John F. Kennedy Intl.)")) {
				
				element.click();
				break;
			}
					
		}
		
		
		driver.quit();
		
	}

}
