package by.itacademy.asyrtseva.api;

import by.itacademy.asyrtseva.domain.RandomUserData;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {

    @Test
    public void testApiIncorrectCredentials(){
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body("{\"operationName\":\"SignIn\",\"variables\":{\"email\":\"RandomUserData.getRandomEmail()\",\"password\":\"cacacac\"},\"query\":\"mutation SignIn($email: String!, $password: String!) {\\n  generateCustomerToken(email: $email, password: $password) {\\n    token\\n    __typename\\n  }\\n}\\n\"}")
                .when().post("https://4f.com.pl/graphql")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(response);
        String actualResult = js.getString("errors.message");
        String expectedResult = "[Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testApiEmptyEmail(){
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body("{\"operationName\":\"SignIn\",\"variables\":{\"email\":\"\",\"password\":\"cacacac\"},\"query\":\"mutation SignIn($email: String!, $password: String!) {\\n  generateCustomerToken(email: $email, password: $password) {\\n    token\\n    __typename\\n  }\\n}\\n\"}")
                .when().post("https://4f.com.pl/graphql")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(response);
        String actualResult = js.getString("errors.message");
        String expectedResult = "[Podaj adres email.]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testApiEmptyPassword(){
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body("{\"operationName\":\"SignIn\",\"variables\":{\"email\":\"RandomUserData.getRandomEmail()\",\"password\":\"\"},\"query\":\"mutation SignIn($email: String!, $password: String!) {\\n  generateCustomerToken(email: $email, password: $password) {\\n    token\\n    __typename\\n  }\\n}\\n\"}")
                .when().post("https://4f.com.pl/graphql")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(response);
        String actualResult = js.getString("errors.message");
        String expectedResult = "[Podaj hasło.]";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testApiEmptyCredentials(){
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body("{\"operationName\":\"SignIn\",\"variables\":{\"email\":\"\",\"password\":\"\"},\"query\":\"mutation SignIn($email: String!, $password: String!) {\\n  generateCustomerToken(email: $email, password: $password) {\\n    token\\n    __typename\\n  }\\n}\\n\"}")
                .when().post("https://4f.com.pl/graphql")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(response);
        String actiualResult = js.getString("errors.message");
        String expectedResult = "[Podaj adres email.]";
        assertEquals(expectedResult, actiualResult);
    }

    @Test
    public void testApiInvalidCredentials(){
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body("{\"operationName\":\"SignIn\",\"variables\":{\"email\":\"11111\",\"password\":\"111111\"},\"query\":\"mutation SignIn($email: String!, $password: String!) {\\n  generateCustomerToken(email: $email, password: $password) {\\n    token\\n    __typename\\n  }\\n}\\n\"}")
                .when().post("https://4f.com.pl/graphql")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(response);
        String actualResult = js.getString("errors.message");
        String expectedResult = "[Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.]";
        assertEquals(expectedResult, actualResult);
    }
    
}
