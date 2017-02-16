package com.liqvid.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataBase 
{
  public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("http://10.10.12.120:4001/admin/index.php");
	d.findElement(By.id("input_username")).sendKeys("root");
	d.findElement(By.id("input_password")).sendKeys("liqvid@123");
	d.findElement(By.id("input_go")).click();
	String winHandleBefore = d.getWindowHandle();
	for(String winHandle : d.getWindowHandles()){
	    d.switchTo().window(winHandle);
	}
	d.findElement(By.xpath("//a[@href='index.php?db=tesla_555&token=dd8a17486ac64de3e644419508b3249a']")).click();
}
}
