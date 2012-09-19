package com.organisation.test;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;

public class CreateCityAs {

	private Browser browser;

	public CreateCityAs(Browser browser) {
		this.browser = browser;
	}

	public void setUp(String city, String citycode) throws Exception {
		//This method is executed before the scenario execution starts.
		browser.link("Cities").click();
		browser.link("New City").click();
		browser.select("city[country_id]").choose("Unknown");
		browser.textbox("city[name]").setValue(city);
		browser.textbox("city[code]").setValue(citycode);
		browser.submit("Create City").click();
	}

	public void tearDown(String string1, String string2) throws Exception {
		//This method is executed after the scenario execution finishes.
		browser.link("Cities").click();
		browser.link("Delete").click();
		browser.expectConfirm("Are you sure you want to delete this?", true);

	}

}
