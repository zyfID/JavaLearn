package Unit14;

import java.util.*;

public class MapText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();//������ʵ����ֱ��ʵ����HashMap����
		HashMap<String, String> hashmap = new HashMap<>();
		
		Emp e1 = new Emp("351", "����");
		Emp e2 = new Emp("521", "����");
		Emp e3 = new Emp("853", "��һ");
		Emp e4 = new Emp("125", "����");
		Emp e5 = new Emp("341", "����");
		
		map.put(e4.getId(), e4.getName());
		map.put(e5.getId(), e5.getName());
		map.put(e1.getId(), e1.getName());
		map.put(e2.getId(), e2.getName());
		map.put(e3.getId(), e3.getName());
		
		hashmap.put(e4.getId(), e4.getName());
		
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
//		while(it.hasNext()) {
//			String str = (String)it.next();
//			String name = (String)map.get(str);
//			System.out.println(str+" "+name);
//		}
		
		Set<String>set = map.keySet();
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			String name = map.get(str);
			System.out.println(str+" "+name);
		}
		
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.putAll(map);
		
		it = treemap.keySet().iterator();
		System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����");
		while(it.hasNext()) {
			String id = (String)it.next();
			String name2 = treemap.get(id);
			System.out.println(id+" "+name2);
		}

	}

}
