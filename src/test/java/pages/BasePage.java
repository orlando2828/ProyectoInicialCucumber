package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        System.setProperty("webdriver.chrome.driver","driverNavegador/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));

    }
      //corregido
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public static void navigateTo(String url){
        driver.get(url);

    }
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

    }
    //public WebElement Find(By locator) {
      //  return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    //}


    public void clickElement(String locator){
        Find(locator).click();

    }
    public void write(String locator,String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);

    }

    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator,int valueToSelect){
     Select dropdown = new Select(Find(locator));
     dropdown.selectByIndex(valueToSelect);

    }
    public void selectFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByVisibleText(valueToSelect);

    }

    public void hoverOverelement(String locator){
        action.moveToElement(Find(locator));

    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(Find(locator));

    }

    public String getValueFromTable(String locator, int row, int colum){
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+colum+"]";
        return Find(cellINeed).getText();

    }

    public void setValueOnTable(String locator, int row, int colum, String stringToSend){
        String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+colum+"]";
        Find(cellToFill).sendKeys(stringToSend);
    }



}

