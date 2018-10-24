import java.util.Date;

public class GetDate {
	public static void main(String[] args) {
		Date date = new Date();
		String time = String.format("%tc", date);
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}
