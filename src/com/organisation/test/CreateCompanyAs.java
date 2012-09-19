package com.organisation.test;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;

public class CreateCompanyAs {

	private Browser browser;

	public CreateCompanyAs(Browser browser) {
		this.browser = browser;
	}

	public void setUp(String company) throws Exception {
		//This method is executed before the scenario execution starts.
		browser.link("Companies").click();
		browser.link("New Company").click();
		browser.textbox("company[name]").setValue(company);
		browser.submit("Create Company").click();
	}

	public void tearDown(String string1) throws Exception {
		//This method is executed after the scenario execution finishes.
		browser.link("Companies").click();
		browser.link("Delete").click();
		browser.expectConfirm("Are you sure you want to delete this?", true);

	}

}
