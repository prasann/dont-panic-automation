package com.organisation.test;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;

public class CreateCountryAs {

	private Browser browser;

	public CreateCountryAs(Browser browser) {
		this.browser = browser;
	}

	public void setUp(String string1, String string2) throws Exception {
		//This method is executed before the scenario execution starts.
		browser.link("Countries").click();
		browser.link("New Country").click();
		browser.textbox("country[name]").setValue(string1);
		browser.textbox("country[code]").setValue(string2);
		browser.submit("Create Country").click();
	}

	public void tearDown(String string1, String string2) throws Exception {
		//This method is executed after the scenario execution finishes.
		browser.link("Countries").click();
		browser.link("Delete").click();
		browser.expectConfirm("Are you sure you want to delete this?", true);
	}

}
