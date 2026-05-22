package io.github.nathanjrussell;

/**
 * Encapsulates basic contact information for a person.
 */
public record ContactInfo(
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String streetAddress,
        String city,
        String state,
        String zipCode
) {

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(int tabDepth) {
        StringBuilder sb = new StringBuilder();
        String indent = "\t".repeat(Math.max(0, tabDepth));

        sb.append(indent).append("Name: ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append(indent).append("Phone Number: ").append(phoneNumber).append("\n");
        sb.append(indent).append("Email: ").append(email).append("\n");
        sb.append(indent).append("Address: ")
                .append(streetAddress)
                .append(", ")
                .append(city)
                .append(", ")
                .append(state)
                .append(" ")
                .append(zipCode)
                .append("\n");

        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;

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

        public ContactInfo build() {
            return new ContactInfo(
                    firstName,
                    lastName,
                    email,
                    phoneNumber,
                    streetAddress,
                    city,
                    state,
                    zipCode
            );
        }
    }
}
