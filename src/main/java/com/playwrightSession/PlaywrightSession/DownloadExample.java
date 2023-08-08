package com.playwrightSession.PlaywrightSession;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DownloadExample {
	
	public static void main(String[] args) throws InterruptedException {
	
	Playwright playwright = Playwright.create(); 		 
	 //Broswer Type
	 BrowserType browserType = playwright.chromium();
	
	  //Browser
	 Browser  browser = browserType.launch(new BrowserType.LaunchOptions().
			 setHeadless(false).setChannel("chrome")		 
			 );
	 
	 
	 Page page =  browser.newPage();
	 
	 page.navigate("https://demoqa.com/upload-download");
	 
	 Download download = page.waitForDownload(() -> {
		    // Perform the action that initiates download
		    page.locator("#downloadButton").click();
		});
	 
	 System.out.println(download.path().toString());
	 
	 System.out.println("Suggested File Name : "+download.suggestedFilename());
	 
	 System.out.println(" URL : " + download.url());
	 
	 download.saveAs(Paths.get("images/ABC.png"));
	 
	}
}
