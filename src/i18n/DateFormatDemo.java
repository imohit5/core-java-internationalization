package i18n;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat instance1 = DateFormat.getInstance();
		System.out.println("Date in default: "+instance1.format(date));
		
		DateFormat instance2 = DateFormat.getDateInstance(0,Locale.US);
		System.out.println("Date in 0: "+instance2.format(date));
		
		DateFormat instance3 = DateFormat.getDateInstance(1,Locale.US);
		System.out.println("Date in 1: "+instance3.format(date));
		
		DateFormat instance4 = DateFormat.getDateInstance(2,Locale.US);
		System.out.println("Date in 2: "+instance4.format(date));
		
		DateFormat instance5 = DateFormat.getDateInstance(3,Locale.US);
		System.out.println("Date in 3: "+instance5.format(date));
		
		DateFormat timeInstance1 = DateFormat.getTimeInstance();
		System.out.println("Time in default: "+timeInstance1.format(date));
		
		DateFormat timeInstance2 = DateFormat.getTimeInstance(0,Locale.US);
		System.out.println("Time in 0: "+timeInstance2.format(date));
		
		DateFormat timeInstance3 = DateFormat.getTimeInstance(1,Locale.US);
		System.out.println("Time in 1: "+timeInstance3.format(date));
		
		DateFormat timeInstance4 = DateFormat.getTimeInstance(2,Locale.US);
		System.out.println("Time in 2: "+timeInstance4.format(date));
		
		DateFormat timeInstance5 = DateFormat.getTimeInstance(3,Locale.US);
		System.out.println("Time in 3: "+timeInstance5.format(date));
		
		DateFormat dateTimeInstance1 = DateFormat.getDateTimeInstance();
		System.out.println("DateTime in default: "+dateTimeInstance1.format(date));
		
		DateFormat dateTimeInstance2 = DateFormat.getDateTimeInstance(0,0);
		System.out.println("DateTime in default: "+dateTimeInstance2.format(date));
		
		
	}

}
