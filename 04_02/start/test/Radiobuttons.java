import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://formy-project.herokuapp.com/radiobutton";
        String btn1 = "radio-button-1";
        String btn2 = "input[value='option2']";

        driver.get(url);
        WebElement btn1Click = driver.findElement(By.id(btn1));
        btn1Click.click();

        WebElement btn2Click = driver.findElement(By.cssSelector(btn2));
        btn2Click.click();


        //driver.quit();
    }
}
