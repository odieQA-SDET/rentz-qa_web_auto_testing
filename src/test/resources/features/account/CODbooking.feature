Feature: Customer feature in https://rentzid-f00f3.web.app
  As a member at rentzid
  I want to booking the product with COD
  So that I can rent some my products at my Rentzid


  Scenario: Booking Success of COD
    Given I was on the Login page
    When I filled my email and Password correctly
    When I clicked 'Masuk' button
    And Anda telah login! Massage Pop up
    And I have selected and clicked the product that I need
    And I went to detail product page
    And I have set the rental date
    And I clicked 'Rental' button in detail page of product
    And I Clicked 'Tambahkan' button on pop up box of Tambahkan ke keranjang
    And I got the pop up masage success and been going to keranjang page
    And I Clicked icon 'Cart' button Icon
    And I clicked checkmark box and 'checkout' button
    And I got Informasi Pembayaran and clicked 'COD' radio button
    And I clicked 'Bayar' button in checkout page
    Then I got the pop up masage of COD and clicked 'OK' and Keranjang saya was Empty


