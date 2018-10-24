package Homework14;

import java.util.*;

public class Qus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list = new ArrayList<>();
		Set<String>set = new TreeSet<>();
		
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("D");
		list.add("a");
		
		for (String m : list) {
			System.out.print(m+" ");
		}
		
		System.out.println();
		
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("D");
		set.add("a");
		
		for (String n : set) {
			System.out.print(n+" ");
		}
		

	}

}
