
import io.restassured.RestAssured;
// импортируем Before
import org.junit.Before;
// импортируем Test
import org.junit.Test;
// дополнительный статический импорт нужен, чтобы использовать given(), get() и then()
import static io.restassured.RestAssured.*;
public class Praktikum {
    // аннотаци€ Before показывает, что метод будет выполн€тьс€ перед каждым тестовым методом
    @Before
    public void setUp() {
        // повтор€ющуюс€ дл€ разных ручек часть URL лучше записать в переменную в методе Before
        // если в классе будет несколько тестов, указывать еЄ придЄтс€ только один раз
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }
    // создаЄм метод автотеста
    @Test
    public void getMyInfoStatusCode() {
        // метод given() помогает сформировать запрос
        given()
                // указываем протокол и данные авторизации
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjcyOWVjMWQ1NmMxNDAwM2Q0NzhmMTciLCJpYXQiOjE3MTg3ODc3NzcsImV4cCI6MTcxOTM5MjU3N30.Y8WiLIpB1NKgCBYJX1B4ebdz4Y70ycjzkz4eWVWPflY")
                // отправл€ем GET-запрос с помощью метода get, недостающую часть URL (ручку) передаЄм в него в качестве параметра
                .get("/api/users/me")
        // провер€ем, что статус-код ответа равен 200
        .then().statusCode(200);
    }
}