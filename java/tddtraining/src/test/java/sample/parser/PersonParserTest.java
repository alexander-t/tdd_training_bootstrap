package sample.parser;

import org.junit.Test;
import sample.domain.Person;
import sample.testutil.AllNamesStartWithMatcher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PersonParserTest {

    @Test
    public void parse_CorrectLine_ParsesIntoAValidPerson() {
        String line = "Abel;Abelsson;Abelgatan;12";
        Person expected = new Person("Abel", "Abelsson", "Abelgatan", 12);

        assertEquals(expected, new PersonParser().parse(line));
    }

    @Test
    public void demonstrateAssertThatWithACustomMatcher() {
        String line = "Abel;Abelsson;Abelgatan;12";
        assertThat(new PersonParser().parse(line), new AllNamesStartWithMatcher("Abel"));
    }
}
