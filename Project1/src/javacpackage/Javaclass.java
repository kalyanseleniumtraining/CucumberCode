package javacpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Javaclass {

	public static FirefoxProfile openProfile(String profileName) {
		ProfilesIni ini = new ProfilesIni();
		FirefoxProfile fp = ini.getProfile(profileName);
		return fp;
	}

	public static void main(String[] args) {

		

		WebDriver driver = new FirefoxDriver(Javaclass.openProfile("nihar"));

		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		driver.get("http://amazon.in");

		driver.navigate().back();

		driver.navigate().forward();

		driver.quit();

	}

}
