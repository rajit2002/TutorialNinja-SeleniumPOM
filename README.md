# TutorialNinja-SeleniumPOM

Project Overview

This project automates the Tutorial Ninja website using Selenium WebDriver with the Page Object Model (POM) design pattern. The automation framework is designed to perform testing on key functionalities such as account registration and login, including data-driven testing.

Project Structure

The project follows a modular structure with well-organized packages:

1. PageObjects Package (pageObjects)

This package contains classes that represent different pages of the website. Each class includes locators and methods to interact with the elements.

AccountRegistrationPage.java – Handles account registration functionalities.

BasePage.java – Parent class containing common methods for all pages.

HomePage.java – Represents the homepage and its interactions.

LoginPage.java – Contains login page elements and methods.

MyAccountPage.java – Represents the user account page after successful login.

2. TestBase Package (testBase)

This package contains:

BaseClass.java – Manages the setup and teardown of WebDriver, configuration settings, and reusable utility methods.

3. TestCases Package (testCases)

This package contains test scripts that validate different functionalities:

AccountRegistrationTest.java – Verifies the user registration process.

LoginTest.java – Tests the login functionality with valid credentials.

LoginDDTTest.java – Implements Data-Driven Testing (DDT) for login using external test data.

4. Utilities

Additional functionalities covered:

Extent Reports – Generates a detailed report of test execution with logs.

Screenshots – Captures screenshots on test failures for debugging.

Test Data Handling – Uses external data sources for DDT.

Tools & Technologies Used

Programming Language: Java

Build Tool: Maven

Testing Framework: TestNG

Automation Tool: Selenium WebDriver

Design Pattern: Page Object Model (POM)

Reporting: Extent Reports

Data-Driven Testing: Excel/CSV file integration

