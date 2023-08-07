package com.Actitim.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ObjectRepository.Homepage;
import com.ObjectRepository.Loginpage;

public class baseclass {
	public static WebDriver driver;
    @BeforeSuite
	public void databaseconnection() {
    	Reporter.log("database connected",true);
    }
    @BeforeTest 
    public void launchbrowser() {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demo.actitime.com/login.do");
    	Reporter.log("browser is launched",true);
    }
    @BeforeMethod
    public void loginactitime() {
    	Loginpage lp=new Loginpage(driver);
    	lp.getUntf().sendKeys("admin");
    	lp.getPwtf().sendKeys("manager");
    	lp.getLoginbutn().click();
    	Reporter.log("login is done",true);
    }
    @AfterMethod
    public void logedout(){
    	Homepage hp=new Homepage(driver);
    	hp.getLobtn().click();
    	Reporter.log("loged out successful",true);
    }
    @AfterTest
    public void closebrowser() {
    	driver.close();
    	Reporter.log("browser closed successful",true);
    }
    @AfterSuite
    public void databasedisconnected() {
    	Reporter.log("database dissconnect is successful",true);
    }
}
