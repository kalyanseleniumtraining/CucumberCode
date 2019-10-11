package inheritanceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.convertfiles.com/");
		driver.findElement(By.name("uploadedfile")).click();
		
		Runtime.getRuntime().exec("cmd /C C:\\Users\\S@f'\\Desktop\\githibCode\\Upload.exe");
		
		
		
		
	}

}
