Feature: CreateANewProduct
  
  Scenario Outline: CreateANewProduct
    Given Set method to POST
    When Set URL 
    And Set body parameters and Send Request
    Then Verify response 200 and Verify response body properties

