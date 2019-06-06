package elementsReadingTest;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import elementsReading.Regristration;
import utility.ReadExcelData;

public class RegistrationTest {
	WebDriver driver;
	Regristration reg = new Regristration(driver);
	ReadExcelData red = new ReadExcelData();

	@BeforeMethod
	public void setUp() throws IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// driver.get("http://5elementslearning.com/demosite/create_account.php");
		driver.get(red.readExcel(1, 0, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
	}

	@Test(priority = 1, description = "User Registration for 5Elements and ATA conference")
	public void enterPersonelDetails() throws IOException {
		Regristration reg = new Regristration(driver);
		reg.selectGender();
		reg.firstName(red.readExcel(1, 1, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));

		reg.lastName(red.readExcel(1, 2, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.dateOfBirth(red.readExcel(1, 3, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.enterEmailId(red.readExcel(1, 4, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.companyName(red.readExcel(1, 5, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.streeAddr(red.readExcel(1, 6, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.enterSub(red.readExcel(1, 7, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.enterPostCode(red.readExcel(1, 8, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.enterCity(red.readExcel(1, 9, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.state(red.readExcel(1, 10, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.country(red.readExcel(1, 11, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.phoneNum(red.readExcel(1, 12, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.password(red.readExcel(1, 13, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.cpassword(red.readExcel(1, 14, ".\\GetExcelData\\DataForRegistration.xlsx", "sheet1"));
		reg.clickButton();

	}

	/*
	 * @Test(priority = 1) public void enterPersonelDetails() { Regristration reg =
	 * new Regristration(driver); reg.selectGender(); reg.firstName("random");
	 * reg.lastName("selection"); reg.dateOfBirth("10/06/1986");
	 * reg.enterEmailId("randomselection@gmail.com");
	 * reg.companyName("Random Solutions"); reg.enterSub("Mysore");
	 * reg.streeAddr("Gokulam 3rd Street"); reg.enterPostCode("800823");
	 * reg.enterCity("Mysore"); reg.state("Karnataka"); reg.country(4);
	 * reg.phoneNum("8008433122"); reg.password("1234random");
	 * reg.cpassword("1234random"); reg.clickButton();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 2, dependsOnMethods = "enterPersonelDetails") public void
	 * companyDetails() { Regristration reg = new Regristration(driver);
	 * reg.companyName("Random Solutions"); }
	 * 
	 * @Test(priority = 3, dependsOnMethods = "companyDetails") public void
	 * addressDetails() { Regristration reg = new Regristration(driver);
	 * reg.enterSub("Mysore"); reg.streeAddr("Gokulam 3rd Street");
	 * reg.enterPostCode("800823"); reg.enterCity("Mysore"); reg.state("Karnataka");
	 * reg.country("India");
	 * 
	 * }
	 * 
	 * @Test(priority = 4, dependsOnMethods = "addressDetails") public void
	 * contactDetails() { Regristration reg = new Regristration(driver);
	 * reg.phoneNum("8008433122"); }
	 * 
	 * @Test(priority = 5, dependsOnMethods = "contactDetails") public void
	 * setPassword() { Regristration reg = new Regristration(driver);
	 * reg.password("1234random"); reg.cpassword("1234random"); }
	 * 
	 * @Test(priority = 5, dependsOnMethods = "setPassword") public void
	 * clickContinueButton() { Regristration reg = new Regristration(driver);
	 * reg.clickButton(); }
	 */

	@AfterMethod
	public void close() {
		// driver.close();
	}
}
