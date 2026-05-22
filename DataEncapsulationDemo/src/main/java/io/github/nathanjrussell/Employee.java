package io.github.nathanjrussell;

/*
    * This code defines an Employee class with a large number of fields to encapsulate personal information and emergency contacts.
    * The class has a constructor that takes all these fields as parameters, and getter methods for each field.
    *
    * Mediocre code - Developer is still employed but likely not promoted.
 */
public class Employee {

    private final String firstName;
    private final String lastName;
    private final String employeeId;
    private final String department;
    private final String title;
    private final String email;
    private final String phoneNumber;

    private final String streetAddress;
    private final String city;
    private final String state;
    private final String zipCode;

    private final String emergencyContact1FirstName;
    private final String emergencyContact1LastName;
    private final String emergencyContact1PhoneNumber;
    private final String emergencyContact1Email;
    private final String emergencyContact1StreetAddress;
    private final String emergencyContact1City;
    private final String emergencyContact1State;
    private final String emergencyContact1ZipCode;
    private final String emergencyContact1Relationship;

    private final String emergencyContact2FirstName;
    private final String emergencyContact2LastName;
    private final String emergencyContact2PhoneNumber;
    private final String emergencyContact2Email;
    private final String emergencyContact2StreetAddress;
    private final String emergencyContact2City;
    private final String emergencyContact2State;
    private final String emergencyContact2ZipCode;
    private final String emergencyContact2Relationship;

    public Employee(
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
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.title = title;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.emergencyContact1FirstName = emergencyContact1FirstName;
        this.emergencyContact1LastName = emergencyContact1LastName;
        this.emergencyContact1PhoneNumber = emergencyContact1PhoneNumber;
        this.emergencyContact1Email = emergencyContact1Email;
        this.emergencyContact1StreetAddress = emergencyContact1StreetAddress;
        this.emergencyContact1City = emergencyContact1City;
        this.emergencyContact1State = emergencyContact1State;
        this.emergencyContact1ZipCode = emergencyContact1ZipCode;
        this.emergencyContact1Relationship = emergencyContact1Relationship;
        this.emergencyContact2FirstName = emergencyContact2FirstName;
        this.emergencyContact2LastName = emergencyContact2LastName;
        this.emergencyContact2PhoneNumber = emergencyContact2PhoneNumber;
        this.emergencyContact2Email = emergencyContact2Email;
        this.emergencyContact2StreetAddress = emergencyContact2StreetAddress;
        this.emergencyContact2City = emergencyContact2City;
        this.emergencyContact2State = emergencyContact2State;
        this.emergencyContact2ZipCode = emergencyContact2ZipCode;
        this.emergencyContact2Relationship = emergencyContact2Relationship;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getEmergencyContact1FirstName() {
        return emergencyContact1FirstName;
    }

    public String getEmergencyContact1LastName() {
        return emergencyContact1LastName;
    }

    public String getEmergencyContact1PhoneNumber() {
        return emergencyContact1PhoneNumber;
    }

    public String getEmergencyContact1Email() {
        return emergencyContact1Email;
    }

    public String getEmergencyContact1StreetAddress() {
        return emergencyContact1StreetAddress;
    }

    public String getEmergencyContact1City() {
        return emergencyContact1City;
    }

    public String getEmergencyContact1State() {
        return emergencyContact1State;
    }

    public String getEmergencyContact1ZipCode() {
        return emergencyContact1ZipCode;
    }

    public String getEmergencyContact1Relationship() {
        return emergencyContact1Relationship;
    }

    public String getEmergencyContact2FirstName() {
        return emergencyContact2FirstName;
    }

    public String getEmergencyContact2LastName() {
        return emergencyContact2LastName;
    }

    public String getEmergencyContact2PhoneNumber() {
        return emergencyContact2PhoneNumber;
    }

    public String getEmergencyContact2Email() {
        return emergencyContact2Email;
    }

    public String getEmergencyContact2StreetAddress() {
        return emergencyContact2StreetAddress;
    }

    public String getEmergencyContact2City() {
        return emergencyContact2City;
    }

    public String getEmergencyContact2State() {
        return emergencyContact2State;
    }

    public String getEmergencyContact2ZipCode() {
        return emergencyContact2ZipCode;
    }

    public String getEmergencyContact2Relationship() {
        return emergencyContact2Relationship;
    }
}
