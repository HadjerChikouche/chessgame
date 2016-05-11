Feature: Initialisation of a new Game
  Game can not be initialized without two players

  Scenario: Active Player wants to initialise a new game
    Given two players
    When the Active player initialise a game
    Then the board will be initialised
