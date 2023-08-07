package com.Actitim.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
public String readdatafromepropertyfile(String key) throws IOException  {
	FileInputStream fis=new FileInputStream("./TestData/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	
}
public String readdatafromexcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis1=new FileInputStream("./TestData/Testdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis1);
	String valuee = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return valuee;
}
}
