package com.Actitim.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	//declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement newbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement desctf;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement custcrt;
	
	@FindBy(xpath = "(//div[.='Cancel'])[26]")
	private WebElement canclbtn;
	
	//initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	
		public WebElement getNewbtn() {
			return newbtn;
		}

		public WebElement getNewcust() {
			return newcust;
		}

		public WebElement getCustname() {
			return custname;
		}

		public WebElement getDesctf() {
			return desctf;
		}

		public WebElement getCustcrt() {
			return custcrt;
		}

		public WebElement getCanclbtn() {
			return canclbtn;
		}
}
