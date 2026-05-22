# Data Encapsulation

Data encapsulation is a fundamental principle of object-oriented programming (OOP) that involves bundling data and methods that operate on that data within a single unit, typically a class. It allows for the hiding of internal details and provides a clear interface for interacting with the data.  

## Benefits of Data Encapsulation

Consider a situation where you are dealing with information dealing with employees in a company.  It is very likely that you will need at least the following details:

- Employee First Name
- Employee Last Name
- Employee ID
- Employee Home Address
- Employee Contact Information
- Emergency Contact Information (person 1)
- Emergency Contact Information (person 2)

In a non-encapsulated approach, you might create functions that directly manipulate these details without any structure, which can lead to code that is difficult to maintain and prone to errors. For example:

```java
public void addEmployeeToDatabase(
    String firstName, 
    String lastName, 
    String employeeID, 
    String streetAddress, 
    String city, 
    String state, 
    String zipCode, 
    String contactPhone, 
    String contactEmail, 
    String emergencyContact1Name, 
    String emergencyContact1Phone, 
    String emergencyContact2Name, 
    String emergencyContact2Phone
) {
    // Code to add employee to database
}
```

Obviously this can work, but it is not very efficient or maintainable for the following reasons:

1. **Lack of Structure**: The function has too many parameters, making it difficult to understand and use correctly.
2. **Error-Prone**: It is easy to mix up the order of parameters or forget to include some, leading to bugs.
3. **Difficult to Maintain**: If you need to add or change employee details in the future, you would have to modify the function signature and all calls to it, which can be time-consuming and error-prone. In enterprise level applications, this might require changes in multiple repositories and teams, which can lead to significant issues.

In contrast, using data encapsulation, you can create an `Employee` class that encapsulates all the relevant details and provides methods to interact with that data. For example:

```java
public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String contactPhone;
    private String contactEmail;
    private String emergencyContact1Name;
    private String emergencyContact1Phone;
    private String emergencyContact2Name;
    private String emergencyContact2Phone;

    // Constructor
    public Employee(String firstName, String lastName, String employeeID, String streetAddress,
                    String city, String state, String zipCode, String contactPhone, String contactEmail,
                    String emergencyContact1Name, String emergencyContact1Phone,
                    String emergencyContact2Name, String emergencyContact2Phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.emergencyContact1Name = emergencyContact1Name;
        this.emergencyContact1Phone = emergencyContact1Phone;
        this.emergencyContact2Name = emergencyContact2Name;
        this.emergencyContact2Phone = emergencyContact2Phone;
    }

    // Getters and Setters for each field
    public String getFirstName() {
        return firstName;
    }

    // ... (other getters and setters)

}
```

This approach provides a clear structure for the employee data, making it easier to understand and maintain. You can create instances of the `Employee` class and use its methods to interact with the data without worrying about the underlying implementation details. This promotes better code organization, reduces the likelihood of errors, and makes it easier to manage changes in the future.

To use this `Employee` class, you can create an instance and set its properties like this:

```java
Employee employee = new Employee(
    "John", 
    "Doe", 
    "E12345", 
    "123 Main St", 
    "Anytown", 
    "CA", 
    "12345", 
    "555-1234", 
    "fake@email.com",
    "Jane Doe",
    "555-5678",
    "Jack Doe",
    "555-8765"
);
```

Then you can simply use the details by passing the `employee` object to any function that requires employee information, without needing to worry about the individual details. This encapsulation allows for better code organization and maintainability.

```java

public void addEmployeeToDatabase(Employee employee) {
    // Code to add employee to database using employee.getFirstName(), employee.getLastName(), etc.
}
```

## Java Record Classes

In Java 14 and later, you can use record classes to achieve data encapsulation in a more concise way. A record class is a special type of class that is designed to hold immutable data. It automatically generates constructors, getters, `equals()`, `hashCode()`, and `toString()` methods based on the fields defined in the record.

Here’s how you can define an `Employee` record class:

```java

public record Employee(
    String firstName,
    String lastName,
    String employeeID,
    String streetAddress,
    String city,
    String state,
    String zipCode,
    String contactPhone,
    String contactEmail,
    String emergencyContact1Name,
    String emergencyContact1Phone,
    String emergencyContact2Name,
    String emergencyContact2Phone
) {}
```

This record class provides a concise way to encapsulate employee data. You can create an instance of the `Employee` record like this:

```java
Employee employee = new Employee(
    "John", 
    "Doe", 
    "E12345", 
    "123 Main St", 
    "Anytown", 
    "CA", 
    "12345", 
    "555-1234", 
    "fake@email.com",
    "Jane Doe",
    "555-5678",
    "Jack Doe",
    "555-8765"
);
```

The record class automatically provides getter methods for each field, so you can access the employee details like this:

```java
String firstName = employee.firstName();
String lastName = employee.lastName();
// ... and so on for other fields
```

Using record classes can simplify your code and reduce boilerplate, while still providing the benefits of data encapsulation. However, keep in mind that record classes are immutable, so if you need to modify the employee details after creation, you would need to create a new instance of the record with the updated values.

## Builder Patterns

When dealing with complex objects that have many fields, using a builder pattern can help improve code readability and maintainability. The builder pattern allows you to create an object step by step, without having to remember the order of parameters in a constructor. This can be especially useful when you have optional fields or when the number of fields is large.

Here’s an example of how you can implement a builder pattern for the `Employee` class:

