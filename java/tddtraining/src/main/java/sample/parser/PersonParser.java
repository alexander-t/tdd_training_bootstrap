package sample.parser;

import sample.domain.Person;

/**
 * Trivial happy path parser that creates a Person out of a string.
 */
public class PersonParser {
    public Person parse(String line) {
        String fields[] = line.split(";");
        return new Person(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]));
    }
}
