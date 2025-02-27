package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public WriteBackDataToPropertyFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		//Convert Physical file into java Object
				FileInputStream fis= new FileInputStream("./src/test/resources/CommonData.properties");
				
				//Create an Object of properties
				Properties p = new Properties();
				
				//Load the property object
				p.load(fis);
				
				//Store the new data
				p.put("Animal", "Dog");
				
				//Save the property file
				FileOutputStream fos= new FileOutputStream("./src/test/resources/CommonData.properties");
				p.store(fos, "Updated successfully");
				
	}

}
