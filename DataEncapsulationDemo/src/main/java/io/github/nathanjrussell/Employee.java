package io.github.nathanjrussell;

/*
    * Notice Employee class no longer provides the string for
    * contact details.  The ContactInfo record class is
    * responsible for that.
    *
    * Employee class calls the toString method of the ContactInfo
    * record class to get the formatted contact details when printing
 */

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
        StringBuilder sb = new StringBuilder();

        sb.append("Employee Details:\n");
        sb.append(personalInfo);

        sb.append("Employee ID: ").append(employeeId).append("\n");
        sb.append("Department: ").append(department).append("\n");
        sb.append("Title: ").append(title).append("\n");

        sb.append("Emergency Contact 1:\n");
        sb.append(emergencyContact1);
        sb.append("Relationship: ").append(emergencyContact1Relationship).append("\n");

        sb.append("Emergency Contact 2:\n");
        sb.append(emergencyContact2);
        sb.append("Relationship: ").append(emergencyContact2Relationship).append("\n");

        return sb.toString();
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
