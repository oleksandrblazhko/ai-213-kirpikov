Feature: Підтримка спільноти користувачів
  As a користувач
  In order to обмінюватися досвідом та знаннями
  I want to мати можливість взаємодіяти з іншими користувачами

 Scenario: Створення спільноти
    Given програмний продукт з функціональністю спільноти
    When користувач реєструється у системі
    Then він може створювати та приєднуватися до спільнот, обмінюватися знаннями та спілкуватися з іншими учасниками

Scenario: Обмін знаннями
    Given що користувач є членом спільноти
        And є можливість обміну знаннями
    When користувач додає публікацію або запитання
    Then інші користувачі можуть відповідати та обмінюватися досвідом
