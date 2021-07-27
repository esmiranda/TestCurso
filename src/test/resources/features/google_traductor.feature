# Autor: Estephanie Miranda
# Language:es
@traducir
  Feature: Traducir palabras en google traductor
    como usuario de google chrome
    quiero usar google traductor
    para traducir palabras entre diferentes idiomas

  @inglésEspañol
  Scenario: Traducir de ingles a espanol
    Given que Caleb quiere usar el traductor de google
    When el traduce una palabra del ingles a espanol
    |origen|destino|palabrai|
    |inglés|español|table   |
    Then el deberia ver la palabra traducida del ingles al espanol
    |palabrae|
    |mesa    |