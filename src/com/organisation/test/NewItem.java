package com.organisation.test;

// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;

public class NewItem {

	private Browser browser;

	public NewItem(Browser browser) {
		this.browser = browser;
	}

	public void setUp() throws Exception {
		//This method is executed before the scenario execution starts.
	}

	public void tearDown() throws Exception {
		//This method is executed after the scenario execution finishes.
	}

}
