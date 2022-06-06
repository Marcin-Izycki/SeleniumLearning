package TaskFromLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class Main04 {
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
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");


        driver.findElement(By.name("id_gender")).click();
        driver.findElement(By.name("firstname")).sendKeys("Karol");
        driver.findElement(By.name("lastname")).sendKeys("Kowalski");
        driver.findElement(By.name("email")).sendKeys(generateEmail());
        driver.findElement(By.name("password")).sendKeys("Pass123");
        driver.findElement(By.name("birthday")).sendKeys("05/22/2010");
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/span/button")).click();
        //driver.findElement(By.xpath("//footer/button")).click();

        //driver.close();
    }

    public static String generateEmail() {
        return "test" + System.currentTimeMillis() + "@test.com";
    }
}

