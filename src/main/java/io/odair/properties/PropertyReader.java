package io.odair.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	private static Properties props = new Properties();

	static {
		InputStream is = PropertyReader.class.getResourceAsStream("/application.properties");
		try {
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readProperty(String key) {
		return props.getProperty(key);
	}

}
