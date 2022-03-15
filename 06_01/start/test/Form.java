import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://formy-project.herokuapp.com/form";
        // access website
        driver.get(url);

        // Fill out and submit form
        submitForm(driver);

        //Wait for confirmation page
        confirmSubmission(driver);

        //confirm submission method
        assertEquals("The form was successfully submitted!", getConfirmationText(driver));
        //driver.quit();
    }

    public static void submitForm(WebDriver driver){
        // variable declarations
        String firstName = "Prince";
        String lastName = "Uyi";
        String jobTitleName = "QA Analyst";
        String fName_id = "first-name";
        String lName_id = "last-name";
        String jobTitle_id = "job-title";
        String college_btn_id = "radio-button-2";
        String gradschool_btn_id = "radio-button-3";
        String male_value = "checkbox-1";
        String female_value = "checkbox-2";

        // Form

        WebElement fName = driver.findElement(By.id(fName_id));
        fName.sendKeys(firstName);

        WebElement lName = driver.findElement(By.id(lName_id));
        lName.sendKeys(lastName);

        WebElement jobTitle = driver.findElement(By.id(jobTitle_id));
        jobTitle.sendKeys(jobTitleName);

        WebElement college_btn = driver.findElement(By.id(college_btn_id));
        college_btn.click();

        WebElement male_btn = driver.findElement(By.id(male_value));
        male_btn.click();

        WebElement experience_box = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]"));
        experience_box.click();

        WebElement date_picker = driver.findElement(By.id("datepicker"));
        date_picker.click();

        WebElement date = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[6]/td[3]"));
        date.click();

        WebElement submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submit.click();
    }

    public static void confirmSubmission(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getConfirmationText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();

        //         String expectedResult = "The form was successfully submitted!";
        //        String actualResult = alert.getText();
        //
        //        if (actualResult.contentEquals(expectedResult)){
        //            System.out.println("successfully submitted!");
        //        }else{
        //            System.out.println("Not submitted!");
        //        }
                //assertEquals("The form was successfully submitted!", alert.getText());
    }
}
