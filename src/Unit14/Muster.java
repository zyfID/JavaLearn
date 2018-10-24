package Unit14;

import java.util.*;

public class Muster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Collection<String> list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String str = (String)it.next();
//			System.out.println(str); 
//		}
		
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int)(Math.random()*list.size());
		System.out.println("随机获取数组中的元素"+list.get(i));
		list.remove(2);
		System.out.println("删除索引是‘2’的元素后数组中元素是：");
		for(int j=0; j<list.size(); j++)
			System.out.print(list.get(j));

	}

}
