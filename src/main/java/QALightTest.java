import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class QALightTest {
    WebDriver browser;
    @Test
    public void qalight_home_page(){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https:\\qalight.com.ua");
        WebElement news = browser.findElement(By.xpath("//*[@id=\"menu-item-391\"]/a"));
        news.click();


    }

}
