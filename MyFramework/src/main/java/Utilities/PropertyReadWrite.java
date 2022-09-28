package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadWrite {
	Properties prop;

	public PropertyReadWrite(String path) throws IOException {
		FileInputStream fl = new FileInputStream(path);
		prop = new Properties();
		prop.load(fl);

	}

	public String getdata(String key) {
		String value = prop.getProperty(key);
		return value;
	}
}
