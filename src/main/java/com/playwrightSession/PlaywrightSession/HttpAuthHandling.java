package com.playwrightSession.PlaywrightSession;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HttpAuthHandling {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setHttpCredentials("admin","admin"));
		Page page = browserContext.newPage();
		
		page.navigate("https://the-internet.herokuapp.com/basic_auth");
		System.out.println(page.locator("h3").textContent());
		System.out.println(page.locator("p").textContent().trim());
		
		
		Page popup = page.waitForPopup(() -> {
			  page.click("a[target='_blank']");
			});
		popup.waitForLoadState();
		popup.navigate("https://www.amazon.in");
		
		Thread.sleep(5000);
		
		browser.close();
		playwright.close();
		
	}
}
