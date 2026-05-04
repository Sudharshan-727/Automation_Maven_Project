package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	//Store the location inside FileInputStream Class
	FileInputStream fis=new FileInputStream("./Test_Data/CommonData.properties");
	//Create File Specific Object
	Properties prop=new Properties();
	//Load Data into Location
	prop.load(fis);
	//Call Read Methods
	String url = prop.getProperty("url");
	System.out.println(url);
	String email = prop.getProperty("Email");
	String password = prop.getProperty("password");
	System.out.println(email);
	System.out.println(password);
	
	
}
}
