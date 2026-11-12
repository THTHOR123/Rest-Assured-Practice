package basics;


import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class AssertField {

	
	@Test
	public void assertField() {
		
		given()
		.when()
			.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
			.log().body()
			.statusCode(200)
			.body("id",equalTo(1) )
			.body("userId", equalTo(1));
		
	}
}
