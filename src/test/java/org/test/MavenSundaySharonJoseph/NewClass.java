package org.test.MavenSundaySharonJoseph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewClass 
{
	public static void main(String[] args)
	{
		int r[] = {1,2,3,4,};
		int[] clone = r.clone();
		int length = clone.length;
		System.out.println(length);
		
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(100,200,300,400));
		int size = li.size();
		System.out.println(size);
		int indexOf = li.indexOf(300);
		System.out.println(indexOf);
	}

}
