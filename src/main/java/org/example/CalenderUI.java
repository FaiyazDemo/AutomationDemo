package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static javax.swing.UIManager.get;

public class CalenderUI {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String MonthNumber="1";
        String dayNumber="27";
        String YearNumber="2028";
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

    driver.findElement(By.className("react-date-picker__inputGroup")).click();
      driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        driver.findElement(By.xpath("//button[text()='"+YearNumber+"']")).click();
        List<WebElement> months = driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"));
        months.get(Integer.parseInt(MonthNumber)-1).click();

      driver.findElement(By.xpath("//abbr[contains(text(),'"+dayNumber+"')]")).click();



    }
}