package package1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetTests {
	
@Test
public void getListOfUsers() {
	RestAssured.baseURI="https://reqres.in/api/users?page=2";
	String respInString=RestAssured.get().body().asString();
	System.out.println(respInString);
}

}
