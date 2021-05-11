package nopcommercesite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestWithEdge {
    public static void main(String[] args) {
        String webUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        driver.get( webUrl );
        String getTheTitle = driver.getTitle();
        System.out.println(getTheTitle);
        System.out.println(getTheTitle.length());
        boolean verifyTitle = getTheTitle.equals( "nopCommerce demo store" );
        System.out.println(verifyTitle);
        boolean verifyTheTitleContains =  getTheTitle.contains( "present" );
        System.out.println(verifyTheTitleContains);
        String pageResource = driver.getPageSource();
        System.out.println(pageResource);
        driver.quit();
        ;
    }
}
