package february2022.Tugas5;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import february2022.Tugas5.BaseAPITest;


public class APITest extends BaseAPITest {
	

	
	@Test
	public void Register() {

		Response response = given().spec(commonJsonSpec).body(dataPayload).when().post("/register");
		AssertJUnit.assertEquals(response.getStatusCode(), 201);
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		String Status = jsonPathEvaluator.get("Status");
		System.out.println("Status : " + Status);
		
		AssertJUnit.assertEquals(Status, "Created");
		String Message = jsonPathEvaluator.get("Message");
		
		System.out.println("Message : " + Message);
		AssertJUnit.assertEquals(Message, "New User Registered");	

}
}
