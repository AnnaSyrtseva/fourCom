package by.itacademy.asyrtseva.api;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {

    @Test
    public void testApiIncorrectCredentials(){
        String response = given().log().all()
                .header("Content-Type", "application/json")
                .body("{\"operationName\":\"SignIn\",\"variables\":{\"email\":\"tetrirdddusww@gmail.com\",\"password\":\"cacacac\"},\"query\":\"mutation SignIn($email: String!, $password: String!) {\\n  generateCustomerToken(email: $email, password: $password) {\\n    token\\n    __typename\\n  }\\n}\\n\"}")
                .when().post("https://4f.com.pl/graphql")
                .then().extract().response().asString();
        //System.out.println(response);
        JsonPath js = new JsonPath(response);
        String actiualResult = js.getString("errors.message");
        String expectedResult = "[Podany e-mail lub hasło są niepoprawne. Upewnij się, że używasz poprawnego adresu e-mailowego i hasła, a następnie ponownie spróbuj się zalogować.]";
        assertEquals(expectedResult, actiualResult);
    }

}
