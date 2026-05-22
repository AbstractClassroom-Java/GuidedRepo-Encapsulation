package io.github.nathanjrussell;

/*
    * Starting to look nicer, right?
    * The main driver file is handling too much of the details.
    * Developer is starting to be liked among the team.
*/
public class Main {

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");

        ContactInfo personalInfo = employee.personalInfo();
        System.out.println("Name: " + personalInfo.firstName() + " " + personalInfo.lastName());

        System.out.println("Employee ID: " + employee.employeeId());
        System.out.println("Department: " + employee.department());
        System.out.println("Title: " + employee.title());
        System.out.println("Email: " + personalInfo.email());
        System.out.println("Phone Number: " + personalInfo.phoneNumber());
        System.out.println(
                "Address: " + personalInfo.streetAddress() + ", " + personalInfo.city() + ", " + personalInfo.state() + " " + personalInfo.zipCode()
        );

        System.out.println("Emergency Contact 1:");
        ContactInfo emergencyContact1 = employee.emergencyContact1();
        System.out.println("Name: " + emergencyContact1.firstName() + " " + emergencyContact1.lastName());
        System.out.println("Phone Number: " + emergencyContact1.phoneNumber());
        System.out.println("Email: " + emergencyContact1.email());
        System.out.println(
                "Address: " + emergencyContact1.streetAddress() + ", " + emergencyContact1.city() + ", " + emergencyContact1.state() + " " + emergencyContact1.zipCode()
        );
        System.out.println("Relationship: " + employee.emergencyContact1Relationship());

        System.out.println("Emergency Contact 2:");
        ContactInfo emergencyContact2 = employee.emergencyContact2();
        System.out.println("Name: " + emergencyContact2.firstName() + " " + emergencyContact2.lastName());
        System.out.println("Phone Number: " + emergencyContact2.phoneNumber());
        System.out.println("Email: " + emergencyContact2.email());
        System.out.println(
                "Address: " + emergencyContact2.streetAddress() + ", " + emergencyContact2.city() + ", " + emergencyContact2.state() + " " + emergencyContact2.zipCode()
        );
        System.out.println("Relationship: " + employee.emergencyContact2Relationship());
    }

    public static void main(String[] args) {
        // Create ContactInfo instances for contact info
        // Reuse the ContactInfo class to encapsulate details
        ContactInfo personalInfo = ContactInfo.builder()
                .firstName("John")
                .lastName("Doe")
                .email("empemail@fake.com")
                .phoneNumber("555-123-4567")
                .streetAddress("123 Main St")
                .city("Anytown")
                .state("CA")
                .zipCode("12345")
                .build();

        ContactInfo emergencyContact1 = ContactInfo.builder()
                .firstName("Jane")
                .lastName("Doe")
                .email("contact1@fake.com")
                .phoneNumber("555-987-6543")
                .streetAddress("456 Elm St")
                .city("Othertown")
                .state("CA")
                .zipCode("54321")
                .build();

        ContactInfo emergencyContact2 = ContactInfo.builder()
                .firstName("Jim")
                .lastName("Smith")
                .email("contact2@fake.com")
                .phoneNumber("555-555-5555")
                .streetAddress("789 Oak St")
                .city("Sometown")
                .state("CA")
                .zipCode("67890")
                .build();

        /*
            - The parameters can be set in any order using builder pattern
              methods that describe the parameter being set.

            - Notice the original constructor is still available
            - This builder pattern reduces the chance of accidentally
              swapping parameters of the same type but different meaning.
         */
        Employee employee = Employee.builder()
                .personalInfo(personalInfo)
                .employeeId("E12345")
                .department("Engineering")
                .title("Software Engineer")
                .emergencyContact1(emergencyContact1)
                .emergencyContact1Relationship("Spouse")
                .emergencyContact2(emergencyContact2)
                .emergencyContact2Relationship("Friend")
                .build();

        displayEmployeeDetails(employee);

    }
}