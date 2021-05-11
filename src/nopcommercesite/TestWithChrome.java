package nopcommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestWithChrome {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();      //very important,all class are available for diff browser in webdriver interface

        driver.manage().window().maximize(); //will maximise window
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );  //will wait before browser loads in line 17
        driver.get( baseUrl );              //to open browser-all lines write 5 times.
        String title = driver.getTitle();   //to get title
        boolean verifyTitle = title.equals( "nopCommerce demo store" );
        boolean verifyTitleContain = title.contains( "Demo" );
        System.out.println( verifyTitle );
        System.out.println( verifyTitleContain );
        System.out.println( title.length() );

        String pageSource = driver.getPageSource();
        System.out.println( pageSource );
        driver.close();
    }
}