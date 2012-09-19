package com.organisation.test;

// JUnit Assert framework can be used for verification

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import net.sf.sahi.client.Browser;

public class AdminCompany {

	private Browser browser;

	public AdminCompany(Browser browser) {
		this.browser = browser;
	}

	public void whenIProvideCompanyNameAs(String company) throws Exception {
		browser.textbox("company[name]").setValue(company);
	
	}

	
	public void thenIShouldSeeAsCompany(String string1) throws Exception {
		assertTrue(browser.cell(string1).exists());
	}

	public void whenISelectForCompany(String string1)
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

	public void thenIShouldNotSeeAsCompany(String string1) throws Exception {
		assertFalse(browser.cell(string1).exists());
		
	}

}
