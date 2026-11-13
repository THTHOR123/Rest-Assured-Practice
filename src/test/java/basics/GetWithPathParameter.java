package basics;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetWithPathParameter {

	@Test
	public void pathParameter() {
		
		int postId = 2;
		
		given()
			.pathParam("postId", postId)
		.when()
			.get("https://jsonplaceholder.typicode.com/posts/{postId}")
		.then()
			.log().body()
			.statusCode(200)
			.body("id",equalTo(postId) );
		
		
	}
}
