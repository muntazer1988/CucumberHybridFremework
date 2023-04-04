package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties initializePrperties() { 
	String filePath="/src/test/resources/configFiles/config.properties";
	
	Properties prop = new Properties();
	
	File proFile = new File(System.getProperty(filePath));
	
	try {
		FileInputStream fis = new FileInputStream(proFile);
		prop.load(fis);
	
	} catch(Throwable e) {
		e.printStackTrace();
	}
	
		return prop;
	
	}

}
