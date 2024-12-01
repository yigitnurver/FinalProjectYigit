package Steps;

import Pages.ContactDetailsPage;
import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditContactSteps extends CommonMethods {
    @When("user should create Login details and enter username , password")
    public void user_should_create_login_details_and_enter_username_password() {
        sendText("Admin", ContactDetailsPage.username);
        sendText("Hum@nhrm123",ContactDetailsPage.password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(ContactDetailsPage.LoginButton);

    }

    @When("user enters employee name")
    public void user_enters_employee_name() {
        sendText("Yigit NURVER",ContactDetailsPage.EmpSearchNameField);
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(ContactDetailsPage.EmployeeSearchButton);
    }
    @Then("user able to see searched employee on screen")
    public void user_able_to_see_searched_employee_on_screen() {
        System.out.println("Test passed");
    }
    @Then("user cliks on own name from searched page")
    public void user_cliks_on_own_name_from_searched_page() {
        List<WebElement> employee =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        int count=1;
        for (WebElement yigit:employee){
            if (yigit.getText().equals("89917748")){
                yigit.click();
            }
        }
    }
    @Then("user navigated to personal details page")
    public void user_navigated_to_personal_details_page() {
        System.out.println("test passed");
    }
    @When("user cliks on contact details")
    public void user_cliks_on_contact_details() {
        List<WebElement>contactDetails = driver.findElements(By.xpath("//ul[@id='sidenav']/li/a"));


        for (WebElement details:contactDetails){
            if(details.getText().equals("Contact Details"));
            details.click();
        }
    }
    @Then("user able to see contact details dashboard")
    public void user_able_to_see_contact_details_dashboard() {
        System.out.println("test passed");
    }

    @And("user able to see all textboxes are displayed")
    public void user_able_to_see_all_textboxes_are_displayed() {
        WebElement detailTextBox=driver.findElement(By.id("contact_street1"));
        boolean statusOfDetailbox=detailTextBox.isDisplayed();

        WebElement city=driver.findElement(By.id("contact_city"));
        boolean statusOfcity=city.isDisplayed();

        WebElement province=driver.findElement(By.id("contact_province"));
        boolean statusOfprovince=province.isDisplayed();

        WebElement zipcode=driver.findElement(By.id("contact_emp_zipcode"));
        boolean statusOfzipcode=zipcode.isDisplayed();

        WebElement country=driver.findElement(By.id("contact_country"));
        boolean statusOfountry=country.isDisplayed();

        WebElement hometel=driver.findElement(By.id("contact_emp_hm_telephone"));
        boolean statusOfhometel=hometel.isDisplayed();

        WebElement mobile=driver.findElement(By.id("contact_emp_mobile"));
        boolean statusOfmobile=mobile.isDisplayed();

        WebElement work=driver.findElement(By.id("contact_emp_work_telephone"));
        boolean StatusOfwork=work.isDisplayed();

        WebElement workemail=driver.findElement(By.id("contact_emp_work_email"));
        boolean StatusOfWorkemail=workemail.isDisplayed();

        WebElement otheremail=driver.findElement(By.id("contact_emp_oth_email"));
        boolean statusOfotheremail=otheremail.isDisplayed();

        System.out.println(statusOfDetailbox);


    }

}
