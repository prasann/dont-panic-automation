package com.organisation.test;

// JUnit Assert framework can be used for verification

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import net.sf.sahi.client.Browser;

public class AdminOffice {

	private Browser browser;

	public AdminOffice(Browser browser) {
		this.browser = browser;
	}

	public void whenIProvideOfficeNameAs(String office) throws Exception {
		browser.textbox("office[name]").setValue(office);
		
	}
	
	public void whenIProvideAddressAs(String address) throws Exception {
		browser.textarea("office[address]").setValue(address);
	}
	
	public void whenIProvideLongitudeAs(String longitude) throws Exception {
		browser.numberbox("office[longitude]").setValue(longitude);
	
	}
	
	public void whenIProvideLatitudeAs(String latitude) throws Exception {
		browser.numberbox("office[latitude]").setValue(latitude);
	
	}
	
//	public void whenIProvidePhoneAs(String phone) throws Exception {
//		browser.phonebox("office[phone_numbers]").setValue(phone);
	
//	}
	
	public void whenIProvideEmailAs(String email) throws Exception {
		browser.emailbox("office[email]").setValue(email);
	
	}
	public void thenIShouldSeeAsOffice(String string1) throws Exception {
		assertTrue(browser.cell(string1).exists());
	}

	public void whenISelectForOffice(String string1)
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

	public void thenIShouldNotSeeAsOffice(String string1) throws Exception {
		assertFalse(browser.cell(string1).exists());
		
	}

	public void whenIPickCompany(String company) throws Exception {
		browser.select("office[company_id]").choose(company);
	}
	
	public void whenIPickCity(String city) throws Exception {
		browser.select("office[city_id]").choose(city);
	}



}
