package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;


    static{
        System.setProperty("webdriver.opera.driver", "C:/operadriver_win64/operadriver.exe");
        OperaOptions operaOptions = new OperaOptions();
        driver =  new OperaDriver (operaOptions);
        wait = new WebDriverWait  (driver,10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait  (driver,10);
    }

    public static void setWait(WebDriverWait wait) {
        BasePage.wait = wait;
    }
    public static void navigateTo(String url){
        driver.get(url);
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write (String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue (String locator, String valueToSelect){
        Select dropdown =  new Select(Find(locator));

        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex (String locator, int valueToSelect){
        Select dropdown =  new Select(Find(locator));

        dropdown.selectByIndex(valueToSelect);
    }
    public void selectFromDropdownByText (String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }
    public void hoverOverElement (String locator){
        action.moveToElement(Find(locator));

    }

    public void doubleClick (String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick (String locator){
        action.contextClick(Find(locator));

    }

    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return Find(cellINeed).getText();

    }

}



