# Phone Number Validator

This Java program validates Lebanese phone numbers by checking the prefix to determine whether the number is a mobile or landline. The program prompts the user to input an 8-digit phone number and identifies the number type based on predefined prefixes.

Features:

Validates phone numbers based on their length (8 digits).
Identifies if the number is mobile or landline using known prefixes.
Provides error messages for numbers that are too long, too short, or have unknown prefixes.
Usage:

Enter an 8-digit phone number when prompted.
The program will display whether the number is a "Mobile" or "Landline".
If the number does not match any known prefixes, an error message is shown.
Example Input and Output:

Input: 03765432 → Output: Mobile
Input: 01987654 → Output: Landline
Input: 98765432 → Output: Error: Unknown number type.
Note: This program is a basic implementation aimed at understanding string manipulation, array usage, and control flow in Java.
