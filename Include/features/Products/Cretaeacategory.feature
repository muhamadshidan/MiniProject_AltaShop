Feature: CreateaCategory

  Scenario Outline: CreateaCategory
    Given Set method POST
    When Set URL https://alta-shop.herokuapp.com/api/auth/login
    And Set body parameters and send request
    Then verify result 200 and verify response body properties

