package com.playwrightSession.PlaywrightSession;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.firefox().launch(new LaunchOptions().setHeadless(false).setSlowMo(2000));
		
		Page page = browser.newPage();
		
		page.navigate("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		assertThat(page.locator("//h3[text()='Basic Auth']")).isVisible();
		
		page.close();
		
		playwright.close();
	}

}
