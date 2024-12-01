import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContactDetails {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement PimButton=driver.findElement(By.id("menu_pim_viewPimModule"));
        PimButton.click();
        Thread.sleep(5000);

        WebElement textBoxclr=driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
        textBoxclr.clear();

        WebElement textbox =driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
        textbox.sendKeys("Yigit NURVER");

        WebElement clickButton=driver.findElement(By.xpath("//input[@id='searchBtn']"));
        clickButton.click();

        List<WebElement> employee =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        int count=1;
        for (WebElement yigit:employee){
            if (yigit.getText().equals("89917748")){
                yigit.click();
            }
        }


        List<WebElement>contactDetails = driver.findElements(By.xpath("//ul[@id='sidenav']/li/a"));


        for (WebElement details:contactDetails){
            if(details.getText().equals("Contact Details"));
            details.click();
        }

        WebElement clickEditButton= driver.findElement(By.id("btnSave"));
        clickEditButton.click();

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






































    }
}
