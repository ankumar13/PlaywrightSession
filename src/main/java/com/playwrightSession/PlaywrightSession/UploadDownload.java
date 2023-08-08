package com.playwrightSession.PlaywrightSession;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class UploadDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create(); 		 
		 //Broswer Type
		 BrowserType browserType = playwright.chromium();
		
		  //Browser
		 Browser  browser = browserType.launch(new BrowserType.LaunchOptions().
				 setHeadless(false).setChannel("chrome")		 
				 );
		 
		 
		 Page page =  browser.newPage();
		 
		 page.navigate("https://demoqa.com/upload-download");
		 // upload one file
		page.locator("#uploadFile").setInputFiles(Paths.get("FullPage.png"));
		 
		 // for multiple uploads
		// page.locator("#uploadFile").
		// setInputFiles(new Path[] {Paths.get("FullPage.png"), Paths.get("LocatorScreenshot.png")});
		 Thread.sleep(3000);
		 
		page.locator("#uploadFile").setInputFiles(new Path[0]);
		
		//page.locator("#uploadFile").setInputFiles(new FilePayload("", "", "This is text".getBytes(StandardCharsets.)))
		
		 Thread.sleep(2000);
		 
		 page.close();
		 
		 playwright.close();
		 
	}

}
