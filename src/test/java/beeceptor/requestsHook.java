package beeceptor;

import static io.restassured.RestAssured.given; 

import org.json.simple.JSONObject; 
import org.testng.annotations.Test; 

import io.restassured.RestAssured; 
import io.restassured.http.ContentType; 

public class requestsHook {
    
    // Base URL of the API
    String url="https://posthook-api.mock.beeceptor.com"; 
    
    @Test(enabled=true)
    public void getHooks() {
        // Set the base URI for the request
        RestAssured.baseURI = url;
        // Send a GET request to the /v1/hooks and log the response
        given().get("/v1/hooks").then().log().all();
    }
    
    @Test(enabled=true)
    public void scheduleHook() {
        // Set the base URI for the request
        RestAssured.baseURI = url;
        // Send a POST request to the /v1/hooks with JSON content type and log the response
        given().contentType(ContentType.JSON).when().post("/v1/hooks").then().log().all();
    }
    
    @Test(enabled=true)
    public void getHook() {
        // Set the base URI for the request
        RestAssured.baseURI = url;
        // Send a GET request to the /v1/hooks/{hookId} and log the response
        given().get("/v1/hooks/c1ec9560-65fc-4b88-bfe0-1bc6e56cb3db").then().log().all();
    }
    
    @Test(enabled = true)
    public void deleteHook() {
        // Set the base URI for the request
        RestAssured.baseURI = url;
        // Send a DELETE request to the /v1/hooks/{hookId} and log the response
        given().delete("/v1/hooks/c1ec9560-65fc-4b88-bfe0-1bc6e56cb3db").then().log().all();
    }
    
    @Test(enabled = true)
    public void updateHook() {
        // Set the base URI for the request
        RestAssured.baseURI = url;
        // Create a JSON object for the request body
        JSONObject js = new JSONObject();
        // Add key-value pairs
        js.put("name", "updated-project");
        js.put("domain", "api.example.com");
        js.put("headerAuthorization:", "");
        js.put("minRetries", "1");
        js.put("retryDelaySecs", "5");
        // Send a PUT request to the /v1/projects/ and log the response
        given().contentType("application/json").body(js.toJSONString()).when().put("/v1/projects/").then().log().all();
    }
}
