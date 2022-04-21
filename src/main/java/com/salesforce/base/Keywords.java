package com.salesforce.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;
public void open() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\i'm chinu\\Desktop\\mysql-connector-java-8.0.28\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	try {
		fis=new FileInputStream("D:\\Selenium\\project_work_\\src\\main\\java\\com\\salesforce\\base\\ObjectRepository.proporties");
	  prop = new Properties();
	  prop.load(fis);
	
	} catch (Exception e) {
		e.printStackTrace();
	}
}

     public void url(String httpurl) {
	driver.get(httpurl);
}

       public void input(String testData, String objectName) {
        driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
}

	public void click(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
	}

	public void closebrowser() {
        driver.close();		
	}

	public void inputbyname(String testData, String objectName) {
		driver.findElement(By.name(prop.getProperty(objectName))).sendKeys(testData);
	}
}
