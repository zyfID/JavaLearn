package Unit14;

import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;


public class UpdateStu implements Comparable<Object> {
	String name;
	long id;
	
	public UpdateStu(String name, long id) {
		this.name = name;
		this.id = id;
	}
	
	public int compareTo(Object o) {
		UpdateStu upstu = (UpdateStu)o;
		int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
		return result;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UpdateStu stu1 = new UpdateStu("李同学", 01011);
		UpdateStu stu2 = new UpdateStu("陈同学", 01021);
		UpdateStu stu3 = new UpdateStu("王同学", 01051);
		UpdateStu stu4 = new UpdateStu("马同学", 01012);
		
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		
		Iterator<UpdateStu> it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName()+" "+it.next().getId());
			//上面这种写法不对，it.next()是一直在变化的，应该先转型成对象输出。
		}
		
//		TreeSet<UpdateStu> tree = new TreeSet<>();
//		tree.add(stu1);
//		tree.add(stu2);
//		tree.add(stu3);
//		tree.add(stu4);
//		Iterator<UpdateStu>it = tree.iterator();
//		System.out.println("set集合中的所有元素：");
//		while(it.hasNext()) {
//			UpdateStu stu = (UpdateStu)it.next();
//			System.out.println(stu.getId()+" "+stu.getName());
//		}
//		
//		it = tree.headSet(stu2).iterator();
//		System.out.println("截取前面部分的集合：");
//		while(it.hasNext()) {
//			UpdateStu stu = (UpdateStu)it.next();
//			System.out.println(stu.getId()+" "+stu.getName());
//		}
//		
//		it = tree.subSet(stu2, stu3).iterator();
//		System.out.println("截取中间部分的集合：");
//		while(it.hasNext()) {
//			UpdateStu stu = (UpdateStu)it.next();
//			System.out.println(stu.getId()+" "+stu.getName());
//		}

	}

}
