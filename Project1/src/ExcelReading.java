import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelReading {

	public void srchEbay(WebDriver driver, String srchValue, String dropDownValue, String expectedResult) {
		WebElement srchBox = driver.findElement(By.id("gh-ac"));
		srchBox.sendKeys(srchValue);
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(dropDownValue);

		WebElement srchBtn = driver.findElement(By.id("gh-btn"));
		srchBtn.click();
		if (driver.getTitle().equals(expectedResult)) {
			System.out.println(srchValue + " Page is opened");
		} else {
			System.out.println(srchValue + " Page not opened");
		}

	}

	public static void main(String[] args) throws Exception {

		ExcelReading obj = new ExcelReading();

		XSSFWorkbook wb = new XSSFWorkbook("Test.xlsx");
		XSSFSheet sh = wb.getSheet("Data");
		int rowCount = sh.getPhysicalNumberOfRows();// 3
		for (int i = 1; i < rowCount; i++) {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://ebay.com");
			String srchValue = sh.getRow(i).getCell(0).getStringCellValue();
			String dropdownValue = sh.getRow(i).getCell(1).getStringCellValue();

			String expectedResult = sh.getRow(i).getCell(2).getStringCellValue();

			obj.srchEbay(driver, srchValue, dropdownValue, expectedResult);

			driver.quit();
		}

//		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\S@f'\\Desktop\\kalyan\\Test.xlsx");
//		XSSFSheet sh = wb.getSheet("Data");
//
//		int rowCount = sh.getPhysicalNumberOfRows();
//
//		for (int i = 0; i < rowCount; i++) {
//
//			int colcount = sh.getRow(i).getPhysicalNumberOfCells();
//
//			for (int j = 0; j < colcount; j++) {
//				String value = sh.getRow(i).getCell(j).getStringCellValue();
//				System.out.println(value);
//			}
//		}

	}

}
