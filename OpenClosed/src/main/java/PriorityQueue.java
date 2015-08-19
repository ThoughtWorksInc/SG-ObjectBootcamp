/**
 * Created by thaodang on 18/8/15.
 */
public class PriorityQueue {
    private MyList myList;
    public PriorityQueue() {
        myList = new MyList();
    }

    public void add(int number) {
        int index = getIndexToAdd(number);
        myList.AddAt(index, number);
    }

    private int getIndexToAdd(int number) {
        for (int i= 0; i < myList.size(); i++) {
            if(myList.PeekAt(i) >= number) {
                return i;
            }
        }
        return myList.size();
    }

    public int size() {
        return myList.size();
    }

    public int take() {
        return myList.takeItemFromFront();
    }
}
