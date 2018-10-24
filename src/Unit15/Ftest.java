package Unit15;

import java.io.*;


public class Ftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String content[] = {"好久不见","最近好吗","常联系"};
		File file = new File("d:/myword/word.txt");
//		if(file.exists()) {
//			//file.delete();
//			System.out.println("cunzai");
//		}else {
//			System.out.println("文件不存在");
//		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bufw = new BufferedWriter(fw);
			for(int k=0; k<content.length; k++) {
				bufw.write(content[k]);
				bufw.newLine();
			}
			
			bufw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			FileReader fr =new FileReader(file);
			BufferedReader bufr = new BufferedReader(fr);
			String s1 = null;
			int i = 0;
			while((s1=bufr.readLine())!=null) {
				i++;
				System.out.println("第"+i+"行的内容是："+s1);
			}
			bufr.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
