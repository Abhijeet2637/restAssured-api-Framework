Feature: Validate the fetch token api
Scenario: Verify if token is fetched successfully
    Given Fetch token api payload
    When Fetch token api is called using Get https method
    Then auth profile id is fetched with status code 200

