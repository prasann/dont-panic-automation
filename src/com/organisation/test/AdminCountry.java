package com.organisation.test;

// JUnit Assert framework can be used for verification
import static junit.framework.Assert.*;
import net.sf.sahi.client.Browser;

public class AdminCountry {

	private Browser browser;

	public AdminCountry(Browser browser) {
		this.browser = browser;
	}

	public void whenIProvideCountryNameAs(String country) throws Exception {
		browser.textbox("country[name]").setValue(country);
	
	}

	public void whenIProvideCountryCodeAs(String countrycode) throws Exception {
		browser.textbox("country[code]").setValue(countrycode);
	
	}

	public void thenIShouldSeeAsCountry(String string1) throws Exception {
		assertTrue(browser.cell(string1).exists());
	}

	public void whenISelectForCountry(String string1)
			throws Exception {
		browser.link(string1).click();
		browser.expectConfirm("Are you sure you want to delete this?", true);

	}

	public void whenISelect(String string1) throws Exception {
		browser.link(string1).click();
	
	}

	public void whenIChoose(String string1) throws Exception {
		browser.submit(string1).click();
	
	}

	public void thenIShouldNotSeeAsCountry(String string1) throws Exception {
		assertFalse(browser.cell(string1).exists());
		
	}

}
