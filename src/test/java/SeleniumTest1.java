import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v126.indexeddb.model.Key;
import org.w3c.dom.Text;

import java.time.Duration;

public class SeleniumTest1 {
    @Test
    public void testleSearch() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "D:\\ANDREY\\GoogleChromeDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

//открыть окно на полную  - УСПЕШНО
        driver.manage().window().maximize();

//открыть страницу ГитХаб  - УСПЕШНО
        driver.get("https://github.com");

  //Thread.sleep(5000);  // Let the user actually see something!

//найти строку Поиска по Х-пасс  - УСПЕШНО
        WebElement Find = driver.findElement(By.xpath(".//*[@data-target='qbsearch-input.inputButtonText']"));

//подождать 5000 милисекунд  - УСПЕШНО
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

//нажать на строку Поиска  - УСПЕШНО
        Find.click();

// найти Нажатую строку Поиска  - УСПЕШНО
        WebElement Find2  = driver.findElement(By.xpath(".//*[@style='width: 300px;']"));

//ввести в строке Поиска "Selenium"  - УСПЕШНО
      Find2.sendKeys("Selenium");

//после ввода в строке Поиска "Selenium" нажать ENTER  - УСПЕШНО
       Find2.sendKeys(Keys.ENTER);

//в новом открывшемся окне первая запись содержит фразу "/SeleniumHQ/selenium"  - найти её по Х-пасс
        // WebElement Find3 = driver.findElement(By.xpath((".//span[@class='Text-sc-17v1xeu-0 qaOIC search-match']")[0]));
        // Х-пасс в Консоли находится, но из-за кавычек не могу применить этот код в ИДЕЕ

        //пробую с новым локатором - УСПЕШНО
        WebElement Find3 = driver.findElement(By.xpath(".//a[@href='/SeleniumHQ/selenium']"));

//подождать 5000 милисекунд
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));

//в новом открывшемся окне нажать на ссылку "/SeleniumHQ/selenium"  - УСПЕШНО
       Find3.click();

//конец сессии  - УСПЕШНО
    driver.quit();


//  searchBox.submit();
  //Thread.sleep(5000);  // Let the user actually see something!

}
}

