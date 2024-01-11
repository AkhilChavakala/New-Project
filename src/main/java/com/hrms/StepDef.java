package com.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDef {
	public WebDriver driver;
	@Given ("^Open Application$")
	public void openApplication() {
		driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");
	}
	@When("^Verify Title$")
    public void verifyTitle()    {
        System.out.println("Verifying the Title");
	}
	@Then("^Close APplication$")
	public void closeApplication() {
		driver.quit();
		System.out.println("Login page should be shown");
	}
	@When("^Log into Application$")
	public void login() {
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login completed");
	}
    @When("^Logout of application$")
    public void logout() {
    driver.findElement(By.linkText("Logout")).click();
    System.out.println("Logout completed");
    }

}
