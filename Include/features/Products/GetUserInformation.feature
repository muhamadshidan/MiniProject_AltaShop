Feature: GetUserInformation

  Scenario Outline: Title of your scenario outline
    Given Set method GET
    When Set URL https://alta-shop.herokuapp.com/api/auth/login
    And Set body parameters and send request
    Then verify result 200 and verify response body properties


