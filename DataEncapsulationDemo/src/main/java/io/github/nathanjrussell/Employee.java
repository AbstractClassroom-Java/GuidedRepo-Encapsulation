package io.github.nathanjrussell;

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

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String firstName;
        private String lastName;
        private String employeeId;
        private String department;
        private String title;
        private String email;
        private String phoneNumber;
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;
        private String emergencyContact1FirstName;
        private String emergencyContact1LastName;
        private String emergencyContact1PhoneNumber;
        private String emergencyContact1Email;
        private String emergencyContact1StreetAddress;
        private String emergencyContact1City;
        private String emergencyContact1State;
        private String emergencyContact1ZipCode;
        private String emergencyContact1Relationship;
        private String emergencyContact2FirstName;
        private String emergencyContact2LastName;
        private String emergencyContact2PhoneNumber;
        private String emergencyContact2Email;
        private String emergencyContact2StreetAddress;
        private String emergencyContact2City;
        private String emergencyContact2State;
        private String emergencyContact2ZipCode;
        private String emergencyContact2Relationship;

        private Builder() {
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder emergencyContact1FirstName(String emergencyContact1FirstName) {
            this.emergencyContact1FirstName = emergencyContact1FirstName;
            return this;
        }

        public Builder emergencyContact1LastName(String emergencyContact1LastName) {
            this.emergencyContact1LastName = emergencyContact1LastName;
            return this;
        }

        public Builder emergencyContact1PhoneNumber(String emergencyContact1PhoneNumber) {
            this.emergencyContact1PhoneNumber = emergencyContact1PhoneNumber;
            return this;
        }

        public Builder emergencyContact1Email(String emergencyContact1Email) {
            this.emergencyContact1Email = emergencyContact1Email;
            return this;
        }

        public Builder emergencyContact1StreetAddress(String emergencyContact1StreetAddress) {
            this.emergencyContact1StreetAddress = emergencyContact1StreetAddress;
            return this;
        }

        public Builder emergencyContact1City(String emergencyContact1City) {
            this.emergencyContact1City = emergencyContact1City;
            return this;
        }

        public Builder emergencyContact1State(String emergencyContact1State) {
            this.emergencyContact1State = emergencyContact1State;
            return this;
        }

        public Builder emergencyContact1ZipCode(String emergencyContact1ZipCode) {
            this.emergencyContact1ZipCode = emergencyContact1ZipCode;
            return this;
        }

        public Builder emergencyContact1Relationship(String emergencyContact1Relationship) {
            this.emergencyContact1Relationship = emergencyContact1Relationship;
            return this;
        }

        public Builder emergencyContact2FirstName(String emergencyContact2FirstName) {
            this.emergencyContact2FirstName = emergencyContact2FirstName;
            return this;
        }

        public Builder emergencyContact2LastName(String emergencyContact2LastName) {
            this.emergencyContact2LastName = emergencyContact2LastName;
            return this;
        }

        public Builder emergencyContact2PhoneNumber(String emergencyContact2PhoneNumber) {
            this.emergencyContact2PhoneNumber = emergencyContact2PhoneNumber;
            return this;
        }

        public Builder emergencyContact2Email(String emergencyContact2Email) {
            this.emergencyContact2Email = emergencyContact2Email;
            return this;
        }

        public Builder emergencyContact2StreetAddress(String emergencyContact2StreetAddress) {
            this.emergencyContact2StreetAddress = emergencyContact2StreetAddress;
            return this;
        }

        public Builder emergencyContact2City(String emergencyContact2City) {
            this.emergencyContact2City = emergencyContact2City;
            return this;
        }

        public Builder emergencyContact2State(String emergencyContact2State) {
            this.emergencyContact2State = emergencyContact2State;
            return this;
        }

        public Builder emergencyContact2ZipCode(String emergencyContact2ZipCode) {
            this.emergencyContact2ZipCode = emergencyContact2ZipCode;
            return this;
        }

        public Builder emergencyContact2Relationship(String emergencyContact2Relationship) {
            this.emergencyContact2Relationship = emergencyContact2Relationship;
            return this;
        }

        public Employee build() {
            return new Employee(
                    firstName,
                    lastName,
                    employeeId,
                    department,
                    title,
                    email,
                    phoneNumber,
                    streetAddress,
                    city,
                    state,
                    zipCode,
                    emergencyContact1FirstName,
                    emergencyContact1LastName,
                    emergencyContact1PhoneNumber,
                    emergencyContact1Email,
                    emergencyContact1StreetAddress,
                    emergencyContact1City,
                    emergencyContact1State,
                    emergencyContact1ZipCode,
                    emergencyContact1Relationship,
                    emergencyContact2FirstName,
                    emergencyContact2LastName,
                    emergencyContact2PhoneNumber,
                    emergencyContact2Email,
                    emergencyContact2StreetAddress,
                    emergencyContact2City,
                    emergencyContact2State,
                    emergencyContact2ZipCode,
                    emergencyContact2Relationship
            );
        }
    }
}
