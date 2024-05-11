package CuraHealthQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomepageBase {
	

//	Declaration
	
	@FindBy (xpath="//div[@class='text-vertical-center']//h1") private WebElement heading;
	@FindBy (xpath="//div[@class='text-vertical-center']//h3") private WebElement subheading;
	@FindBy (xpath="//a[@id='btn-make-appointment']") private WebElement makeappointmentbtn;
	@FindBy (xpath="//input[@name='username']") private WebElement loginfield;
	@FindBy (xpath="//input[@name='password']") private WebElement passwordfield;
	@FindBy (xpath="//button[@id='btn-login']") private WebElement loginbtn;
	@FindBy (xpath="//select[@class='form-control']") private WebElement dropdown;
	@FindBy (xpath="//label[@class='checkbox-inline']") private WebElement checkbox;
	@FindBy (xpath="//input[@id='radio_program_none']") private WebElement healthcarebtn;
	@FindBy (xpath="//input[@name='visit_date']") private WebElement calendar;
	@FindBy (xpath="//textarea[@name='comment']") private WebElement commentbox;
	@FindBy (xpath="//button[@id='btn-book-appointment']") private WebElement appointmentbtn;
	@FindBy (xpath="//a[@class='btn btn-default']") private WebElement homepagebtn;

	
//	Initialization
	
	public HomepageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	Usage
	public void MainHeadingVerification() {
		String Actualheading = "CURA Healthcare Service";
		Assert.assertEquals(heading.getText(), Actualheading);
	}
	
	public void SubHeadingVerification() {
		String Actualsubheading = "We Care About Your Health";
		Assert.assertEquals(subheading.getText(), Actualsubheading);
	}
	
	public void MakeAppointmentButtonVerification() {
		Assert.assertTrue(makeappointmentbtn.isDisplayed(),"Appointment");
		Assert.assertTrue(makeappointmentbtn.isEnabled());
		makeappointmentbtn.click();
	}
	
	public void LoginFieldVerification() {
	    Assert.assertTrue(loginfield.isEnabled());
		loginfield.sendKeys("John Doe");
	}
	
	public void PasswordFieldVerification() {
		Assert.assertTrue(passwordfield.isEnabled());
		passwordfield.sendKeys("ThisIsNotAPassword");
	}
	
	public void LoginButtonVerification() {
		Assert.assertTrue(loginbtn.isEnabled());
		loginbtn.click();
	}

	public void DropdonVerification() {
		Assert.assertTrue(dropdown.isEnabled());
		dropdown.click();
		Select f = new Select(dropdown);
		f.selectByVisibleText("Hongkong CURA Healthcare Center");
		dropdown.click();
	}
	
	public void CheckBoxVerification() {
		Assert.assertTrue(checkbox.isEnabled());
		checkbox.click();	
	}
	
	public void HealthCareButtonVerification() {
		Assert.assertTrue(healthcarebtn.isEnabled());
		healthcarebtn.click();
	}
	
	public void CalendarVerification() {
		calendar.sendKeys("01/02/2024");
	}
	
	public void CommentBoxVerification() {
		Assert.assertTrue(commentbox.isDisplayed());
		Assert.assertTrue(commentbox.isEnabled());
		commentbox.click();
	}
	
	public void AppointmentVerification() {
		Assert.assertTrue(appointmentbtn.isEnabled());
		appointmentbtn.click();
		
	}
	
	public void HomepageButtonVerification() {
		Assert.assertTrue(homepagebtn.isDisplayed());
		homepagebtn.click();

	}
	
	
	
	
	
	
	
	
	
	

}
