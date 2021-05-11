package nopcommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestWithFireFox {
    public static void main(String[] args) {

        String string = "https://demo.nopcommerce.com/";
        System.setProperty( "webdriver.gecko.driver","drivers/geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS  );
        driver.get( string );
        String title = driver.getTitle();
        boolean verifyTitle = title.equals( "nopCommerce demo store" );
        System.out.println(verifyTitle);
        boolean verifyWhatContain = title.contains( "demo" );
        System.out.println(verifyWhatContain);
        System.out.println(title.length());
        String pageSource =driver.getPageSource();
        System.out.println(pageSource);
        driver.close();





    }
}
