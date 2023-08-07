package com.Actitim.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitim.GenericLibrary.FileLibrary;
import com.Actitim.GenericLibrary.baseclass;
import com.ObjectRepository.Homepage;

public class Task extends baseclass{

	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		Homepage hp=new Homepage(driver);
		hp.getTaskbtn().click();
		
		TaskPage tp=new TaskPage(driver);
		tp.getNewbtn().click();
		tp.getNewcust().click();
		
		FileLibrary f=new FileLibrary();
		String creatcustmer = f.readdatafromexcel("Sheet1", 1, 2);
		tp.getCustname().sendKeys(creatcustmer);
		String description = f.readdatafromexcel("Sheet1", 2, 1);
		tp.getDesctf().sendKeys(description);
		tp.getCustcrt().click();
		String expectedresult = creatcustmer;
		String actualresult = driver.findElement(By.xpath("//div[.='"+creatcustmer+"']")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualresult, expectedresult);
		s.assertAll();
	}
}
