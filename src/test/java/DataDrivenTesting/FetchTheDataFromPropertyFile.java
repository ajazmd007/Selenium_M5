package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchTheDataFromPropertyFile {

	public FetchTheDataFromPropertyFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		//Convert Physical file into java Object
		FileInputStream fis= new FileInputStream("./src/test/resources/CommonData.properties");
		
		//Create an Object of properties
		Properties p = new Properties();
		
		//Load the property object
		p.load(fis);
		
		//Fetch the data from property file
		String data = p.getProperty("url");
		String data1 = p.getProperty("browser");
		String data2 = p.getProperty("timeouts");
		String data3 = p.getProperty("username");
		String data4 = p.getProperty("password");
	
		//Print the data
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);


	}

}
