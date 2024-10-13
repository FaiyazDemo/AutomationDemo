package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.security.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PenFirst {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
List<WebElement> hyperlinks= driver.findElements(By.tagName("a"));
int count= hyperlinks.size();
for(int i=0 ;i < hyperlinks.size();i++){

    WebElement link = hyperlinks.get(i);
    System.out.println("Link Text: " + link.getText());
    System.out.println("Link URL: " + link.getAttribute("href"));
            }
System.out.println(count);
WebElement Footerlink= driver.findElement(By.xpath("//tbody/tr[1]/td[2]/ul[1]"));
 List<WebElement> footerslink =Footerlink.findElements(By.tagName("a"));
 int count_footer= footerslink.size();
            for(int i=0 ;i < count_footer;i++){

                WebElement footerslinks = footerslink.get(i);
                System.out.println("Link Text: " + footerslinks.getText());
                System.out.println("Link URL: " + footerslinks.getAttribute("href"));
                String clickOnLink= Keys.chord(Keys.CONTROL,Keys.ENTER);
                footerslink.get(i).sendKeys(clickOnLink);

            }
        System.out.println(count_footer);
    Set<String> abc=driver.getWindowHandles();
            Iterator<String> it=abc.iterator();

    while (it.hasNext())
    {
        driver.switchTo().window(it.next());
        System.out.println(driver.getTitle());
    }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }


//      List<WebElement> hyperlink= driver.findElements(By.tagName("a"));
//      int count= hyperlink.size();
//      System.out.println(count);




}
