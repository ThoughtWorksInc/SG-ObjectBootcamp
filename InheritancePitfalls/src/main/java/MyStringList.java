import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyStringList {
	private ArrayList<String> list = new ArrayList<>();
	public void add(String t) {
		list.add(t);
	}
	public void addAll(Collection<String> t) {
		t.forEach(this::add);
	}
}
