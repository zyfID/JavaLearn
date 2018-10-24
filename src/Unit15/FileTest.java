package Unit15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		File file = new File("d:/myword", "word.txt");
//		if(file.exists()) {
//			file.delete();
//			System.out.println("文件已删除");
//		}else {
//			try {
//				file.createNewFile();
//				System.out.println("文件已创建");
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
		
		
		File file = new File("d:/myword", "word.txt");
		if(file.exists()) {
			String name = file.getName();
			long length = file.length();
			String path = file.getAbsolutePath();
			System.out.println(name);
			System.out.println(length);
			System.out.println(path);
		}else {
			System.out.println("文件不存在");
		}
		
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "我有一只小毛驴，我从来也不骑。".getBytes();
			out.write(buy);
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println("文件中的信息是："+new String(byt, 0, len));
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
