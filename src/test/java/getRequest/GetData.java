package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponsecode()
	{
		
		Response resp=RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=Ankara,tr&APPID=1940c5e1d2a60ecc4208bcff31ac077a");
		
		int code=resp.getStatusCode();	
		
		System.out.println("Status code is "+code);
	
		Assert.assertEquals(code,200);
	
	}
	@Test
	public void testbody()
	{
		
		Response resp=RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=Ankara,tr&APPID=1940c5e1d2a60ecc4208bcff31ac077a");
		
		String data=resp.asString();
		
		System.out.println("Data is "+data);
	
		System.out.println("Response time: "+resp.getTime());
	
	}
}
