import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://formy-project.herokuapp.com/modal";
        String id = "modal-button";

        driver.get(url);
        WebElement modalButton = driver.findElement(By.id(id));
        modalButton.click();
        Thread.sleep(1000);
        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor jsExecute = (JavascriptExecutor) driver;
        jsExecute.executeScript("arguments[0].clicks;", closeButton);

        //driver.quit();
    }
}
