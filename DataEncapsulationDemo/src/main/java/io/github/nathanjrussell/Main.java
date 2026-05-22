package io.github.nathanjrussell;

public class Main {

    /*
    Formatting of contact information is now formatted much better.
     */

    public static void main(String[] args) {
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

        System.out.println(employee);

    }
}