import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://formy-project.herokuapp.com/switch-window";
        String id = "alert-button";


        driver.get(url);
        WebElement alertButton = driver.findElement(By.id(id));
        alertButton.click();

        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //driver.quit();
    }
}
