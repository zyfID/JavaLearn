package Homework14;

import java.util.*;

public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=0;
		List<Integer>list = new ArrayList<>();
		for(int i=1; i<=100; i++) {
			list.add(i);
		}
		
		System.out.println("移除元素前：");
		for (Integer integer : list) {
			System.out.print(integer+" ");
			m++;
			if(m==10)
			{
				System.out.println();
				m=0;
			}
		}
		
		list.remove(10);
		
		System.out.println("移除元素后：");
		for (Integer integer : list) {
			System.out.print(integer+" ");
			m++;
			if(m==10)
			{
				System.out.println();
				m=0;
			}
		}

	}

}
