package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSessions {


	private String baseUrl = "https://www.nextmd.com/ud2/Login/Login.aspx";
	
	@Test    
    public void executSessionOne(){
            //First session of WebDriver
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get(baseUrl);
		    
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys("Nkjune@1");
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys("Nkjune@1");	
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
    	WebDriver driver;
    	 WebDriverManager.firefoxdriver().setup();
	     driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get(baseUrl);
		    
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys("Nkjune@2");
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys("Nkjune@2");	
        
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
    	WebDriver driver;
    	WebDriverManager.iedriver().setup();
	     driver = new InternetExplorerDriver();
	     driver.manage().window().maximize();
	     driver.get(baseUrl);
		    
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtUserName")).sendKeys("Nkjune@3");
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$Login2$txtPassword")).sendKeys("Nkjune@3");	
        
        }        

}
