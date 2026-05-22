package io.github.nathanjrussell;

/*
    * Still Far From Great
    * Developer is allowed to talk on Mondays and Fridays.
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
        /*
            - The parameters can be set in any order using builder pattern
              methods that describe the parameter being set.

            - Notice the original constructor is still available
            - This builder pattern reduces the chance of accidentally
              swapping parameters of the same type but different meaning.
         */
        Employee employee = Employee.builder()
                .firstName("John")
                .lastName("Doe")
                .employeeId("E12345")
                .department("Engineering")
                .title("Software Engineer")
                .email("empemail@fake.com")
                .phoneNumber("555-123-4567")
                .streetAddress("123 Main St")
                .city("Anytown")
                .state("CA")
                .zipCode("12345")
                .emergencyContact1FirstName("Jane")
                .emergencyContact1LastName("Doe")
                .emergencyContact1PhoneNumber("555-987-6543")
                .emergencyContact1Email("contact1@fake.com")
                .emergencyContact1StreetAddress("456 Elm St")
                .emergencyContact1City("Othertown")
                .emergencyContact1State("CA")
                .emergencyContact1ZipCode("54321")
                .emergencyContact1Relationship("Spouse")
                .emergencyContact2FirstName("Jim")
                .emergencyContact2LastName("Smith")
                .emergencyContact2PhoneNumber("555-555-5555")
                .emergencyContact2Email("contact2@fake.com")
                .emergencyContact2StreetAddress("789 Oak St")
                .emergencyContact2City("Sometown")
                .emergencyContact2State("CA")
                .emergencyContact2ZipCode("67890")
                .emergencyContact2Relationship("Friend")
                .build();

        displayEmployeeDetails(employee);

    }
}