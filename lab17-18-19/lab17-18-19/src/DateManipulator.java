import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.*;
public class DateManipulator {
	public static void main(String[] args) {
		DateManipulator dm = new DateManipulator();
		
		LocalDate curDate = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("curr date" + curDate);
		
		//date->string 
		System.out.println("enter date in String format ");
		String s=sc.next();
		LocalDate dt = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("String to date=" +dt);
		
		//string->date
		SimpleDateFormat formatter =new SimpleDateFormat("dd/MM/yyyy");
		Date date= new Date();
		String strDate = formatter.format(date);
		System.out.println("date to string" + strDate);
	
		LocalDate d1= LocalDate.of(2023,1,1);
		LocalDate d2= LocalDate.of(2023,12,22);
		long days= ChronoUnit.DAYS.between(d1, d2);
		System.out.println("difference between 2023/1/1 and 2023/12/22 is "+ days + "days" );
		
		
	}

}
