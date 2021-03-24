package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static{
        System.setProperty("webdriver.opera.driver", "/path/to/C:/operadriver_win64");
        OperaOptions operaOptions = new OperaOptions();
        driver =  new OperaDriver (operaOptions);
        wait = new WebDriverWait(driver,10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public static void navigateTo(String url){
        driver.get(url);
    }
}
