package i18n;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format1 = sdf1.format(new Date());
		System.out.println(format1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-M-dd");
		Date parse2 = sdf2.parse("2012-12-24");
		System.out.println(parse2);
		String format2 = sdf1.format(parse2);
		System.out.println(format2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("G dd/MM/yyyy hh:mm:ss a zzzz");
		String format3 = sdf3.format(new Date());
		System.out.println(format3);
		
	}

}
