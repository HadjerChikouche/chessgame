Feature: King capture
  White King should be able to capture if he moves in a direction of a black bishop

  Scenario: active player wants to capture black bishop
    Given there is a black bishop in a square next to the white king
    When the player tries to move the white king to this square
    Then the white king moves there and captures the black bishop