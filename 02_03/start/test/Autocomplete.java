import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String website = "https://formy-project.herokuapp.com/autocomplete";
        String address = "1555 Park Blvd, Palo Alto, Ca ";
        driver.get(website);
        WebElement addressField = driver.findElement(By.id("autocomplete"));
        addressField.clear();
        addressField.sendKeys(address);



    }
}
