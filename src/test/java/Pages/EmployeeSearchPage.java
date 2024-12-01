package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeSearchPage extends CommonMethods {
    @FindBy(id="empsearch_id")
    public static WebElement empIdTextBox;

    @FindBy(id="searchBtn")
    public static WebElement searchButton;

    @FindBy(id="empsearch_employee_name_empName")
    public static WebElement empSearchNameField;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver, this);
    }
}
