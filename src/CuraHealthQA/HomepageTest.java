package CuraHealthQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class HomepageTest {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome 123\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void CuraWebHomepageTest() {
		
		HomepageBase hpage = new HomepageBase(driver);
		hpage.MainHeadingVerification();
		hpage.SubHeadingVerification();
		hpage.MakeAppointmentButtonVerification();
		hpage.LoginFieldVerification();
		hpage.PasswordFieldVerification();
		hpage.LoginButtonVerification();
		hpage.DropdonVerification();
		hpage.CheckBoxVerification();
		hpage.HealthCareButtonVerification();
		hpage.CalendarVerification();
		hpage.CommentBoxVerification();
		hpage.AppointmentVerification();
		hpage.HomepageButtonVerification();
	}
	
}
