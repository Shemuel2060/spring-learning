package model;

import java.util.Properties;

public class UserPreferences {
	
	private Properties theme;

	public Properties getTheme() {
		return theme;
	}

	public void setTheme(Properties theme) {
		this.theme = theme;
	}
	
	
	public String getPreference(String key) {
		return this.theme.getProperty(key);
	}
	

	

}
