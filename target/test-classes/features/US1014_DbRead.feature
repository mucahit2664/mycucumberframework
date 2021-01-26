@db
Feature: US1014_DbRead
  Scenario: TC_21 kullanici veri okur
    Given kullanici CK_Hotels veritabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur
  @dbUtil
  Scenario:  TC_22 kullanici DBUtils ile veri okur
    Given kullanici DBUtils ile CK_Hotels veritabanina baglanir
    And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtils ile "Price" sutunundaki verileri okur