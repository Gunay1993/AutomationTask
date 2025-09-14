package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {

    public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
driver.get("https://demoqa.com/");

      WebElement elementText=driver.findElement(By.xpath("//h5[text()='Elements']"));
      elementText.click();

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
