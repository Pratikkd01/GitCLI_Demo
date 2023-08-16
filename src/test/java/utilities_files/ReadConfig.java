package utilities_files;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File src = new File("C:\\Users\\pratik_kadam\\eclipse-workspace\\banking_project\\Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e){
			System.out.println("Exception is" + e.getMessage());
		}
	}
	public String getURL() {
		String url = pro.getProperty("url"); // case sensitive so use exact property name from read.config
		return url;
		}
	public String getuser() {
		String user = pro.getProperty("userId");
		return user;
	}
	public String getpass() {
		String pass = pro.getProperty("password");
		return pass;
	}
	public String chromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String firefoxpath(){
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;	
	}
	
	public String edgepath() {
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
		
	}
}
