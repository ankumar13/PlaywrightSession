package com.playwrightSession.PlaywrightSession;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Sesssion5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 Playwright playwright = Playwright.create(); 		 
		 //Broswer Type
		 BrowserType browserType = playwright.chromium();
		
		  //Browser
		 Browser  browser = browserType.launch(new BrowserType.LaunchOptions().
				 setHeadless(false).setChannel("chrome")		 
				 );
		 
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("video/")));
		  
		 Page page =  browser.newPage();
		 
			/*
			 * page.onDialog(dialog -> {
			 * 
			 * String msg = dialog.message(); System.out.println(msg);
			 * dialog.accept("Hello there");});
			 * 
			 * page.navigate("https://demoqa.com/alerts");
			 * 
			 * page.click("#alertButton"); Thread.sleep(2000);
			 * 
			 * page.click("#confirmButton");
			 * 
			 * String confirmMsg = page.textContent("#confirmResult");
			 * System.out.println(confirmMsg); Thread.sleep(2000);
			 * 
			 * page.click("#promtButton");
			 * 
			 * 
			 * String promptMsg = page.textContent("#promptResult"); Thread.sleep(2000);
			 * System.out.println(promptMsg);
			 */
		 
		 
		 page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 
		 
		 Page popup = page.waitForPopup(() -> 
		 page.locator("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']").click()
				
				 );
		 
		 popup.locator("//button[@aria-label='Dismiss']").first().click();
		 //popup.getByLabel("Dismiss").first().click();
		 
		System.out.println("Popup Title is  :: " + popup.title());
		
		 popup.close();
		 
		 System.out.println("Page Title is :: " +page.title());
		 
		 page.close();
		 
		 playwright.close();

	}

}
