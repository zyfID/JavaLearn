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
		
		UpdateStu stu1 = new UpdateStu("��ͬѧ", 01011);
		UpdateStu stu2 = new UpdateStu("��ͬѧ", 01021);
		UpdateStu stu3 = new UpdateStu("��ͬѧ", 01051);
		UpdateStu stu4 = new UpdateStu("��ͬѧ", 01012);
		
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		
		Iterator<UpdateStu> it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName()+" "+it.next().getId());
			//��������д�����ԣ�it.next()��һֱ�ڱ仯�ģ�Ӧ����ת�ͳɶ��������
		}
		
//		TreeSet<UpdateStu> tree = new TreeSet<>();
//		tree.add(stu1);
//		tree.add(stu2);
//		tree.add(stu3);
//		tree.add(stu4);
//		Iterator<UpdateStu>it = tree.iterator();
//		System.out.println("set�����е�����Ԫ�أ�");
//		while(it.hasNext()) {
//			UpdateStu stu = (UpdateStu)it.next();
//			System.out.println(stu.getId()+" "+stu.getName());
//		}
//		
//		it = tree.headSet(stu2).iterator();
//		System.out.println("��ȡǰ�沿�ֵļ��ϣ�");
//		while(it.hasNext()) {
//			UpdateStu stu = (UpdateStu)it.next();
//			System.out.println(stu.getId()+" "+stu.getName());
//		}
//		
//		it = tree.subSet(stu2, stu3).iterator();
//		System.out.println("��ȡ�м䲿�ֵļ��ϣ�");
//		while(it.hasNext()) {
//			UpdateStu stu = (UpdateStu)it.next();
//			System.out.println(stu.getId()+" "+stu.getName());
//		}

	}

}
