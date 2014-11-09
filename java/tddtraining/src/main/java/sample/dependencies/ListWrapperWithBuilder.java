package sample.dependencies;

import java.util.List;

public class ListWrapperWithBuilder {
    private List<Integer> wrapped;

    public int getWrappedListSize() {
        return wrapped.size();
    }

    public ListWrapperWithBuilder(IntegerListBuilder builder) {
        wrapped = builder.build();
    }
}


