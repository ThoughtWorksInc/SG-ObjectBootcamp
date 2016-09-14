import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a famous Java example by Joshua Bloch to highlight the pitfalls of inheritance
 */
public class CountingList extends MyStringList {
    private int counter = 0;

    @Override
    public void add(String t) {
        super.add(t);
        counter ++;
    }

    @Override
    public void addAll(Collection<String> c) {
        super.addAll(c);
        counter += c.size();
    }

    public int getCounter() {
        return counter;
    }

    public String toString() {
        return String.format("Added %d elements: %s", counter, super.concatenateList(", "));
    }

    public class SideEffectVsImmutable {
        public List<Integer> multiplyByTwoWithForLoop(List<Integer> list) {
            for(int i = 0; i < list.size(); i++) {
                int doubled = list.get(i) * 2;
                list.set(i, doubled);
            }
            return list;
        }

        public List<Integer> multiplyByTwoWithStream(List<Integer> list) {
            return list.stream().map((x) -> x * 2).collect(Collectors.toList());
            //list.stream(): creates a stream from the list
            //map(Function<Integer, Integer> f): map applies the given function f to transform every element in the stream
            //collect(Collectors.toList()) the stream elements back into a list
        }

        public String transformToString(int x,
                                        Function<Integer, Integer> transformFunction) {
            int transformed = transformFunction.apply(x);
            return String.valueOf(transformed);
        }

        public String doubleUp(int x) {
            return transformToString(x, y -> y * 2);
        }

        public String tripleUp(int x) {
            return transformToString(x, y -> y * 3);
        }

        public String toBase2String(int x) {
            return transformToString(x, this::toBase2);
        }

        public int toBase2(int x) {
            return x % 2;
        }

    }
}
