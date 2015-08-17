import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MyListTest {

    @Test
    public void shouldStartEmpty(){
        MyList list = new MyList();

        assertThat(list.isEmpty(), is(true));
    }

    @Test
    public void shouldAddToFront(){
        MyList list = new MyList();

        list.AddToFront(98);
        list.AddToFront(99);

        list.AddToFront(100);

        assertThat(list.PeekAt(0), is(equalTo(100)));
    }

    @Test
    public void shouldAddToBack(){
        MyList list = new MyList();

        list.AddToFront(98);
        list.AddToFront(99);

        list.AddToBack(100);


        assertThat(list.PeekAt(2), is(equalTo(100)));
    }

    @Test
    public void shouldAddInPosition(){
        MyList list = new MyList();

        list.AddToFront(98);
        list.AddToFront(99);

        list.AddAt(1, 100);

        assertThat(list.PeekAt(1), is(equalTo(100)));
    }

    @Test
         public void shouldCountItems(){
        MyList list = new MyList();

        list.AddToFront(98);
        list.AddToFront(99);
        list.AddToFront(100);

        assertThat(list.size(), is(equalTo(3)));
    }

    @Test
    public void shouldTakeFromFront(){
        MyList list = new MyList();

        list.AddToFront(98);
        list.AddToFront(99);

        list.AddToFront(100);

        assertThat(list.takeItemFromFront(), is(equalTo(100)));
        assertThat(list.size(), is(equalTo(2)));
    }
}
