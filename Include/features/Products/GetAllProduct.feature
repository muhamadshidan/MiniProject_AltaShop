Feature: GetAllProduct
  
  Scenario Outline: GetAllProduct
    Given Set method GET 
    When Set id URL 
    And  Send request and verify result 200
    Then Verify response body properties

