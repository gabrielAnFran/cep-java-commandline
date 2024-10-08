# cep-java-commandline

## Overview

`mainCepSearch` is a Java application designed to validate and retrieve information about Brazilian postal codes (CEPs) using the CEP Aberto API. The application prompts the user to input a CEP, validates it, and if valid, queries the CEP Aberto API to fetch details about the location associated with the CEP.

## Features

- Validates Brazilian CEP format.
- Uses the CEP Aberto API to fetch location information.
- Displays the city and state of the provided CEP.
- Handles and displays error messages for invalid CEPs and API errors.

## Requirements

- A valid CEP Aberto API token

## Usage

1. **Run the application**

2. **Input a CEP:**
    - When prompted, enter a valid Brazilian CEP (e.g., 01001000).

## Code Structure

- `mainCepSearch`: Main class containing the application's entry point.
- `CepInfo`: Model class to map the JSON response from the CEP Aberto API.
- `CepValidator`: Utility class for validating CEP format.
- `EnvLoader`: Utility class for loading environment variables from a `.env` file.

## Example

1. **Running the application:**
    ```sh
    mvn exec:java -Dexec.mainClass="mainCepSearch"
    ```

2. **Entering a CEP:**
    ```
    Por favor, insira um CEP: 01001000
    ```

3. **Expected Output:**
    ```
    São Paulo-SP
    ```

## Error Handling

- If an invalid CEP is entered:
    ```
    O CEP inserido é inválido: 12345678
    ```

- If there is an error with the API request (e.g., invalid token or network issue):
    ```
    Error: 401
    Error message: Unauthorized
    ```

## Dependencies

- `gson`: For parsing JSON responses from the API.
- `java.net.http.HttpClient`: For making HTTP requests to the CEP Aberto API.
