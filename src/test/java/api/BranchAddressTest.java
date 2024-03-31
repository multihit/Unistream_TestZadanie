package api;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BranchAddressTest {

    @Test
    public void AdressTest() {
        Map<String, Object> address = given()
                .when()
                .get("https://slt-test.info.api.unistream.com/api/" +
                        "v1/poses/search?location=55.834846,37.934417&radius=5000&maxResults=1")
                .then().log().all()
                .extract()
                .response().jsonPath().getMap(".");
        ArrayList<Object> items = (ArrayList) address.get("items");
        LinkedHashMap<String, Object> key = (LinkedHashMap<String, Object>) items.get(0);
        String addressFromResponse = key.get("address").toString();
        Assertions.assertEquals("Московская область, Балашиха, Советская, 13", addressFromResponse);
    }

}
