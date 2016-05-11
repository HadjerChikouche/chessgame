Feature: King movement
  King should move in all directions right, left, up, down
  White King should not be able to move in a direction if there is another white in the square
  White King should be able to capture if he move in a direction of a black piece

  Scenario: Active Player wants to move her King to an empty square
    Given there is an empty square next to the king
    When the player tries to move the king to this square
    Then the king moves there

  Scenario: Active white Player wants to move her King to a square with white
    Given a square with white piece next to the king
    When the player tries to move the king to this square
    Then the king can't move to the square