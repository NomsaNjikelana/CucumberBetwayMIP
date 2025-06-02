package Steps;

import Pages.Login;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://uat.betway.co.za/");
    Login loginPage = PageFactory.initElements(driver, Login.class);


    }

