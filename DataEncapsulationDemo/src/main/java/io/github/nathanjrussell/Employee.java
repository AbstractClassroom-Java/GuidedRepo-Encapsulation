package io.github.nathanjrussell;

public record Employee(
        ContactInfo personalInfo,
        String employeeId,
        String department,
        String title,
        ContactInfo emergencyContact1,
        String emergencyContact1Relationship,
        ContactInfo emergencyContact2,
        String emergencyContact2Relationship
) {

    @Override
    public String toString() {
        return "Employee Details:\n" +
                "Name: " + personalInfo.firstName() + " " + personalInfo.lastName() + "\n" +
                "Employee ID: " + employeeId + "\n" +
                "Department: " + department + "\n" +
                "Title: " + title + "\n" +
                "Email: " + personalInfo.email() + "\n" +
                "Phone Number: " + personalInfo.phoneNumber() + "\n" +
                "Address: " + personalInfo.streetAddress() + ", " + personalInfo.city() + ", " + personalInfo.state() + " " + personalInfo.zipCode() + "\n" +
                "Emergency Contact 1:\n" +
                "Name: " + emergencyContact1.firstName() + " " + emergencyContact1.lastName() + "\n" +
                "Phone Number: " + emergencyContact1.phoneNumber() + "\n" +
                "Email: " + emergencyContact1.email() + "\n" +
                "Address: " + emergencyContact1.streetAddress() + ", " + emergencyContact1.city() + ", " + emergencyContact1.state() + " " + emergencyContact1.zipCode() + "\n" +
                "Relationship: " + emergencyContact1Relationship + "\n" +
                "Emergency Contact 2:\n" +
                "Name: " + emergencyContact2.firstName() + " " + emergencyContact2.lastName() + "\n" +
                "Phone Number: " + emergencyContact2.phoneNumber() + "\n" +
                "Email: " + emergencyContact2.email() + "\n" +
                "Address: " + emergencyContact2.streetAddress() + ", " + emergencyContact2.city() + ", " + emergencyContact2.state() + " " + emergencyContact2.zipCode() + "\n" +
                "Relationship: " + emergencyContact2Relationship + "\n";
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private ContactInfo personalInfo;
        private String employeeId;
        private String department;
        private String title;
        private ContactInfo emergencyContact1;
        private String emergencyContact1Relationship;
        private ContactInfo emergencyContact2;
        private String emergencyContact2Relationship;

        private Builder() {
        }

        public Builder personalInfo(ContactInfo personalInfo) {
            this.personalInfo = personalInfo;
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

        public Builder emergencyContact1(ContactInfo emergencyContact1) {
            this.emergencyContact1 = emergencyContact1;
            return this;
        }

        public Builder emergencyContact1Relationship(String emergencyContact1Relationship) {
            this.emergencyContact1Relationship = emergencyContact1Relationship;
            return this;
        }

        public Builder emergencyContact2(ContactInfo emergencyContact2) {
            this.emergencyContact2 = emergencyContact2;
            return this;
        }

        public Builder emergencyContact2Relationship(String emergencyContact2Relationship) {
            this.emergencyContact2Relationship = emergencyContact2Relationship;
            return this;
        }

        public Employee build() {
            return new Employee(
                    personalInfo,
                    employeeId,
                    department,
                    title,
                    emergencyContact1,
                    emergencyContact1Relationship,
                    emergencyContact2,
                    emergencyContact2Relationship
            );
        }
    }
}
