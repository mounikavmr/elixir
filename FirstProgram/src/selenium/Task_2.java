package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.DataBarFormatting;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path="C:\\Users\\lenovo\\book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		
		Workbook book= WorkbookFactory.create(file);
		String value= book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		String value1= book.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		String value2= book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value2);
		
		double num=book.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(num);

		
	}
		
	}


