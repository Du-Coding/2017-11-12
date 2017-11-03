package sort;

import java.util.Comparator;

public class SortTag implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		return o1.toString().compareTo(o2.toString());
	} 
}
