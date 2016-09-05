import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountingListTest {

    @Test
    public void shouldReturnCorrectCounterForAddingASingleElement() {
        CountingList countingList = new CountingList();
        countingList.add("me");
        assertEquals(1, countingList.getCounter());
    }

    @Test
    public void shouldReturnCorrectCounterForAddingASingleElementMultipleTimes() {
        CountingList countingList = new CountingList();
        countingList.add("me");
        countingList.add("you");
        assertEquals(2, countingList.getCounter());
    }

    @Test
    public void shouldReturnCorrectCounterForAddingMultipleElements() {
        CountingList countingList = new CountingList();
        List<String> myList = Arrays.asList("me", "you");
        countingList.addAll(myList);
        assertEquals(2, countingList.getCounter());
    }
}
