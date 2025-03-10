# TutorialNinja-SeleniumPOM

Project Overview

This project automates the Tutorial Ninja website using Selenium WebDriver with the Page Object Model (POM) design pattern. The automation framework is designed to perform testing on key functionalities such as account registration and login, including data-driven testing.

Project Structure

The project follows a modular structure with well-organized packages:

1. PageObjects Package (pageObjects)

This package contains classes that represent different pages of the website. Each class includes locators and methods to interact with the elements.

I.AccountRegistrationPage.java – Handles account registration functionalities.

II.BasePage.java – Parent class containing common methods for all pages.

III.HomePage.java – Represents the homepage and its interactions.

IV.LoginPage.java – Contains login page elements and methods.

V.MyAccountPage.java – Represents the user account page after successful login.

2. TestBase Package (testBase)

This package contains:

BaseClass.java – Manages the setup and teardown of WebDriver, configuration settings, and reusable utility methods.

3. TestCases Package (testCases)

This package contains test scripts that validate different functionalities:

I.AccountRegistrationTest.java – Verifies the user registration process.

II.LoginTest.java – Tests the login functionality with valid credentials.

III.LoginDDTTest.java – Implements Data-Driven Testing (DDT) for login using external test data.

4. Utilities

Additional functionalities covered:

A.Extent Reports – Generates a detailed report of test execution with logs.

B.Screenshots – Captures screenshots on test failures for debugging.

C.Test Data Handling – Uses external data sources for DDT.

D.Tools & Technologies Used

C.Programming Language: Java

D.Build Tool: Maven

F.Testing Framework: TestNG

G.Automation Tool: Selenium WebDriver

H.Design Pattern: Page Object Model (POM)

I.Reporting: Extent Reports

J.Data-Driven Testing: Excel/CSV file integration

