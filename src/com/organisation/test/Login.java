package com.organisation.test;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;
import static junit.framework.Assert.*;

public class Login {

	private Browser browser;

	public Login(Browser browser) {
		this.browser = browser;
	}

	public void givenIAmOnAdminHomePage() throws Exception {
		browser.navigateTo("http://dont-panic.herokuapp.com/admin/login");
	}

	public void whenIProvideUsername(String username) throws Exception {
		browser.emailbox("admin_user[email]").setValue(username);
	
	}

	public void whenIProvidePassword(String pwd) throws Exception {
		browser.password("admin_user[password]").setValue(pwd);
	
	}

	public void whenISelect(String string1) throws Exception {
		browser.submit(string1).click();
		
	
	}

	public void thenIAmLoggedInAs(String string1) throws Exception {
		assertTrue(browser.div("Signed in successfully.").exists());
		assertTrue(browser.span(string1).exists());
	}

	public void whenISelectLogout() throws Exception {
		browser.link("Logout").click();
	}

	

}
