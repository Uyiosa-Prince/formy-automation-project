import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollToElement {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://formy-project.herokuapp.com/scroll";
        String myName = "Prince Uyi";
        String myDate = "05/02/2020";

        driver.get(url);
        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys(myName);

        WebElement date = driver.findElement(By.id("date"));
        action.moveToElement(date);
        date.sendKeys(myDate);

        WebElement confirm = date.findElement(By.xpath("//*[@id=\"name\"]"));
        String expectedResult = myName;
        String actualResult = name.getAttribute("value");

        if(actualResult.equals(expectedResult))
         System.out.println("Test Pass");
        else
         System.out.println("Test Fail");


        //driver.quit();
    }
}
