package i18n;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {

		Double d = 123456789.0123;

		NumberFormat nf1 = NumberFormat.getInstance();
		// nf1.setMinimumFractionDigits(4);
		// nf1.setMinimumIntegerDigits(4);
		nf1.setMaximumFractionDigits(2);
		nf1.setMaximumIntegerDigits(2);
		System.out.println(nf1.format(d));

		NumberFormat nf2 = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(nf2.format(d));
	}

}
