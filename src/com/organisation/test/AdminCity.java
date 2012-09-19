package com.organisation.test;

// JUnit Assert framework can be used for verification

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import net.sf.sahi.client.Browser;

public class AdminCity {

	private Browser browser;

	public AdminCity(Browser browser) {
		this.browser = browser;
	}

	public void whenIProvideCityNameAs(String city) throws Exception {
		browser.textbox("city[name]").setValue(city);
	
	}

	public void whenIProvideCityCodeAs(String citycode) throws Exception {
		browser.textbox("city[code]").setValue(citycode);
	
	}

	public void thenIShouldSeeAsCity(String string1) throws Exception {
		assertTrue(browser.cell(string1).exists());
	}

	public void whenISelectForCity(String string1)
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

	public void thenIShouldNotSeeAsCity(String string1) throws Exception {
		assertFalse(browser.cell(string1).exists());
		
	}

	public void whenIPickCountry(String country) throws Exception {
		browser.select("city[country_id]").choose(country);
	}

}
