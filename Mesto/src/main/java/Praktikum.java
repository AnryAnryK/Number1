
import io.restassured.RestAssured;
// ����������� Before
import org.junit.Before;
// ����������� Test
import org.junit.Test;
// �������������� ����������� ������ �����, ����� ������������ given(), get() � then()
import static io.restassured.RestAssured.*;
public class Praktikum {
    // ��������� Before ����������, ��� ����� ����� ����������� ����� ������ �������� �������
    @Before
    public void setUp() {
        // ������������� ��� ������ ����� ����� URL ����� �������� � ���������� � ������ Before
        // ���� � ������ ����� ��������� ������, ��������� � ������� ������ ���� ���
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }
    // ������ ����� ���������
    @Test
    public void getMyInfoStatusCode() {
        // ����� given() �������� ������������ ������
        given()
                // ��������� �������� � ������ �����������
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjcyOWVjMWQ1NmMxNDAwM2Q0NzhmMTciLCJpYXQiOjE3MTg3ODc3NzcsImV4cCI6MTcxOTM5MjU3N30.Y8WiLIpB1NKgCBYJX1B4ebdz4Y70ycjzkz4eWVWPflY")
                // ���������� GET-������ � ������� ������ get, ����������� ����� URL (�����) ������� � ���� � �������� ���������
                .get("/api/users/me")
        // ���������, ��� ������-��� ������ ����� 200
        .then().statusCode(200);
    }
}