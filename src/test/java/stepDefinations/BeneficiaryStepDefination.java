package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BeneficiaryStepDefination {
    RequestSpecification reqRes;
    String apiResponse;
    Response response;
    @Given("Create beneficiary api payload")
    public void createBeneficiaryApiPayload() {
        RestAssured.baseURI="https://api.tachyon.uat.hdfcbank.com";
        reqRes = given().relaxedHTTPSValidation().log().all().header("X-Zeta-AuthToken", "eyJhbGciOiJFZERTQSJ9.eyJzdWIiOiJ1WWZ4NEl5MEM4RFlreHRhUzRPWXpRPT0iLCJ2ZXIiOiIyIiwiY2xpZW50SWQiOiJmb1dmYlFQd3l2cGRQUHVqQ0NRci5wYXl6YXAiLCJpc3MiOiIxMDAwMDAxLXBheXphcHAtdXNlcnMuaW4iLCJzYW5kYm94IjoiNCIsImFkZGl0aW9uYWxfY2xhaW1zIjp7fSwiZGV2aWNlSWQiOiJwZXJmMDAwMDAwMDE5MCIsImF1ZCI6ImNpcGhlciIsInpvbmUiOiJoYmwtYXdzLWFwczEtemV0YS1ub25wY2lkc3MtMS11YXQtZWtzIiwic3ViamVjdEpJRCI6InVZZng0SXkwQzhEWWt4dGFTNE9ZelE9PUBhdXRoUHJvZmlsZS4xMDAwMDAxLXBheXphcHAtdXNlcnMuaW4vNTkiLCJzY29wZXMiOlsibG9naW4tc2NvcGUiXSwiZXhwIjoxNzE4OTAwMDk0LCJpYXQiOjE3MTg4MTM2OTQsImp0aSI6InByb3RldXNfMTcxODgxMzY5NDMxM184ZGQ3M2I4My0yNWNkLTRjMDgtYWQxNS03MzViNjI3NTBiOGEiLCJ0ZW5hbnQiOiIxMDAwMDAxIn0.hwYQU7qcf7Dkuov1dAlPi7nyPLkKbtLQyB77HRir_OkIikVLRhduJSa9G2CIHFUlKUhErQxXRH4i0y_v87qoCQ").
                header("Content-Type", "application/json").header("X-Request-Name", "plutus-beneficiary-service ~ Create/Beneficiary").
                header("Cookie", "TS01c53513=013b8e86395338d2dc7ffb462c7e80ef0d7eba9d6fa56a25bc39b19ed264aff6973939c322c7fe1517d9d039421f163679a4cefdbd").
                body("{\n" +
                        "  \"accountNumber\": \"50100000000674\",\n" +
                        "  \"ifscCode\": \"HDFC0002870\",\n" +
                        "  \"beneficiaryName\": \"TestBeneficiary 4\",\n" +
                        "  \"accountProvider\": \"HDFC Bank\",\n" +
                        "  \"bankName\": \"HDFC Bank\"\n" +
                        "}");
    }
    @When("Create beneficiary is called using Post https method")
    public void createBeneficiaryIsCalledUsingPostHttpsMethod() {
        response = reqRes.when().log().all().post("/gwplutus/plutus-beneficiary-service/api/v2/ifi/1000001/create/beneficiary/uYfx4Iy0C8DYkxtaS4OYzQ==");
    }

    @Then("Beneficiary is created with status code {int}")
    public void beneficiaryIsCreatedWithStatusCode(int statusCode) {
        String apiResponse = response.then().log().all().assertThat().statusCode(statusCode).extract().response().asString();
    }

    @Given("Get beneficiary api payload")
    public void getBeneficiaryApiPayload() {

    }

    @When("User calls get beneficiary api using get https method")
    public void userCallsGetBeneficiaryApiUsingGetHttpsMethod() {
    }

    @Then("API call get success with status code {int}")
    public void apiCallGetSuccessWithStatusCode(int arg0) {
    }

    @Given("Delete beneficiary api payload")
    public void deleteBeneficiaryApiPayload() {
    }

    @When("User calls delete beneficiary api with Delete https method")
    public void userCallsDeleteBeneficiaryApiWithDeleteHttpsMethod() {
    }

    @And("status in response body is DELETED")
    public void statusInResponseBodyIsDELETED() {
    }
}
