Feature: Login feature in Rentzid
  As a customer at rent
  I want to rent my needs
  I want to be the rent owner
  So that I can be a member at my Rentzid


  Scenario: Login invalid Email But Password
    Given I was on the Login page
    When I filled my invalid email and Password correctly
    When I clicked 'Masuk' button in login page
    Then Email atau Kata sandi salah! Massage pop up

  Scenario: Login Invalid Password But Email
    Given I was on the Login page
    When I filled my email correctly and invalid Password
    When I clicked 'Masuk' button in page system
    Then Email atau Kata sandi salah! Massage pop up

  Scenario: Login Invalid Both Of Email and Password
    Given I was on the Login page
    When I filled the invalid email and Password
    When I clicked 'Masuk' button web
    Then Email atau Kata sandi salah! Massage pop up

  Scenario: Login The Empty Email and Password
    Given I was on the Login page
    When I filled the empty email and Password
    When I clicked 'Masuk' button in page
    Then Email tidak boleh kosong! Massage pop up

  Scenario: Login The Empty Password But Email Correctly
    Given I was on the Login page
    When I filled my email correctly and Empty Password
    When I clicked 'Masuk' button the empty Password
    Then Kata sandi tidak boleh kosong! Massage pop up

  Scenario: Login The Empty Email But Password
    Given I was on the Login page
    When I filled the empty email and password correctly
    When I clicked 'Masuk' button in web
    Then Email tidak boleh kosong! Massage pop up

  Scenario: Login Success
    Given I was on the Login page
    When I filled my email and Password correctly
    When I clicked 'Masuk' button
    Then Anda telah login! Massage Pop up

