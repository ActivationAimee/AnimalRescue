import java.sql.Date;
import java.util.Calendar;

import vo.AnimalDAO;
import vo.Animal_adopt;

public class test {

	public static void main(String[] args) {
		String date = "2019-04-01";
		String date1 = date.substring(0, 4);
		System.out.println(date1);
		String date2 = date.substring(5, 7);
		System.out.println(date2);
		String date3 = date.substring(8);
		System.out.println(date3);
		
		String a = "2019-04-09 00:00:00";
		String b = a.substring(0, 10);
		System.out.println(b);
		
	}

}