```java

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String contactPhone;
    private String contactEmail;
    private String emergencyContact1Name;
    private String emergencyContact1Phone;
    private String emergencyContact2Name;
    private String emergencyContact2Phone;

    // Private constructor to enforce the use of the builder
    private Employee(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeeID = builder.employeeID;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.contactPhone = builder.contactPhone;
        this.contactEmail = builder.contactEmail;
        this.emergencyContact1Name = builder.emergencyContact1Name;
        this.emergencyContact1Phone = builder.emergencyContact1Phone;
        this.emergencyContact2Name = builder.emergencyContact2Name;
        this.emergencyContact2Phone = builder.emergencyContact2Phone;
    }

    // Getters for each field
    public String getFirstName() {
        return firstName;
    }

    // ... (other getters)

    // Static inner Builder class
    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private String employeeID;
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;
        private String contactPhone;
        private String contactEmail;
        private String emergencyContact1Name;
        private String emergencyContact1Phone;
        private String emergencyContact2Name;
        private String emergencyContact2Phone;

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this; // Return the builder for chaining
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this; // Return the builder for chaining
        }

        // ... (other setter methods)

        public Employee build() {
            return new Employee(this); // Create an Employee instance using the builder
        }
    }
}
```

With this builder pattern, you can create an `Employee` instance like this:

```java

Employee employee = new Employee.EmployeeBuilder()
    .setFirstName("John")
    .setLastName("Doe")
    .setEmployeeID("E12345")
    .setStreetAddress("123 Main St")
    .setCity("Anytown")
    .setState("CA")
    .setZipCode("12345")
    .setContactPhone("555-1234")
    .setContactEmail("fake@email.com")
    .setEmergencyContact1Name("Jane Doe")
    .setEmergencyContact1Phone("555-5678")
    .setEmergencyContact2Name("Jack Doe")
    .setEmergencyContact2Phone("555-8765")
    .build();
```
Notice how the builder pattern allows you to set only the fields you need, and it provides a clear and readable way to create complex objects without having to worry about the order of parameters in a constructor. This can greatly improve code maintainability and reduce the likelihood of errors when creating instances of the `Employee` class.   This is especially true in enterprise level applications where multiple teams and repositories might be involved, as it allows for better code organization and easier maintenance when changes are needed in the future.

## toString() Method

When using data encapsulation, it is often helpful to override the `toString()` method in your classes to provide a meaningful string representation of the object. This can be useful for debugging and logging purposes, as it allows you to easily see the contents of an object when you print it out.

Java classes have a default `toString()` method that returns a string representation of the object, but it is often not very informative. By overriding the `toString()` method, you can provide a more useful representation of the object's state.

For example, in the `Employee` class, you can override the `toString()` method like this:

```java
@Override
public String toString() {
    return "Employee{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", employeeID='" + employeeID + '\'' +
            ", streetAddress='" + streetAddress + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zipCode='" + zipCode + '\'' +
            ", contactPhone='" + contactPhone + '\'' +
            ", contactEmail='" + contactEmail + '\'' +
            ", emergencyContact1Name='" + emergencyContact1Name + '\'' +
            ", emergencyContact1Phone='" + emergencyContact1Phone + '\'' +
            ", emergencyContact2Name='" + emergencyContact2Name + '\'' +
            ", emergencyContact2Phone='" + emergencyContact2Phone + '\'' +
            '}';
```

Since the `toString()` is a member of every Java class, it is the method that is called when you try to print an object.  For example:

```java
Employee employee = new Employee(
    "John", 
    "Doe", 
    "E12345", 
    "123 Main St", 
    "Anytown", 
    "CA", 
    "12345", 
    "555-1234", 
    "fake@email.com",
    "Jane Doe", 
    "555-5678",
    "Jack Doe",
    "555-8765"
);

System.out.println(employee);
```

This will print out the string representation of the `employee` object as defined in the overridden `toString()` method.


## Repository Branches

To help you understand the concepts of data encapsulation, this repository contains multiple version tags.  The `main` branch will have the most up-to-date version of the code.  However, the versions have been tagged in a way that allows you to see the progression of code from a very clumsy and non-encapsulated approach to a more structured and professional approach using data encapsulation, Java record classes, and builder patterns.  

You basically use the `git checkout` command to switch between the different versions of the code.  For example, if you want to see the initial non-encapsulated version of the code, you can use the following command:

```bash 
git checkout v0.1.0
```

This will switch your code to the version tagged as `v0.1.0`, which contains the non-encapsulated approach.  

Below is a list of the different versions and what they contain:

- `v0.1.0`: Non-encapsulated approach with a function that takes all employee details as parameters.
- `v0.2.0`: Encapsulated approach using a traditional Java class with private fields and getters/setters.
- `v0.3.0`: Encapsulated approach using Java record classes for a more concise implementation.
- `v0.4.0`: Encapsulated approach using a builder pattern for better readability and maintainability when dealing with complex objects.
- `v0.5.0`: Using nested record classes to further organize the employee and emergency contact details.
- `v0.6.0`: Overriding `toString()` method to the `Employee` class for better debugging and logging.
- `v0.7.0`: Updated `toString()` to use `StringBuilder` for more efficient string concatenation and better readability.
- `v0.8.0`: Added `toString()` method to the ContactInfo record class to chain the string presentation.

- `v0.9.0`: Implements an overloaded `toString()` method that allows for indentation and better readability when printing the employee details.

# Conclusion

Data encapsulation is one of the foundational principles of object-oriented programming that promotes better code organization, maintainability, and readability.  Try to condition yourself to always utilize data encapsulation in your code. 

The overhead of using data encapsulation is minimal compared to the benefits it provides in terms of code organization and maintainability.  Poorly organized code typically means extreme losses in productivity and very high chances of bugs and errors.  In enterprise level applications, poor handling of data can lead to costly mistakes and legal issues. 

Developers and engineers that demonstrate a strong understanding of data encapsulation and other OOP principles are highly valued in the industry.  They are often seen as more professional and typically obtain jobs as systems architects and senior engineers. 


