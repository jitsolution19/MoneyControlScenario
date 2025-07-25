package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TempLogicClass{

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("application.properties");
			prop.load(fis);

			// Access properties
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("littleStationUrl");
			String username = prop.getProperty("littleStationUrl");
			String password = prop.getProperty("littleStationUrl");

			System.out.println("Browser: " + browser);
			System.out.println("URL: " + url);
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
