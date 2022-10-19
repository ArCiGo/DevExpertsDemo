package Tests;

import static org.hamcrest.CoreMatchers.equalTo;
import Data.ProductData;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.apache.http.HttpStatus;
import static Utilities.ExtentReports.ExtentTestManager.startTest;
import java.lang.reflect.Method;

public class APITests {

    @Test(description = "It adds a product to the shopping cart using the API.",
        priority = 1, groups = { "API" })
    public void AddItemToShoppingCart(Method method) {
        startTest(method.getName(), "It adds a product to the shopping cart using the API.");

        given()
            .contentType("application/json")
            .body(ProductData.postProductPayload()).
        when()
            .post(" https://api.demoblaze.com/addtocart").
        then()
            .assertThat()
            .statusCode(HttpStatus.SC_OK);
    }

    @Test(description = "It deletes a product in the shopping cart using the API.",
        priority = 2, groups = { "API" })
    public void DeleteItemInShoppingCart(Method method) {
        startTest(method.getName(), "It deletes a product in the shopping cart using the API.");

        given()
            .contentType("application/json")
            .body(ProductData.deleteProductPayload()).
        when()
            .post("https://api.demoblaze.com/deleteitem")
        .then()
            .assertThat()
            .statusCode(HttpStatus.SC_OK);
    }
}
