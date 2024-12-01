package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public static WebElement username;

    @FindBy(id = "txtPassword")
    public static WebElement password;

    @FindBy(id = "btnLogin" )
    public static WebElement LoginButton;

    @FindBy(id ="empsearch_employee_name_empName")
    public static WebElement EmpSearchNameField;

    @FindBy(id="searchBtn")
    public static WebElement EmployeeSearchButton;

    @FindBy(id = "empsearch_id")
    public static WebElement empIdTextBox;



    public ContactDetailsPage(){
        PageFactory.initElements(driver,this);
    }

}
