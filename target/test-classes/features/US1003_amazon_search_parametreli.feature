Feature: US1003_amazon_search_parametreli

  Scenario: TC05_parametre_kullanma
    When kullanici amazon anasayfaya gider
    And "mucahit" icin arama yapar
    Then sonucun "mucahit" icerdigini test eder
    And kullanici sayfayi kapatir