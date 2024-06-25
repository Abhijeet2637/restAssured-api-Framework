Feature: Validate the beneficiary api

  Scenario: Verify if the beneficiary is created with create beneficiary api
    Given Create beneficiary api payload
    When Create beneficiary is called using Post https method
    Then Beneficiary is created with status code 201


  Scenario: Verify if beneficiary is fetched successfully using get beneficiary api
    Given Get beneficiary api payload
    When User calls get beneficiary api using get https method
    Then API call get success with status code 200


  Scenario: Verify if the beneficiary is deleted using Delete beneficiary api
    Given Delete beneficiary api payload
    When User calls delete beneficiary api with Delete https method
    Then API call get success with status code 200
    And status in response body is DELETED


