package day01;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstProject {

    public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
driver.get("https://demoqa.com/");

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      driver.findElement(
          By.xpath("//h5[.='Elements']/ancestor::div[contains(@class,'top-card')]")
      ).click();
      By elements = By.xpath("//h5[text()='Elements']");
      By adBanner = By.id("fixedban"); // maneə olan div

      wait.until(ExpectedConditions.visibilityOfElementLocated(elements));
      wait.until(ExpectedConditions.invisibilityOfElementLocated(adBanner));


      WebElement elementChekbox=driver.findElement(By.xpath("//span[text()='Check Box']"));
      elementChekbox.click();

        WebElement homeFolder = driver.findElement(
            By.xpath("//li[.//span[text()='Home']]")
        );


        String classValue = homeFolder.getAttribute("class");


        if (classValue.contains("expanded")) {
            System.out.println("Folder açıqdır");
        } else if (classValue.contains("collapsed")) {
            System.out.println("Folder bağlıdır");
        }

    }

}
