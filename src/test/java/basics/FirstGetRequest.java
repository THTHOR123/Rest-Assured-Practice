package basics;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FirstGetRequest {

	@Test
	public void FirstGet() {
		
		
		given()
		.when()
			.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
			.statusCode(200)
			.log().body();
	}
}
