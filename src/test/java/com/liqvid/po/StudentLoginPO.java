package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.win32.WinDef.PVOID;

public class StudentLoginPO 
{
  WebDriver driver=null;
  public StudentLoginPO(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
//To verify EnglishEdge logo  
@FindBy(xpath="//img[@src='/learning/themes/notebook/images/logo.png']")
  private WebElement eleEnglishEdgeLogo;
  public WebElement getEleEnglishEdgeLogo()
  {
	  return eleEnglishEdgeLogo;
  }
//To verify Signin Text  
@FindBy(className="student-title")
  private WebElement eleSigninText;
  public WebElement getEleSigninText()
  {
	  return eleSigninText;
  }
//To verify Signin info  
@FindBy(xpath="//p[text()=' Please register and login with your username and password. ']")
  private WebElement eleSigninInfo;
  public WebElement getEleSigninInfo()
  {
	  return eleSigninInfo;
  }  
//To verify user name text
@FindBy(className="(//label[@class='control-label required'])[1]")
  private WebElement eleUserNameText;
  public WebElement getEleUserNameText()
  {
	  return eleUserNameText;
  }
//to verify username textbox 
@FindBy(id="LoginForm_username")
  private WebElement eleUserNameTextbox;
  public WebElement getEleUserNameTextbox()
  {
	  
	return eleUserNameTextbox;
  }
//To verify password text
@FindBy(xpath="(//label[@class='control-label required'])[2]")
  private WebElement elePasswordText;
  public WebElement getElePasswordText()
  {
	  return elePasswordText;
  } 
//To verify Password textbox 
@FindBy(id="LoginForm_password")
   private WebElement elePwTextbox;
   public WebElement getElePwTextbox()
   {
	   return elePwTextbox;
   }
//To verify Sign in textbox   
@FindBy(xpath="//input[@type='submit']")
  private WebElement eleSignbutton;
  public WebElement getEleSignbutton()
  {
	  
	return eleSignbutton;
  }
//To verify Forgot password link  
@FindBy(xpath="//small[.=' Forgot password?']")
  private WebElement eleForgotPwd;
  public WebElement getEleForgotPwd()
  {
	  return eleForgotPwd;
  }    
    
  
}
