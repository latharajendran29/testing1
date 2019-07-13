package com.helper;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.selenium.pom.Bookingconifrmpage;
import com.selenium.pom.HotelFirstTestcase;

import com.selenium.pom.HotellogingPage;
import com.selenium.pom.Selecthotelpage;




public class pageobjectmanager {
	public WebDriver driver;
	public pageobjectmanager(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
				}
	public HotellogingPage lp;
	public HotellogingPage getLp() {
		if(lp==null) {
			lp=new HotellogingPage(driver);
		}
		return lp;
	}
	
	public HotelFirstTestcase ft;
	
	public HotelFirstTestcase getFt() {
		if(ft==null) {
			ft=new HotelFirstTestcase(driver);
		}
		return ft;
	}
	

	public Selecthotelpage sp;
		
	public Selecthotelpage getSp() {
		if(sp==null) {
			sp=new Selecthotelpage(driver);
		}
		return sp;
	}
	
	public Bookingconifrmpage bp;
	public Bookingconifrmpage getBp() {
		if(bp==null) {
			bp=new Bookingconifrmpage(driver);
		}
		return bp;
	}
}
