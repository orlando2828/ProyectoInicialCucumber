package pages;

public class WebDriverUniversityDropdownPage extends BasePage {
    //WebElement
    String languageSelect = " //*[@id=\"dropdowm-menu-1\"]";

    //*[@id="dropdowm-menu-1"]
//select[@id='dropdown-menu-1']"
    public WebDriverUniversityDropdownPage(){
         super(driver);

    }
    public void navToWDUDropdownPage(){
        navigateTo("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

    }
    public void selectElementFromDropdown(String opt ){
        selectFromDropdownByText(languageSelect, opt);

    }
}
