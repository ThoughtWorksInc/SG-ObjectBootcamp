import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountingListTest {

    @Test
    public void shouldReturnCorrectCounterForAddingASingleElement() {
        CountingStringList countingList = new CountingStringList();

        countingList.add("Batman");

        assertEquals(1, countingList.getCounter());
    }

    @Test
    public void shouldReturnCorrectCounterForAddingASingleElementMultipleTimes() {
        CountingStringList countingList = new CountingStringList();

        countingList.add("me");
        countingList.add("you");

        assertEquals(2, countingList.getCounter());
    }

    @Test
    public void shouldReturnCorrectCounterForAddingMultipleElements() {
        CountingStringList countingList = new CountingStringList();
        List<String> myList = Arrays.asList("Batman", "Robin");

        countingList.addAll(myList);
        //FIXME: Why did this unit test fail???
        assertEquals(2, countingList.getCounter());
    }

    @Test
    public void shouldReturnTheCorrectToStringFormat() {
        CountingStringList countingList = new CountingStringList();
        List<String> myList = Arrays.asList("Batman", "Robin");

        countingList.addAll(myList);

        //This unit test fails for the same reason as the one above.
        assertEquals("Added 2 elements: Batman, Robin", countingList.toString());
    }
}
