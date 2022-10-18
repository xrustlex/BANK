import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main1 {

	public static void main(String[] args) {
		// LOADING FROM config.properties FILE
		try (InputStream input = new FileInputStream("config.properties");) {

			Properties prop = new Properties();
			prop.load(input);

			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("\nCONNECTION ESTABLISHED\n");

		} catch (ClassNotFoundException e) {

			System.out.println("\nNO CONNECTION AVAILABLE\n");
			e.printStackTrace();

		}
	}

}
