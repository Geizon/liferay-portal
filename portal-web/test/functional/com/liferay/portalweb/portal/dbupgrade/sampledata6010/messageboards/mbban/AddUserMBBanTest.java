/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.dbupgrade.sampledata6010.messageboards.mbban;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddUserMBBanTest extends BaseTestCase {
	public void testAddUserMBBan() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForElementPresent("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Users", RuntimeVariables.replace("Users"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Add", RuntimeVariables.replace("Add"));
		selenium.waitForPageToLoad("30000");
		selenium.type("//input[@name='_125_screenName']",
			RuntimeVariables.replace("mbbansn"));
		selenium.type("//input[@name='_125_emailAddress']",
			RuntimeVariables.replace("mbban@liferay.com"));
		selenium.type("//input[@name='_125_firstName']",
			RuntimeVariables.replace("mbbanfn"));
		selenium.type("//input[@name='_125_middleName']",
			RuntimeVariables.replace("mbbanmn"));
		selenium.type("//input[@name='_125_lastName']",
			RuntimeVariables.replace("mbbanln"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request processed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals("mbbansn",
			selenium.getValue("//input[@name='_125_screenName']"));
		assertEquals("mbban@liferay.com",
			selenium.getValue("//input[@name='_125_emailAddress']"));
		assertEquals("mbbanfn",
			selenium.getValue("//input[@name='_125_firstName']"));
		assertEquals("mbbanmn",
			selenium.getValue("//input[@name='_125_middleName']"));
		assertEquals("mbbanln",
			selenium.getValue("//input[@name='_125_lastName']"));
	}
}