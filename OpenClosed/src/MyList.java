import java.util.LinkedList;

public class MyList {
    private LinkedList<Integer> list = new LinkedList<>();

    public void AddToFront(Integer number){
        list.addFirst(number);
    }

    public void AddToBack(Integer number){
        list.addLast(number);
    }

    public void AddAt(int index, Integer number){
        list.add(index, number);
    }

    public Integer PeekAt(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public Integer takeItemFromFront() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
