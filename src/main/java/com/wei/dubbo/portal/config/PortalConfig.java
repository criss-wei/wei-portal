package com.wei.dubbo.portal.config;

import java.util.ResourceBundle;

public class PortalConfig {
	public static final ResourceBundle RB=ResourceBundle.getBundle("project.properties");
	
	public static String get(String key) {
		return RB.getString(key);
	}
}
