package february2022.Tugas5;

import com.github.javafaker.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPITest {
	static RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com/")
			.setContentType(ContentType.JSON).build().log().all();	

	Faker fakeData = new Faker();

	String username = fakeData.name().username();
	String password = fakeData.number().digits(6).toString();
	String email = fakeData.internet().emailAddress(); 
	String phonenumber = fakeData.phoneNumber().phoneNumber();
	
	String RegisterPayload = "{\"username\": \"%s\", \"password\": \"%s\", \"email\": \"%s\",\"phonenumber\": \"%s\"}";
	String dataPayload = String.format(RegisterPayload, username, password, email, phonenumber);
	
}
 
