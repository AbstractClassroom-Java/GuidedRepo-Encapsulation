package io.github.nathanjrussell;

/*
    * Slightly more modern code - Developer is allowed to each lunch with the team but not allowed to speak in meetings.
*/
public class Main {

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.firstName() + " " + employee.lastName());
        System.out.println("Employee ID: " + employee.employeeId());
        System.out.println("Department: " + employee.department());
        System.out.println("Title: " + employee.title());
        System.out.println("Email: " + employee.email());
        System.out.println("Phone Number: " + employee.phoneNumber());
        System.out.println(
                "Address: " + employee.streetAddress() + ", " + employee.city() + ", " + employee.state() + " " + employee.zipCode()
        );

        System.out.println("Emergency Contact 1:");
        System.out.println("Name: " + employee.emergencyContact1FirstName() + " " + employee.emergencyContact1LastName());
        System.out.println("Phone Number: " + employee.emergencyContact1PhoneNumber());
        System.out.println("Email: " + employee.emergencyContact1Email());
        System.out.println(
                "Address: " + employee.emergencyContact1StreetAddress() + ", " + employee.emergencyContact1City() + ", " + employee.emergencyContact1State() + " " + employee.emergencyContact1ZipCode()
        );
        System.out.println("Relationship: " + employee.emergencyContact1Relationship());

        System.out.println("Emergency Contact 2:");
        System.out.println("Name: " + employee.emergencyContact2FirstName() + " " + employee.emergencyContact2LastName());
        System.out.println("Phone Number: " + employee.emergencyContact2PhoneNumber());
        System.out.println("Email: " + employee.emergencyContact2Email());
        System.out.println(
                "Address: " + employee.emergencyContact2StreetAddress() + ", " + employee.emergencyContact2City() + ", " + employee.emergencyContact2State() + " " + employee.emergencyContact2ZipCode()
        );
        System.out.println("Relationship: " + employee.emergencyContact2Relationship());
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