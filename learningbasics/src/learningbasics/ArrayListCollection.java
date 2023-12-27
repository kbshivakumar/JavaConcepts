package learningbasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		ArrayList<Object> Al=new ArrayList<Object>();
		
		Al.add("Shiva");
		Al.add(210);
		Al.add(210);
		//Al.remove(1);
		Al.size();
		
		System.out.println(Al);
		System.out.println(Al.size());
		
		for(int i=0;i<Al.size();i++)
		{
			System.out.println(Al.get(i));
		}

		System.out.println("----------Inside ForEach");
		for (Object object : Al) {
			System.out.println(object);
	}
		
		
		System.out.println("----------------We are inside HashSet");
		
		HashSet<Object> HM=new HashSet<Object>();
		HM.add(10);
		HM.add("Shiva");
		HM.add(10);
		System.out.println(HM);
	}
}
