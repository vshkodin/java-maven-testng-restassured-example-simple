package src.SimpleTest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.*;

 

public class SimpleTest {

	 @Test(groups = { "Smoke" })
	 public void aFastTest() {

	  given().when().get("http://www.google.com").then().statusCode(200);
	 
	 }
	 
	 @Test(groups = { "Regression" })
	 public void aSlowTest() {

	    given().when().get("https://github.com/vsshk/aaaa").then().statusCode(404);
	    
	 }
 
}
