package collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("Third");
		al.add(1,"Second");

		for(String str : al) {
			System.out.print(str+" ");
		}

		System.out.println();
		System.out.println("Value at index 0= "+al.get(0));
		System.out.println("Index position of 'Second' in ArrayList= "+al.indexOf("Second"));
		al.remove("First");
		System.out.println("'First' is removed from ArrayList");
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.print(itr.next()+" ");  
		}  

	}
}

