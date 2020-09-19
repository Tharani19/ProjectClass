package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tuxian\\eclipse-workspace\\BrowserLaunch\\div\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tuxian\\eclipse-workspace\\BrowserLaunch\\div\\chromedriver.exe");
		WebDriver chro=new ChromeDriver();
		chro.manage().window().maximize();
		chro.get("http://www.greenstechnologys.com/");
		chro.get("https://www.facebook.com/");
		chro.get("https://www.amazon.in");
		chro.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\tuxian\\eclipse-workspace\\BrowserLaunch\\div\\IEDriverServer.exe");
		WebDriver expo=new InternetExplorerDriver();
		expo.manage().window().maximize();
		expo.get("http://www.greenstechnologys.com/");
		expo.get("https://www.facebook.com/");
		expo.get("https://www.amazon.in");
		expo.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		
		
	}

}
