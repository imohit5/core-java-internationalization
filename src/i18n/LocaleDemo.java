package i18n;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		
		Locale default1 = Locale.getDefault();
		System.out.println(default1);
		System.out.println(default1.getCountry()+" "+default1.getLanguage());
		System.out.println(default1.getDisplayCountry()+" "+default1.getDisplayLanguage());
		
		Locale.setDefault(Locale.UK);
		Locale default2 = Locale.getDefault();
		System.out.println(default2);
		System.out.println(default2.getCountry()+" "+default2.getLanguage());
		System.out.println(default2.getDisplayCountry()+" "+default2.getDisplayLanguage());
		
		String[] isoCountries = Locale.getISOCountries();
		for (String string : isoCountries) {
			System.out.println("country: "+string);
		}
		
		String[] isoLanguages = Locale.getISOLanguages();
		for (String string : isoLanguages) {
			System.out.println("languages: "+string);
		}
	}

}
