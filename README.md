# Selenium Automation Project for Amazon Website

This repository contains an automated testing project for the Amazon website using Selenium WebDriver, Page Factory model, TestNG, RestAssured, and Maven.

## Project Overview

The main goal of this project is to demonstrate effective web automation practices by automating various scenarios on the Amazon website.

## Features

- Utilizes the **Page Factory** design pattern to create maintainable and organized page objects.
- Implements tests using the popular testing framework **TestNG** for better test organization, parallel execution, and reporting.
- Integrates **RestAssured** for API testing capabilities, enhancing the test suite's versatility.
- Manages dependencies and build process using **Maven** for easy project setup and management.

## Setup Instructions

1. Clone the repository:

2. Navigate to the project directory:

3. Install project dependencies using **Maven**:

## Test Execution

To execute the automated tests:

1. Make sure you have the appropriate browser drivers (e.g., ChromeDriver) installed and available in your system's PATH.

2. Modify the `src/test/resources/config.properties` file to specify browser preferences, URLs, etc.

3. Run the test suite using Maven:

## Folder Structure

The project is organized as follows:

- `src/main/java`: Contains utility classes and generic methods.
- `src/main/resources`: Contains configuration files.
- `src/test/java`: Contains the test classes and page objects using the Page Factory model.
- `src/test/resources`: Contains test data and other resources.

## Reporting

After test execution, detailed TestNG and Surefire HTML reports can be found in the `target` directory.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Happy Testing! 🚀

