/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service.http;

import com.liferay.portal.service.GroupServiceUtil;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * <a href="GroupServiceJSON.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class GroupServiceJSON {
	public static JSONObject addGroup(java.lang.String name,
		java.lang.String description, java.lang.String type,
		java.lang.String friendlyURL, boolean active)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		com.liferay.portal.model.Group returnValue = GroupServiceUtil.addGroup(name,
				description, type, friendlyURL, active);

		return GroupJSONSerializer.toJSONObject(returnValue);
	}

	public static void addRoleGroups(java.lang.String roleId, long[] groupIds)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		GroupServiceUtil.addRoleGroups(roleId, groupIds);
	}

	public static void deleteGroup(long groupId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		GroupServiceUtil.deleteGroup(groupId);
	}

	public static JSONObject getGroup(long groupId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		com.liferay.portal.model.Group returnValue = GroupServiceUtil.getGroup(groupId);

		return GroupJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject getGroup(java.lang.String companyId,
		java.lang.String name)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		com.liferay.portal.model.Group returnValue = GroupServiceUtil.getGroup(companyId,
				name);

		return GroupJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONArray getOrganizationsGroups(java.util.List organizations)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		java.util.List returnValue = GroupServiceUtil.getOrganizationsGroups(organizations);

		return GroupJSONSerializer.toJSONArray(returnValue);
	}

	public static JSONArray getUserGroupsGroups(java.util.List userGroups)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		java.util.List returnValue = GroupServiceUtil.getUserGroupsGroups(userGroups);

		return GroupJSONSerializer.toJSONArray(returnValue);
	}

	public static boolean hasUserGroup(java.lang.String userId, long groupId)
		throws com.liferay.portal.SystemException, java.rmi.RemoteException {
		boolean returnValue = GroupServiceUtil.hasUserGroup(userId, groupId);

		return returnValue;
	}

	public static JSONArray search(java.lang.String companyId,
		java.lang.String name, java.lang.String description,
		java.lang.String[] params, int begin, int end)
		throws com.liferay.portal.SystemException, java.rmi.RemoteException {
		java.util.List returnValue = GroupServiceUtil.search(companyId, name,
				description, params, begin, end);

		return GroupJSONSerializer.toJSONArray(returnValue);
	}

	public static int searchCount(java.lang.String companyId,
		java.lang.String name, java.lang.String description,
		java.lang.String[] params)
		throws com.liferay.portal.SystemException, java.rmi.RemoteException {
		int returnValue = GroupServiceUtil.searchCount(companyId, name,
				description, params);

		return returnValue;
	}

	public static void setRoleGroups(java.lang.String roleId, long[] groupIds)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		GroupServiceUtil.setRoleGroups(roleId, groupIds);
	}

	public static void unsetRoleGroups(java.lang.String roleId, long[] groupIds)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		GroupServiceUtil.unsetRoleGroups(roleId, groupIds);
	}

	public static JSONObject updateGroup(long groupId, java.lang.String name,
		java.lang.String description, java.lang.String type,
		java.lang.String friendlyURL, boolean active)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException, java.rmi.RemoteException {
		com.liferay.portal.model.Group returnValue = GroupServiceUtil.updateGroup(groupId,
				name, description, type, friendlyURL, active);

		return GroupJSONSerializer.toJSONObject(returnValue);
	}
}