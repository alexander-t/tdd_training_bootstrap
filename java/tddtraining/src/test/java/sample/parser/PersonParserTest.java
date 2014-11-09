package sample.parser;

import org.junit.Test;
import sample.domain.Person;

import static org.junit.Assert.assertEquals;

public class PersonParserTest {

    @Test
    public void parse_CorrectLine_ParsesIntoAValidPerson() {
        String line = "Abel;Abelsson;Abelgatan;12";
        Person expected = new Person("Abel", "Abelsson", "Abelgatan", 12);

        assertEquals(expected, new PersonParser().parse(line));
    }
}
