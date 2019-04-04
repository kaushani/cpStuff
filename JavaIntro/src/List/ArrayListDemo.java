package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(2,50);//add(index, element)
		Iterator<Integer> itr= list.iterator();
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}*/
		//System.out.println(list);
		for(Integer a:list)
		{
			System.out.println(a);
		}
	}

}
