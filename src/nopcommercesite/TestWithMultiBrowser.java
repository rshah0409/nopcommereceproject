package nopcommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestWithMultiBrowser {
    static String browser = "firefox";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //will be needed in automation.
        if (browser.equalsIgnoreCase( "chrome" )){

            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();


        }else if(browser.equalsIgnoreCase( "firefox" )){
            System.setProperty( "webdriver.gecko.driver","drivers/geckodriver.exe" );
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase( "ie" )){
            System.setProperty( "webdriver.ie.driver","drivers/IEDriverServer.exe" );
            driver = new InternetExplorerDriver();
            driver.close();
        }else{
            System.out.println("Wrong Browser Name");
        }
        driver.get( baseUrl );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.close();

    }
}
