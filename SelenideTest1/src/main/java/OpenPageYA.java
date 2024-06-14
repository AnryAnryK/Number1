import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class OpenPageYA {
    @Test
    public void OpenPage(){
        open("https://ya.ru/");
        $(By.xpath(".//div[@class='search3__input-inner-container']")).click();
        $(By.xpath(".//div[@class='search3__input-inner-container']")).setValue("Привет");

    }

}
