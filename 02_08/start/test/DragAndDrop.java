import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://formy-project.herokuapp.com/dragdrop";

        driver.get(url);

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));


        Actions actions= new Actions(driver);

        actions.dragAndDrop(image,box).build().perform();


        //driver.quit();
    }
}

