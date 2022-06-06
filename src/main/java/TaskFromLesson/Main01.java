package TaskFromLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class Main01 {
    public static void main(String[] args) {


        //EDGE
        System.setProperty("webdriver.edge.driver", "src/main/resources/drivers/msedgedriver.exe");
        EdgeDriverService service = EdgeDriverService.createDefaultService();
        EdgeDriver driver = new EdgeDriver(service);
        //EDGE

        //CHROME
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        //CHROME

        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.cssSelector("a[href$=account]")).click();
        driver.findElement(By.cssSelector("a[href$='account=1']")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.close();
    }
}