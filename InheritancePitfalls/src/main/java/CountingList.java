import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * This is a famous Java example by Joshua Bloch to highlight the pitfalls of inheritance
 * Created by thaodang on 5/9/16.
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
}
