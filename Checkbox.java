package house;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","K:\\Java\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/saramili/Desktop/table.html");
		List<WebElement> elements=driver.findElements(By.cssSelector("input[type='checkbox']"));
		int size=elements.size();
		for(int i=0;i<size;i++)
		{
			WebElement checkbox=elements.get(i);
			boolean status=checkbox.isSelected();
			if(status==false)
			{
				checkbox.click();
				
			}
			
					
		}
	}

}
