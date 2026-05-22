package io.github.nathanjrussell;

/*
    * Notice Employee data implements tab indents for
    * better display formatting.
    *
    * Overloaded the toString method to allow for tab depth control
    * in ContactInfo
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

        sb.append("\tEmployee ID: ").append(employeeId).append("\n");
        sb.append("\tDepartment: ").append(department).append("\n");
        sb.append("\tTitle: ").append(title).append("\n");

        sb.append("\tContact Details:\n");
        sb.append(personalInfo.toString(2));

        sb.append("\tEmergency Contact 1:\n");
        sb.append(emergencyContact1.toString(2));
        sb.append("\t\tRelationship: ").append(emergencyContact1Relationship).append("\n");

        sb.append("\tEmergency Contact 2:\n");
        sb.append(emergencyContact2.toString(2));
        sb.append("\t\tRelationship: ").append(emergencyContact2Relationship).append("\n");

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
