import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;

public class PraktikumUser {

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void checkUserName() {
        given()
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjcyOWVjMWQ1NmMxNDAwM2Q0NzhmMTciLCJpYXQiOjE3MTg3ODc3NzcsImV4cCI6MTcxOTM5MjU3N30.Y8WiLIpB1NKgCBYJX1B4ebdz4Y70ycjzkz4eWVWPflY")
                .get("/api/users/me")
                .then().assertThat().body("data.name", equalTo("Жак-Ив Кусто"));
    }

} 