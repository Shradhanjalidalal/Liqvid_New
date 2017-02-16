package com.liqvid.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.library.BaseLib;
import com.liqvid.library.GenericLib;
import com.liqvid.po.StudentCoursePo;
import com.liqvid.po.StudentLoginPO;
import com.thoughtworks.selenium.FlashSelenium;



public class Student_SampleTest extends BaseLib
{
   StudentCoursePo studentCoursePo=null;
   StudentLoginPO studentLoginPO=null;
   
   @Test(priority=1,enabled=true, description="To Verify the display of Elements in Course Page")
	public void displayOfElementsinLoginPage() throws Exception
	{
	   studentLoginPO=new StudentLoginPO(driver);
	   studentCoursePo=new StudentCoursePo(driver);
	   try
	   {

		   loadURL(GenericLib.getCongigValue(GenericLib.sConfigFile,"REGISTRATIONURL"));
		   studentCoursePo.Login(GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTLOGINID"),GenericLib.getCongigValue(GenericLib.sConfigFile, "STUDENTPASSWORD"));
		   visibilityOfElementWait(studentLoginPO.getEleSignbutton(),"SignIn button");
		   studentLoginPO.getEleSignbutton().sendKeys(Keys.ENTER);;
		   Thread.sleep(8000);
		   elementStatus(studentCoursePo.getEleCourseIcon(),"Course Icon","displayed");
		   elementStatus(studentCoursePo.getEleCourseTab(),"Course Tab","enabled");
		   Thread.sleep(2000);
		   studentCoursePo.getEleCourseIcon().click();
		   elementStatus(studentCoursePo.getEleInstructionText(),"Instruction","displayed");
		   elementStatus(studentCoursePo.getEleStepText(),"Step Text","displayed");
		   elementStatus(studentCoursePo.getEleStep1Circle(),"Step Number","displayed");
		   elementStatus(studentCoursePo.getEleBatchText(),"Batch Text ","displayed");
		   Thread.sleep(5000);
		   elementStatus(studentCoursePo.getEleClass(),"Class From Batchlist","enabled");
		   studentCoursePo.getEleClass().click();
		   elementStatus(studentCoursePo.getEleCourseText(),"Course Text", "displayed");
		   Thread.sleep(2000);
		   elementStatus(studentCoursePo.getEleCourseSelected(),"Course Selected","enabled");
		   studentCoursePo.getEleCourseSelected().click();
		   elementStatus(studentCoursePo.getEleStartCourseButton(),"Start course","enabled");
		   studentCoursePo.getEleStartCourseButton().sendKeys(Keys.ENTER);
		   driver.findElements(By.tagName("iframe")).size();
		   driver.switchTo().frame(0); 
		   elementStatus(studentCoursePo.getElePreAssessmentLink(),"PreAssessmentlink","enabled");
		   
		   studentCoursePo.getElePreAssessmentLink().sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		  System.out.println(driver.findElement(By.tagName("object")));
		   List<WebElement> objects = driver.findElements(By.xpath("//iframe[@id='iframes']//object[@id=contentObjectAssessment]"));
		   System.out.println(objects.size());
		   for(int i=0;i<=objects.size();i++){
			   System.out.println();
		   }
		   //String objectId = objects.get(0).getAttribute("id");
		  // WebDriver driver = getDriver();
		  // JavascriptExecutor js = (JavascriptExecutor) driver;
		   //String text = (String) js.executeScript("return (((document.getElementById('" + objectId + "')).contentDocument).getElementsByClassName('titleText')[0]).innerHTML");
		   //driver.switchTo().defaultContent();
		   elementStatus(studentCoursePo.getEleEnglishEdgeText(),"English Edge Text", "displayed");
		   elementStatus(studentCoursePo.getEleInstruction(),"Instruction", "displayed");
		   Thread.sleep(8000);
		   elementStatus(studentCoursePo.getEleStartTextButton(),"Start Test button", "enabled");
		   studentCoursePo.getEleStartTextButton().sendKeys(Keys.ENTER);
		   elementStatus(studentCoursePo.getEleClass1PreAssessmentText(),"PreAssmentText","displayed");
		   elementStatus(studentCoursePo.getEleAllTheBestText(),"All the best text", "displayed");
		   Thread.sleep(2000);
		   elementStatus(studentCoursePo. getEleStartTimeText(),"start time text", "displayed");
		   Thread.sleep(2000);
		   elementStatus(studentCoursePo.getEleEndTimeText(),"end time text", "displayed");
		   elementStatus(studentCoursePo.getElePreviousButton(),"previous button", "enabled");
		   elementStatus(studentCoursePo.getEleRecentPageNumber(),"page number", "displayed");
		   Thread.sleep(4000);
		   //Calling the method
           studentCoursePo.radiobutton();
		   elementStatus(studentCoursePo. getEleFinishText(),"finish text", "displayed");
		   elementStatus(studentCoursePo.getEleFinishInstruction(),"finish instruction", "displayed");
		   elementStatus(studentCoursePo.getEleScoreText(),"score","displayed");
		   elementStatus(studentCoursePo.getEleFinishbutton(),"finish button","enabled");
		   studentCoursePo.getEleFinishbutton().click();
		   elementStatus(studentCoursePo.getEleBackButton(),"back button","enabled");
		   studentCoursePo.getEleBackButton().click();
		   Thread.sleep(2000);
		  
//		   elementStatus(studentCoursePo. getElespeaker(),"speaker", "enabled");
	
		 
	   }
	   catch(AssertionError e)
	   {
            NXGReports.addStep("Testcase FAiled.", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
	   }
	}
   
	
}
