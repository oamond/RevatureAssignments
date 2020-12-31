package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateReadValidationDemo {

	public static void main(String[] args) {
		
		String s= "10.02.200"; //dd,MM,yyyy
		SimpleDateFormat sdf= new SimpleDateFormat("dd.MM.yyyy");
		if (s.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
			
			sdf.setLenient(false);
			Date dob = null;
			try {
				dob = sdf.parse(s); //Takes tring and reformats 
			System.out.println("dob validate with dob = "+dob);
		} 	catch (ParseException e) {
				System.out.println(e);
		} 
		} else {
			System.out.println("invalid date");
		}
	}
}
	
	

