import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Pradheba\\Selenium\\SeleniumDay1\\Driver\\IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.greenstechnologys.com/");
		
		String ti = driver.getTitle();
		System.out.println(ti);
		
		String url = driver.getCurrentUrl();	
		
		System.out.println(url);
		
		
		
		
		
	}
}
