# Phone Number Validator

This Java program validates Lebanese phone numbers by checking the prefix to determine whether the number is a mobile or landline. The program prompts the user to input an 8-digit phone number and identifies the number type based on predefined prefixes.

## Features

- **Phone Number Validation**: The program ensures that the input is exactly 8 digits long.
- **Prefix Identification**: It checks the first two digits to determine whether the number is a mobile or landline.
- **Error Handling**: The program provides clear error messages if the input is too long, too short, or does not match any known prefixes.

## Usage

1. Clone the repository or download the `homework8.java` file.
2. Compile the Java file using the following command:
   ```bash
   javac homework8.java


## Example Input and Output
Input: '03765432' → Output: 'Mobile'
Input: '01987654' → Output: 'Landline'
Input: '98765432' → Output: 'Error: Unknown number type'.

## Notes
The program currently only supports Lebanese phone numbers with specific prefixes.
This project is intended as a basic example to demonstrate string manipulation, array usage, and control flow in Java.
