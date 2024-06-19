package stepDefinations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class StepDefination{
    RequestSpecification requestReq;
    @Given("Fetch token api payload")
    public RequestSpecification fetchTokenApiPayload() {
        RestAssured.baseURI="https://plutus-perf.internal.hdfc-beta.zetaapps.in";
       return given().log().all().relaxedHTTPSValidation().header("accept", "application/json").header("plutus-test-credentials", "performacetestsinlzuat").
                header("user-agent", "shortlive-token-service-lzuat").queryParam("env", "lzuat").queryParam("test_type", "backend").
                queryParam("device_id", "perf0000000190");
    }
    Response response;
    @When("Fetch token api is called using Get https method")
    public void fetchTokenApiIsCalledUsingGetHttpsMethod() {
        StepDefination obj = new StepDefination();
        RequestSpecification req = obj.fetchTokenApiPayload();
        response = req.when().get("/plutus-test-data-service/v2/addCredentials/8920386111");
        throw new io.cucumber.java.PendingException();
    }

    @Then("auth profile id is fetched with status code {int}")
    public void authProfileIdIsFetchedWithStatusCode(int arg0) {
        response.then().assertThat().statusCode(arg0);
        throw new io.cucumber.java.PendingException();
    }
}
