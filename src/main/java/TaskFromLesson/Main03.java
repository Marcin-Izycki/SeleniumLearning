package TaskFromLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class Main03 {
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
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");


        driver.findElement(By.id("first-name")).sendKeys("Karol");
        driver.findElement(By.id("last-name")).sendKeys("Kowalski");
        driver.findElement(By.xpath("//label[1]/input")).click();
        driver.findElement(By.id("dob")).sendKeys("05/22/2010");
        driver.findElement(By.id("address")).sendKeys("Prosta 51");
        driver.findElement(By.id("email")).sendKeys(generateEmail());
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("company")).sendKeys("Coders Lab");
        driver.findElement(By.xpath("//div/select[@id=\"role\"]/option[2]")).click();
        //job expectation
        //ways of development
        driver.findElement(By.id("comment")).sendKeys("To jest mój pierwszy automat testowy");

        //Submit
        driver.findElement(By.id("submit")).click();

        //driver.close();
    }

    public static String generateEmail() {
        return "test" + System.currentTimeMillis() + "@test.com";
    }
}

