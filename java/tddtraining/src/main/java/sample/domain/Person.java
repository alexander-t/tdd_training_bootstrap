package sample.domain;

/**
 * Simplified typical "domain" class without an equals() to make things interesting.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final String streetName;
    private final int streetNumber;

    public Person(String firstName, String lastName, String streetName, int streetNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}