import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://formy-project.herokuapp.com/switch-window";
        String id = "new-tab-button";

        driver.get(url);

        WebElement newTabButton = driver.findElement(By.id(id));
        newTabButton.click();


        String originalHandle = driver.getWindowHandle();

        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);





//        driver.quit();
    }
}
