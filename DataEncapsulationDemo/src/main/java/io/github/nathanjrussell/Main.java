package io.github.nathanjrussell;

/*
    * This code defines a method to display employee details, including personal information and emergency contacts.
    * The method takes a large number of parameters to capture all relevant details about the employee and their emergency contacts.
    * The main method demonstrates how to call this method with sample data.
    *
    * ABSOLUTELY AWFUL CODE - Fire the developer who wrote this!
*/
public class Main {

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Title: " + employee.getTitle());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println(
                "Address: " + employee.getStreetAddress() + ", " + employee.getCity() + ", " + employee.getState() + " " + employee.getZipCode()
        );

        System.out.println("Emergency Contact 1:");
        System.out.println("Name: " + employee.getEmergencyContact1FirstName() + " " + employee.getEmergencyContact1LastName());
        System.out.println("Phone Number: " + employee.getEmergencyContact1PhoneNumber());
        System.out.println("Email: " + employee.getEmergencyContact1Email());
        System.out.println(
                "Address: " + employee.getEmergencyContact1StreetAddress() + ", " + employee.getEmergencyContact1City() + ", " + employee.getEmergencyContact1State() + " " + employee.getEmergencyContact1ZipCode()
        );
        System.out.println("Relationship: " + employee.getEmergencyContact1Relationship());

        System.out.println("Emergency Contact 2:");
        System.out.println("Name: " + employee.getEmergencyContact2FirstName() + " " + employee.getEmergencyContact2LastName());
        System.out.println("Phone Number: " + employee.getEmergencyContact2PhoneNumber());
        System.out.println("Email: " + employee.getEmergencyContact2Email());
        System.out.println(
                "Address: " + employee.getEmergencyContact2StreetAddress() + ", " + employee.getEmergencyContact2City() + ", " + employee.getEmergencyContact2State() + " " + employee.getEmergencyContact2ZipCode()
        );
        System.out.println("Relationship: " + employee.getEmergencyContact2Relationship());
    }

    public static void main(String[] args) {

        Employee employee = new Employee(
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

        displayEmployeeDetails(employee);

    }
}