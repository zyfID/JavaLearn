package Unit20;

import java.sql.*;

public class Conn {
	
	Connection con;
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/jol";
	private static final String NAME = "root";
	private static final String PASSWD = "";
	
	public Connection getConnection() {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("驱动失败");
		}
		
		try {
			//con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_db", "root", "");
			con = DriverManager.getConnection(URL, NAME, PASSWD);
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conn c = new Conn();
		c.getConnection();

	}

}
