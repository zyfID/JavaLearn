package Homework14;

import java.util.*;

public class Qus3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 = new Emp("011", "zhang");
		Emp e2 = new Emp("013", "shao");
		Emp e3 = new Emp("015", "liu");
		Emp e4 = new Emp("017", "hong");
		
		TreeMap<String, String>map = new TreeMap<>();
		map.put(e1.getId(), e1.getName());
		map.put(e2.getId(), e3.getName());
		map.put(e3.getId(), e3.getName());
		map.put(e4.getId(), e4.getName());
		
		Iterator<String>mapIt = map.keySet().iterator();
		System.out.println("删除‘015’的对象之前：");
		while(mapIt.hasNext()) {
			String id = (String)mapIt.next();
			String name = (String)map.get(id);
			System.out.println(id+" "+name);
		}
		
		String rmId = "015 ";
		map.remove(rmId);
		mapIt = map.keySet().iterator();
		System.out.println("删除‘015’的对象之后：");
		while(mapIt.hasNext()) {
			String id = (String)mapIt.next();
			String name = (String)map.get(id);
			System.out.println(id+" "+name);
		}
		
		
		
	}

}
