
Feature: LoginScreenForRecruiters_pos @feature_user_login

  Background: 
    Given the recruiter is on the Login Screen

  @valid-login
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click on the 'Show Password' option
    And I click the Login button
    Then the user should be redirected to the dashboard
    And the dashboard loads without errors

    Examples:
      | email               | password          |
      | krishna@gmail.com   | ValidPassword123  |

  @valid-email-empty-password
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>" in the Email ID field
    And I leave the Password field empty
    Then the Login button should be disabled
    When I enter "<password>" in the Password field
    Then the Login button should be enabled

    Examples:
      | email              | password     |
      | krishna@gmail.com  | password123  |

  @toggle_password_visibility
  Scenario Outline: Verify 'Show/Hide Password' functionality
    When I enter a valid password in the Password field
    And I click on the 'Show Password' option
    Then the password should be visible
    And I click on the 'Hide Password' option
    Then the password should be hidden

  Examples:
    | password            |
    | ValidPassword123!   |

  @valid-login-chrome
  Scenario Outline: Login Screen for Recruiters in Chrome
    When the user opens the application in <browser>
    And the user enters <email>
    And the user enters <password>
    And the user clicks the Login button
    Then the user should be redirected to the dashboard

    Examples:
      | browser | email                   | password          |
      | Chrome  | recruiter@example.com    | ValidPassword123  |

  @valid-login-firefox
  Scenario Outline: Login Screen for Recruiters in Firefox
    When the user opens the application in <browser>
    And the user enters <email>
    And the user enters <password>
    And the user clicks the Login button
    Then the user should be redirected to the dashboard

    Examples:
      | browser  | email                   | password          |
      | Firefox  | recruiter@example.com    | ValidPassword123  |

  @valid-login-safari
  Scenario Outline: Login Screen for Recruiters in Safari
    When the user opens the application in <browser>
    And the user enters <email>
    And the user enters <password>
    And the user clicks the Login button
    Then the user should be redirected to the dashboard

    Examples:
      | browser | email                   | password          |
      | Safari  | recruiter@example.com    | ValidPassword123  |

  @valid-login-recruiters
  Scenario Outline: Login Screen for Recruiters
    Given the user enters "<email>" and "<password>"
    When the user clicks the Login button
    Then the user is redirected to the dashboard for the first role
    And the user logs out
    And the login screen is displayed again
    Given the user enters "<email2>" and "<password2>"
    When the user clicks the Login button
    Then the user is redirected to the dashboard for the second role

    Examples:
      | email                 | password          | email2                | password2          |
      | recruiter@example.com | ValidPassword123  | recruiter2@example.com| ValidPassword456   |

  @valid-login-desktop
  Scenario Outline: Login Screen for Recruiters on Desktop
    When the user enters "<email>"
    And the user enters "<password>"
    And the user clicks the Login button
    Then the user should be redirected to the dashboard

  @valid-login-tablet
  Scenario Outline: Login Screen for Recruiters on Tablet
    When the user resizes the browser window to a tablet resolution
    And the user enters "<email>"
    And the user enters "<password>"
    And the user clicks the Login button
    Then the user should be redirected to the dashboard

  @valid-login-mobile
  Scenario Outline: Login Screen for Recruiters on Mobile
    When the user resizes the browser window to a mobile resolution
    And the user enters "<email>"
    And the user enters "<password>"
    And the user clicks the Login button
    Then the user should be redirected to the dashboard

  Examples:
    | email               | password            |
    | krishna@gmail.com   | ValidPassword123    |
