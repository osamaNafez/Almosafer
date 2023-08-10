import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class Parameters {
	

		
		WebDriver driver = new ChromeDriver(); 
		SoftAssert myAssertion = new SoftAssert(); 
		
		static String URl = "https://www.almosafer.com/en";
		static String[] WebSiteURLS = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
		static String EnglishwebSite = "https://www.almosafer.com/en"; 
		static String ArabicWebsite = "https://www.almosafer.com/ar"; 
		static Date today = new Date();
}