package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
    static WebDriver driver;


    public static WebDriver startBrowser(String browserChoice,String url){
        ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--headless");
        if (browserChoice.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver(chromeOptions);
        }else if(browserChoice.equalsIgnoreCase("edge")){
            driver= new EdgeDriver();
        }else {
            driver= new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }


//    @Test
//    public void test(){
//        startBrowser("chrome","https://uat.betway.co.za/");
//    }
//
}
