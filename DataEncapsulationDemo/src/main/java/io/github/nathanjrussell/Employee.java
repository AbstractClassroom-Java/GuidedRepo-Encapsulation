package io.github.nathanjrussell;

/*
 * Slightly more modern code - Developer is allowed to each lunch with the team but not allowed to speak in meetings.
 */
public record Employee(
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

}
