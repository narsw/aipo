/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2011 Aimluck,Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aimluck.eip.cayenne.om.social.auto;

/** Class _AppData was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _AppData extends org.apache.cayenne.CayenneDataObject {

    public static final String APP_ID_PROPERTY = "appId";
    public static final String KEY_PROPERTY = "key";
    public static final String LOGIN_NAME_PROPERTY = "loginName";
    public static final String VALUE_PROPERTY = "value";

    public static final String ID_PK_COLUMN = "ID";

    public void setAppId(String appId) {
        writeProperty("appId", appId);
    }
    public String getAppId() {
        return (String)readProperty("appId");
    }
    
    
    public void setKey(String key) {
        writeProperty("key", key);
    }
    public String getKey() {
        return (String)readProperty("key");
    }
    
    
    public void setLoginName(String loginName) {
        writeProperty("loginName", loginName);
    }
    public String getLoginName() {
        return (String)readProperty("loginName");
    }
    
    
    public void setValue(String value) {
        writeProperty("value", value);
    }
    public String getValue() {
        return (String)readProperty("value");
    }
    
    
}
