package List;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		List<String> list= new LinkedList<>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		ListIterator<String> itr= list.listIterator();
		System.out.println("Traversing list forward");
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Traversing the list in the backward direction");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
