package sample.dependencies;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerListBuilder {
    private int startingAt = 1;
    private int endingWith = 10;

    public IntegerListBuilder startingAt(int startingAt) {
        this.startingAt = startingAt;
        return this;
    }

    public IntegerListBuilder endingWith(int endingWith) {
        this.endingWith = endingWith;
        return this;
    }

    public List<Integer> build() {
        return IntStream.range(startingAt, endingWith + 1)
                .boxed().collect(Collectors.toList());
    }
}
