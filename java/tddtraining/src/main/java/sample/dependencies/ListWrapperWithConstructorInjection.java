package sample.dependencies;

import java.util.List;

public class ListWrapperWithConstructorInjection {
    private List<Integer> wrapped;

    public int getWrappedListSize() {
        return wrapped.size();
    }

    public ListWrapperWithConstructorInjection(List<Integer> data) {
        wrapped = data;
    }
}


