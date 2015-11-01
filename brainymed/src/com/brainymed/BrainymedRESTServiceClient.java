package com.brainymed;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
 



import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class BrainymedRESTServiceClient {
	public static void main(String[] args) {
		String string = "";
		try {
 
			// Read file
			InputStream restfulInputStream = new FileInputStream("C:/Users/Sasidhar/Desktop/JSONtest.txt");
			InputStreamReader restfulReader = new InputStreamReader(restfulInputStream);
			BufferedReader br = new BufferedReader(restfulReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
 
			JSONObject jsonObject = new JSONObject(string);
			
			// Pass JSON File Data to REST Service
			
			Client client = Client.create();

			WebResource webResource = client
			   .resource("http://brainymed.com/brainymed/api/REST");
			
			System.out.println(jsonObject);
			
			ClientResponse response = webResource.type("application/json")
			   .post(ClientResponse.class, jsonObject.toString());
						
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);

		  } catch (Exception e) {
			e.printStackTrace();
		  }
	}
}