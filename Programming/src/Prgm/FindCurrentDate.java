package Prgm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FindCurrentDate {
	public static void main(String[] args) {
		Date currdate = new Date(System.currentTimeMillis());
	 System.out.println(currdate);
	 
	 DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	 
	 System.out.println();
	}

}
