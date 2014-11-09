package sample.dependencies;

import java.util.Arrays;
import java.util.List;

/**
 * Contrived example of a dependency
 */
public class ListWrapper {
    private List<Integer> wrapped;

    public int getWrappedListSize() {
        return wrapped.size();
    }

    public ListWrapper() {
        wrapped = Arrays.asList(1, 2, 3);
    }
}


