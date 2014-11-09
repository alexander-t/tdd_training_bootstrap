package sample.testutil;

import org.hamcrest.Description;
import org.junit.internal.matchers.TypeSafeMatcher;
import sample.domain.Person;

public class AllNamesStartWithMatcher extends TypeSafeMatcher<Person> {

    private final String expectedPrefix;

    public AllNamesStartWithMatcher(String expectedPrefix) {
        this.expectedPrefix = expectedPrefix;
    }

    @Override
    public boolean matchesSafely(Person person) {
        return person.getFirstName().startsWith(expectedPrefix)
                && person.getLastName().startsWith(expectedPrefix)
                && person.getStreetName().startsWith(expectedPrefix);
    }

    @Override
    public void describeTo(Description desc) {
        desc.appendText("All names starting with " + expectedPrefix);
    }
}