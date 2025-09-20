package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
  public static void main(String[] args) {


  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();

  driver.get("https://demoqa.com/automation-practice-form");

    WebElement name= driver.findElement(By.id("firstName"));
name.sendKeys("Gunay");

WebElement surname=driver.findElement(By.xpath("//input[@id='lastName']"));
surname.sendKeys("Abbasova");

WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
email.sendKeys("gunayabbasova93ga@gmail.com");

    ((JavascriptExecutor) driver).executeScript(
        "document.querySelectorAll(\"iframe[id^='google_ads_iframe']\").forEach(e=>e.remove());" +
            "document.querySelectorAll('#fixedban, .popup, .advertisement').forEach(e=>e.remove());"
    );

WebElement gender =driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
gender.click();

WebElement mobilPhone=driver.findElement(By.xpath("//input[@id='userNumber']"));
mobilPhone.sendKeys("0103000000");

    WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
    Select selectMonth = new Select(monthDropdown);
    selectMonth.selectByVisibleText("July");

    WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
    Select selectYear = new Select(yearDropdown);
    selectYear.selectByVisibleText("1993");

    WebElement subject= driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
    subject.sendKeys("happy test");

    WebElement sportsCheckbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
    if (!sportsCheckbox.isSelected()) {
      sportsCheckbox.click();

      String filepath="C:/Users/gunay.abbasova/Downloads/IMG_5688.MOV";

      WebElement uploadButton=driver.findElement(By.id("uploadPicture"));
      uploadButton.sendKeys(filepath);

      //yoxlama ucun

      WebElement currentAddress= driver.findElement(By.id("currentAddress"));
      currentAddress.sendKeys("Nizami rayonu");

      WebElement state=driver.findElement(By.className("col-md-4 col-sm-12"));

      Select dropdownState = new Select(state);
      dropdownState.selectByVisibleText("NCR");

      WebElement city=driver.findElement(By.className(" css-1wa3eu0-placeholder"));

      Select dropdownCity = new Select(city);
      dropdownCity.selectByVisibleText("Delhi");

      WebElement sumbitButton =driver.findElement(By.id("submit"));
      sumbitButton.click();

    }
  }
}
