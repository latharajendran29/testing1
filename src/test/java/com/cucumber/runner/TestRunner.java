package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.test.BaseclassMaven;
import com.cucumber.listener.Reporter;
import com.helper.FileReadermanager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		
		//@TC_102,@TC_103,@TC_104,@TC_105,@TC_106,@TC_107,@TC_108,@TC_109,@TC_110,@TC_111,@TC_112,@TC_113,@TC_114,@TC_115,@TC_116,@TC_117,@TC_118,@TC_119,@TC_120
		features = "src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition" ,
tags= {"@TC_101,@TC_115"},
dryRun=false,strict=false,monochrome=true,plugin =  {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resources\\com\\adatinhotel\\reports\\extendreport.html"
,		
		
		"pretty",
		"html:src\\test\\resources\\com\\adatinhotel\\reports",
		"json:src\\test\\resources\\com\\adatinhotel\\reports\\reports.json",
		"junit:src\\test\\resources\\com\\adatinhotel\\reports.xml"
})

public class TestRunner {
	

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Exception {
String browser=FileReadermanager.getInstance().getCr().getBrowser();
driver=BaseclassMaven.getBrowser(browser);
	}

	@AfterClass
	public static void tearDoen() {
		//driver.quit();
	Reporter.loadXMLConfig(new File("C:\\Users\\navin\\eclipse-workspace\\Adatcin\\src\\test\\resources\\com\\configxml\\extend-config.xml"));
	}
	

}
