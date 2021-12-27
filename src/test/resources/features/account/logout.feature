Feature: Log Out feature in Rentzid
  As a customer at rent
  After rent some products
  I'd like to finish my activity in my account


  Scenario: Log Out Success
    Given I was on the Login page
    When I filled my email and Password correctly
    When I clicked 'Masuk' button
    And I Clicked icon 'A' button
    And I clicked 'Log Out' button in menu dropp down of icon A
    Then Anda berhasil keluar! Massage Pop up