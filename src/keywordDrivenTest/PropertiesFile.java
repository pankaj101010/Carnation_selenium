package keywordDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static String getValue(String key) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream("input/objectRepository.properties");
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.out.println("unable to open repository");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public static String[] getLocator(String key) {
	   String[] values=null;
	   
	   try {
			FileInputStream fis = new FileInputStream("input/objectRepository.properties");
			Properties prop = new Properties();
			prop.load(fis);
			values = prop.getProperty(key).split(" ");
		} catch (FileNotFoundException e) {
			System.out.println("unable to open repository");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return values;
	}


}
