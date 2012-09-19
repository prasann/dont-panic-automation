package com.organisation.test;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;

public class LoginAsUser {

	private Browser browser;

	public LoginAsUser(Browser browser) {
		this.browser = browser;
	}

	public void setUp(String string1) throws Exception {
		//This method is executed before the scenario execution starts.
		browser.navigateTo("http://dont-panic.herokuapp.com/admin/login");
		browser.emailbox("admin_user[email]").setValue(string1);
		browser.password("admin_user[password]").setValue("password");
		browser.submit("Login").click();
	}

	public void tearDown(String string1) throws Exception {
		//This method is executed after the scenario execution finishes.
		browser.link("Logout").click();
	}

}