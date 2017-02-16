package com.liqvid.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;
import com.liqvid.library.BaseLib;

public class StudentCoursePo {
	WebDriver driver = null;
	public StudentCoursePo(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//To verify course icon	
  @FindBy(xpath="//i[@class='fa fa-gears icon']")
   private WebElement eleCourseIcon;
   public WebElement getEleCourseIcon()
   {
	   return eleCourseIcon;
   }
//To verify course tab  
   @FindBy(xpath="//span[contains(text(),'Courses')]")
   private WebElement eleCourseTab;
   public WebElement getEleCourseTab()
   {
	   return eleCourseTab;
   }
//To verify instruction how to start   
   @FindBy(xpath="//p[contains(text(),'To start course perform following steps')]")
   private WebElement eleInstructionText;
   public WebElement getEleInstructionText()
   {
	   return eleInstructionText;
   }
//To verify step text
   @FindBy(xpath="(//div[text()='Step'])[1]")
   private WebElement eleStepText;
   public WebElement getEleStepText()
   {
	   return eleStepText;
   }
//To verify step 1 circle
   @FindBy(xpath="(//div[@class='timelineCircle'])[1]")
   private WebElement eleStep1Circle;
   public WebElement getEleStep1Circle()
   {
	   return eleStep1Circle;
   }
//To verify batch text
   @FindBy(xpath="//label[contains(text(),'Batch')]")
   private WebElement eleBatchText;
   public WebElement getEleBatchText()
   {
	   return eleBatchText;
   }
//To select class from batch list
   @FindBy(xpath="//option[@value='Class2~~1']")
   private WebElement eleClass;
   public WebElement getEleClass()
   {
	   return eleClass;
   }
//To verify course text
   @FindBy(xpath="//label[contains(text(),'Course')]")
   private WebElement eleCourseText;
   public WebElement getEleCourseText()
   {
	   return eleCourseText;
   }
//To verify course under course list
   @FindBy(xpath="//option[@value='crs2-wbt~~1']")
   private WebElement eleCourseSelected;
   public WebElement getEleCourseSelected()
   {
	   return eleCourseSelected;
   }
//To verify start course button
   @FindBy(xpath="//input[@value='Start Course']")
   private WebElement eleStartCourseButton;
   public WebElement getEleStartCourseButton()
   {
	   return eleStartCourseButton;
   }
//--------------------------------------------------------------------------------------------------------------   
//To verify Preassessment link
   @FindBy(xpath="//a[contains(text(),'Pre Assessment')]")
   private WebElement elePreAssessmentLink;
   public WebElement getElePreAssessmentLink()
   {
	   return elePreAssessmentLink;
   }
//To verify Mid1Assessment Link
   @FindBy(xpath="//a[contains(text(),'Mid-1 Assessment')]")
   private WebElement eleMid1AssessmentLink;
   public WebElement getEleMid1AssessmentLink()
   {
	   return eleMid1AssessmentLink;
   }
//To verify Mid2Assessment Link
   @FindBy(xpath="//a[contains(text(),'Mid-2 Assessment')]")
   private WebElement eleMid2AssessmentLink;
   public WebElement getEleMid2AssessmentLink()
   {
	   return eleMid2AssessmentLink;
   }
//To verify Meeting People Link
   @FindBy(xpath="//a[contains(text(),'Meeting People')]")
   private WebElement eleMeetingPeopleLink;
   public WebElement getEleMeetingPeopleLink()
   {
	   return eleMeetingPeopleLink;
   }
//To verify My Family/Relationships Link
   @FindBy(xpath="//a[contains(text(),'My Family/Relationships')]")
   private WebElement eleMyFamilyRelationshipsLink;
   public WebElement eleMyFamilyRelationshipsLink()
   {
	   return eleMyFamilyRelationshipsLink;
   }
//To verify Aksing Questions Link
   @FindBy(xpath="//a[contains(text(),'Aksing Questions')]")
   private WebElement eleAksingQuestionsLink;
   public WebElement getEleAksingQuestionsLink()
   {
	   return eleAksingQuestionsLink;
   }
//To verify Colours Around You/Things Around Us Link
   @FindBy(xpath="//a[contains(text(),'Colours Around You/Things Around Us')]")
   private WebElement eleColoursAroundYouThingsAroundUsLink;
   public WebElement getEleColoursAroundYouThingsAroundUs()
   {
	   return eleColoursAroundYouThingsAroundUsLink;
   }
//To verify Holiday Getaways/Describing Places Link
   @FindBy(xpath="//a[contains(text(),'Holiday Getaways/Describing Places')]")
   private WebElement eleHolidayGetawaysDescribingPlacesLink;
   public WebElement getEleHolidayGetawaysDescribingPlacesLink()
   {
	   return eleHolidayGetawaysDescribingPlacesLink;
   }
//To verify Home Sweet Home Link
   @FindBy(xpath="//a[contains(text(),'Home Sweet Home')]")
   private WebElement eleHomeSweetHomeLink;
   public WebElement getEleHomeSweetHomeLink()
   {
	   return eleHomeSweetHomeLink;
   }   
//To verify Its My Life Link
   @FindBy(xpath="//a[contains(text(),'Its My Life')]")
   private WebElement eleItsMyLifeLink;
   public WebElement getEleItsMyLifeLink()
   {
	   return eleItsMyLifeLink;
   } 
//To verify Food For Thought Link
   @FindBy(xpath="//a[contains(text(),'Food For Thought')]")
   private WebElement eleFoodForThoughtLink;
   public WebElement getEleFoodForThoughtLink()
   {
	   return eleFoodForThoughtLink;
   }    
//To verify Asking What People Do/Making Friends Link
   @FindBy(xpath="//a[contains(text(),'Asking What People Do/Making Friends')]")
   private WebElement eleAskingWhatPeopleDoMakingFriendsLink;
   public WebElement getEleAskingWhatPeopleDoMakingFriendsLink()
   {
	   return eleAskingWhatPeopleDoMakingFriendsLink;
   }    
//To verify Buying Things Link
   @FindBy(xpath="//a[contains(text(),'Buying Things')]")
   private WebElement eleBuyingThingsLink;
   public WebElement getEleBuyingThingsLink()
   {
	   return eleBuyingThingsLink;
   } 
//To verify At the Park/Whats Happening Link
   @FindBy(xpath="//a[contains(text(),'At the Park/Whats Happening')]")
   private WebElement eleAttheParkWhatsHappeningLink;
   public WebElement getEleAttheParkWhatsHappeningLink()
   {
	   return eleAttheParkWhatsHappeningLink;
   } 
//To verify Whos This? Link
   @FindBy(xpath="//a[contains(text(),'Whos This?')]")
   private WebElement eleWhosThisLink;
   public WebElement getEleWhosThisLink()
   {
	   return eleWhosThisLink;
   } 
//To verify Home Improvement/One And Many Link
   @FindBy(xpath="//a[contains(text(),'Home Improvement/One And Many')]")
   private WebElement eleHomeImprovementOneAndManyLink;
   public WebElement getElleHomeImprovementOneAndManyLink()
   {
	   return eleHomeImprovementOneAndManyLink;
   }     
//To verify The Calendar Link
   @FindBy(xpath="//a[contains(text(),'The Calendar')]")
   private WebElement eleTheCalendarLink;
   public WebElement getEleTheCalendarLink()
   {
	   return eleTheCalendarLink;
   }     
//To verify Time Gone By Link
   @FindBy(xpath="//a[contains(text(),'Time Gone By')]")
   private WebElement eleTimeGoneByLink;
   public WebElement getEleTimeGoneByLink()
   {
	   return eleTimeGoneByLink;
   }       
//To verify Know Your Planet Link
   @FindBy(xpath="//a[contains(text(),'Know Your Planet')]")
   private WebElement eleKnowYourPlanetLink;
   public WebElement getEleKnowYourPlanetLink()
   {
	   return eleKnowYourPlanetLink;
   }     
//To verify What Did You Do Link
   @FindBy(xpath="//a[contains(text(),'What Did You Do')]")
   private WebElement eleWhatDidYouDoLink;
   public WebElement getEleWhatDidYouDoLink()
   {
	   return eleWhatDidYouDoLink;
   }     
//To verify Going Places Link
   @FindBy(xpath="//a[contains(text(),'Going Places')]")
   private WebElement eleGoingPlacesLink;
   public WebElement getEleGoingPlacesLink()
   {
	   return eleGoingPlacesLink;
   }      
//To verify Dos and Dont Link
   @FindBy(xpath="//a[contains(text(),'Dos and Dont')]")
   private WebElement eleDosandDontLink;
   public WebElement getEleDosandDontLink()
   {
	   return eleDosandDontLink;
   }    
//To verify The Body in Action/The Body Link
   @FindBy(xpath="//a[contains(text(),'The Body in Action/The Body')]")
   private WebElement eleTheBodyinActionTheBodyLink;
   public WebElement getEleTheBodyinActionTheBodyLink()
   {
	   return eleTheBodyinActionTheBodyLink;
   }   
//To verify Better Than the Best Link
   @FindBy(xpath="//a[contains(text(),'Better Than the Best')]")
   private WebElement eleBetterThantheBestLink;
   public WebElement getEleBetterThantheBestLink()
   {
	   return eleBetterThantheBestLink;
   }   
//To verify Lesisure Time Link
   @FindBy(xpath="//a[contains(text(),'Lesisure Time')]")
   private WebElement eleLesisureTimeLink;
   public WebElement getEleLesisureTimeLink()
   {
	   return eleLesisureTimeLink;
   }    
//To verify A Look Into the Future/Talking About The Future Link
   @FindBy(xpath="//a[contains(text(),'A Look Into the Future/Talking About The Future')]")
   private WebElement eleALookIntotheFutureTalkingAboutTheFutureLink;
   public WebElement getEleALookIntotheFutureTalkingAboutTheFutureLink()
   {
	   return eleALookIntotheFutureTalkingAboutTheFutureLink;
   }   
//To verify How Do You Feel/Feelings Link
   @FindBy(xpath="//a[contains(text(),'How Do You Feel/Feelings')]")
   private WebElement eleHowDoYouFeelFeelingsLink;
   public WebElement getEleHowDoYouFeelFeelingsLink()
   {
	   return eleHowDoYouFeelFeelingsLink;
   }    
//To verify Nouns Link
   @FindBy(xpath="//a[contains(text(),'Nouns')]")
   private WebElement eleNounsLink;
   public WebElement getEleNounsLink()
   {
	   return eleNounsLink;
   }     
//To verify Indefinite Articles Link
   @FindBy(xpath="//a[contains(text(),'Indefinite Articles')]")
   private WebElement eleIndefiniteArticlesLink;
   public WebElement getEleIndefiniteArticlesLink()
   {
	   return eleIndefiniteArticlesLink;
   }     
//To verify The Definite Article Link
   @FindBy(xpath="//a[contains(text(),'The Definite Article')]")
   private WebElement eleTheDefiniteArticleLink;
   public WebElement getEleTheDefiniteArticleLink()
   {
	   return eleTheDefiniteArticleLink;
   }       
//To verify Adjectives Link
   @FindBy(xpath="//a[contains(text(),'Adjectives')]")
   private WebElement eleAdjectivesLink;
   public WebElement getEleAdjectivesLink()
   {
	   return eleAdjectivesLink;
   }     
//To verify The Present Tense Link
   @FindBy(xpath="//a[contains(text(),'The Present Tense')]")
   private WebElement eleThePresentTenseLink;
   public WebElement getEleThePresentTenseLink()
   {
	   return eleThePresentTenseLink;
   }   
//To verify The Past Tense Link
   @FindBy(xpath="//a[contains(text(),'The Past Tense')]")
   private WebElement eleThePastTenseLink;
   public WebElement getEleThePastTenseLink()
   {
	   return eleThePastTenseLink;
   }   
//To verify The Future Tense Link
   @FindBy(xpath="//a[contains(text(),'The Future Tense')]")
   private WebElement eleTheFutureTenseLink;
   public WebElement getEleTheFutureTenseLink()
   {
	   return eleTheFutureTenseLink;
   }   
//To verify Making Comparisons Link
   @FindBy(xpath="//a[contains(text(),'Making Comparisons')]")
   private WebElement eleMakingComparisonsLink;
   public WebElement getEleMakingComparisonsLink()
   {
	   return eleMakingComparisonsLink;
   }   
//To verify Space and Time Link
   @FindBy(xpath="//a[contains(text(),'Space and Time')]")
   private WebElement eleSpaceandTimeLink;
   public WebElement getEleSpaceandTimeLink()
   {
	   return eleSpaceandTimeLink;
   }     
//To verify More Prepositions Link
   @FindBy(xpath="//a[contains(text(),'More Prepositions')]")
   private WebElement eleMorePrepositionsLink;
   public WebElement getEleMorePrepositionsLink()
   {
	   return eleMorePrepositionsLink;
   }     
//To verify More of the Present Tense Link
   @FindBy(xpath="//a[contains(text(),'More of the Present Tense')]")
   private WebElement eleMoreofthePresentTenseLink;
   public WebElement getEleMoreofthePresentTenseLink()
   {
	   return eleMoreofthePresentTenseLink;
   }      
//To verify More About the Past Link
   @FindBy(xpath="//a[contains(text(),'More About the Past')]")
   private WebElement eleMoreAboutthePastLink;
   public WebElement getEleMoreAboutthePastLink()
   {
	   return eleMoreAboutthePastLink;
   }    
//To verify Back to the Future Link
   @FindBy(xpath="//a[contains(text(),'Back to the Future')]")
   private WebElement eleBacktotheFutureLink;
   public WebElement getEleBacktotheFutureLink()
   {
	   return eleBacktotheFutureLink;
   }   
//To verify Subject-Verb Agreement Link
   @FindBy(xpath="//a[contains(text(),'Subject-Verb Agreement')]")
   private WebElement eleSubjectVerbAgreementLink;
   public WebElement getEleSubjectVerbAgreementLink()
   {
	   return eleSubjectVerbAgreementLink;
   }
 //---------------------------------------------------------------------------------------------------------------------------------  
//To verify english edge text
   @FindBy(xpath="//h3[contains(text(),'English Edge Assessments')]")
   private WebElement eleEnglishEdgeText;
   public WebElement getEleEnglishEdgeText()
   {
	   return eleEnglishEdgeText;
   }
//To verify Instruction text
   @FindBy(xpath="//h1[contains(text(),'Instructions')]")
   private WebElement eleInstruction;
   public WebElement getEleInstruction()
   {
	   return eleInstruction;
   }
//To verify start text button
   @FindBy(xpath=".//*[contains(text(),'Start Test')]")
   private WebElement eleStartTextButton;
   public WebElement getEleStartTextButton()
   {
	   return eleStartTextButton;
   }
//To verify class1 pre assessment text
   @FindBy(xpath="//b[contains(text(),'Class 1 Pre Assessment')]")
   private WebElement eleClass1PreAssessmentText;
   public WebElement getEleClass1PreAssessmentText()
   {
	   return eleClass1PreAssessmentText;
   }
//To verify All the best text
   @FindBy(className="text-muted")
   private WebElement eleAllTheBestText;
   public WebElement getEleAllTheBestText()
   {
	   return eleAllTheBestText;
   }
//To verify test start time
   @FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[1]/div")
   private WebElement eleStartTimeText;
   public WebElement getEleStartTimeText()
   {
	   return eleStartTimeText;
   }
//To verify test end time
   @FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[2]/div")
   private WebElement eleEndTimeText;
   public WebElement getEleEndTimeText()
   {
	   return eleEndTimeText;
   }
//To verify previous button
   @FindBy(xpath="//button[@id='prebtn']")
   private WebElement elePreviousButton;
   public WebElement getElePreviousButton()
   {
	   return elePreviousButton;
   }
//To verify recent number
   @FindBy(id="quesCount")
   private WebElement eleRecentPageNumber;
   public WebElement getEleRecentPageNumber()
   {
	   return eleRecentPageNumber;
   }
//To verify page number out of total page
   @FindBy(id="showFinish")
   private WebElement elePageNumber;
   public WebElement getElePageNumber()
   {
	   return elePageNumber;
   }
//To verify next button
   @FindBy(xpath="(//div[@class='actions']/..//button)[2][contains(text(),'Next')]")
   private WebElement eleNextButton;
   public WebElement getEleNextButton()
   {
	   return eleNextButton;
   }
 
//To verify radio button
   @FindBy(xpath="(//span[contains(@id,'questionType')]/../div/label)[1]")
   private WebElement eleRaduioButton;
   public WebElement getEleRadioButton()
   {
	   return eleRaduioButton;
   }
//To verify finish text
   @FindBy(id="showFinish")
   private WebElement eleFinishText;
   public WebElement getEleFinishText()
   {
	   return eleFinishText;
   }
//To verify finish button
   @FindBy(xpath="//button[@id='netbtn']")
   private WebElement eleFinishbutton;
   public WebElement getEleFinishbutton()
   {
	   return eleFinishbutton;
    }
//To verify the instruction in last page
   @FindBy(id="completeText")
   private WebElement eleFinishInstruction;
   public WebElement getEleFinishInstruction()
   {
	   return eleFinishInstruction;
   }
//To verify score at the end 
   @FindBy(id="ram")
   private WebElement eleScoreText;
   public WebElement getEleScoreText()
   {
	   return eleScoreText;
   }
//To verify back button
   @FindBy(xpath="//button[@id='btnBack']")
   private WebElement eleBackButton;
   public WebElement getEleBackButton()
   {
	   return eleBackButton;
   }
//To verify speaker
   @FindBy(id="buttonDispElem134")
   private WebElement elespeaker;
   public WebElement getElespeaker()
   {
	   return elespeaker;
   }
   public void Login(String username,String password){
		BaseLib baselib=new BaseLib();
		StudentLoginPO studentLoginPO=new StudentLoginPO(driver);
			try
			{
				
				baselib.elementStatus(studentLoginPO.getEleUserNameTextbox(), "The Username text field","displayed");
				studentLoginPO.getEleUserNameTextbox().sendKeys(username);
				baselib.elementStatus(studentLoginPO.getElePwTextbox(), "The Password text field","displayed");
				studentLoginPO.getElePwTextbox().sendKeys(password);
				baselib.elementStatus(studentLoginPO.getEleSignbutton(), "The Sign in button","displayed");
				studentLoginPO.getEleSignbutton().click();
				
			
		}
			catch(Exception e)
			{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		    }
		}


public void radiobutton() throws InterruptedException
{
	   Thread.sleep(4000);
	   System.out.println(getEleRecentPageNumber().getText());
	   String pageNumber = getElePageNumber().getText().toString();
	   String totalpage = pageNumber.substring(5);
   int count = Integer.parseInt(totalpage);
   System.out.println("total page="+count);
   Thread.sleep(6000);
	   JavascriptExecutor j=(JavascriptExecutor) driver;
	   j.executeScript("window.scrollBy(0,1000)");
	    
	   for(int i=0;i<count;i++)
	   {
		   int k=i+1;
		   Thread.sleep(4000);

		   List<WebElement>RadioButton = driver.findElements(By.xpath("(//div[contains(@id,'step')])["+k+"]//div[@class='radio']//label"));
		   System.out.println("NO OF RADIOBUTTON="+RadioButton.size());
		   int a=1;
		   while(a<=RadioButton.size())
		   {
			  
			     System.out.println("----------------------------");
				 System.out.println("value of a="+a);
				 Thread.sleep(1000);
				 WebElement element=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+k+"]//div[@class='radio']//label[@class='radio-custom'])["+a+"]"));
				 System.out.println(element);
				 Thread.sleep(1000);
				 JavascriptExecutor js = (JavascriptExecutor)driver;
			   	  js.executeScript("arguments[0].click();", element);
				 a++;
		   }
		     System.out.println("----------------------------");
		     Thread.sleep(2000);
		     WebElement element1=driver.findElement(By.xpath("((//div[contains(@id,'step')])["+ k +" ]//div[@class='radio']//label[@class='radio-custom']//i[@class='fa fa-circle-o'])[1]"));
			 System.out.println(element1);
			 element1.click();
			 Thread.sleep(2000);
			 getEleNextButton().click();
	   }
	  
}


		   
		  

}

   

	


