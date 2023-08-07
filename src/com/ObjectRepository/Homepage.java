package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {


//declaration
@FindBy(xpath = "//div[.='Tasks']")
private WebElement taskbtn;

@FindBy(xpath = "//div[.='Reports']")
private WebElement reportbtn;

@FindBy(xpath = "//div[.='Users']")
private WebElement userbtn;

@FindBy(linkText = "Logout")
private WebElement lobtn;

//initialization

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
//utilization
public WebElement getTaskbtn() {
	return taskbtn;
}

public WebElement getReportbtn() {
	return reportbtn;
}

public WebElement getUserbtn() {
	return userbtn;
}

public WebElement getLobtn() {
	return lobtn;
}
    
}
