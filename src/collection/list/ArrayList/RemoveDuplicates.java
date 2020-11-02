package collection.list.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(4);
		System.out.println("Numbers without removing duplicates="+list);
		Set<Integer> listWithoutDuplicates=new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(listWithoutDuplicates);
		System.out.println("Numbers after removing duplicates="+list);
	}
}
