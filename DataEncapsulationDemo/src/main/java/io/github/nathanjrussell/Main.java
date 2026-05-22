package io.github.nathanjrussell;

/*
    * This code defines a method to display employee details, including personal information and emergency contacts.
    * The method takes a large number of parameters to capture all relevant details about the employee and their emergency contacts.
    * The main method demonstrates how to call this method with sample data.
    *
    * ABSOLUTELY AWFUL CODE - Fire the developer who wrote this!
*/
public class Main {

    public static void displayEmployeeDetails(
            String firstName,
            String lastName,
            String employeeId,
            String department,
            String title,
            String email,
            String phoneNumber,
            String streetAddress,
            String city,
            String state,
            String zipCode,
            String emergencyContact1FirstName,
            String emergencyContact1LastName,
            String emergencyContact1PhoneNumber,
            String emergencyContact1Email,
            String emergencyContact1StreetAddress,
            String emergencyContact1City,
            String emergencyContact1State,
            String emergencyContact1ZipCode,
            String emergencyContact1Relationship,
            String emergencyContact2FirstName,
            String emergencyContact2LastName,
            String emergencyContact2PhoneNumber,
            String emergencyContact2Email,
            String emergencyContact2StreetAddress,
            String emergencyContact2City,
            String emergencyContact2State,
            String emergencyContact2ZipCode,
            String emergencyContact2Relationship
    ) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + streetAddress + ", " + city + ", " + state + " " + zipCode);
        System.out.println("Emergency Contact 1:");
        System.out.println("Name: " + emergencyContact1FirstName + " " + emergencyContact1LastName);
        System.out.println("Phone Number: " + emergencyContact1PhoneNumber);
        System.out.println("Email: " + emergencyContact1Email);
        System.out.println("Address: " + emergencyContact1StreetAddress + ", " + emergencyContact1City + ", " + emergencyContact1State + " " + emergencyContact1ZipCode);
        System.out.println("Relationship: " + emergencyContact1Relationship);
        System.out.println("Emergency Contact 2:");
        System.out.println("Name: " + emergencyContact2FirstName + " " + emergencyContact2LastName);
        System.out.println("Phone Number: " + emergencyContact2PhoneNumber);
        System.out.println("Email: " + emergencyContact2Email);
        System.out.println("Address: " + emergencyContact2StreetAddress + ", " + emergencyContact2City + ", " + emergencyContact2State + " " + emergencyContact2ZipCode);
        System.out.println("Relationship: " + emergencyContact2Relationship);
    }

    public static void main(String[] args) {

        displayEmployeeDetails(
                "John",
                "Doe",
                "E12345",
                "Engineering",
                "Software Engineer",
                "empemail@fake.com",
                "555-123-4567",
                "123 Main St",
                "Anytown",
                "CA",
                "12345",
                "Jane",
                "Doe",
                "555-987-6543",
                "contact1@fake.com",
                "456 Elm St",
                "Othertown",
                "CA",
                "54321",
                "Spouse",
                "Jim",
                "Smith",
                "555-555-5555",
                "contact2@fake.com",
                "789 Oak St",
                "Sometown",
                "CA",
                "67890",
                "Friend"
        );

    }
}