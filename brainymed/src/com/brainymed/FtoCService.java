package com.brainymed;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/FahrenheitToCelsius")
public class FtoCService {
 
	  @GET
	  @Produces("application/json")
	  public String convertFtoC() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32)*5/9; 
		jsonObject.put("F Value", fahrenheit); 
		jsonObject.put("C Value", celsius);
 
		
		return jsonObject.toString();
	  }
 
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public String convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9; 
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);
 
		//String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return jsonObject.toString();
	  }
	  
	  @POST
	  @Produces("application/json")
	  @Consumes(MediaType.APPLICATION_JSON)
	  public String doesntDoAnything(Message m) throws JSONException {
		  System.out.println(m);
		  JSONObject jsonObject = new JSONObject();
		  jsonObject.put("Response","POST WORKS");
		  return jsonObject.toString();
	  }
	  
}