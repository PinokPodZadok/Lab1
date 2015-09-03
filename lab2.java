import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LB2 {

	public static void main(String[] args) {
	
	
	// проверка на соответствие строки шаблону
	Pattern p1 = Pattern.compile ("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
	Matcher m1 = p1.matcher( "12FFAA" );
	boolean b = m1.matches();
	System.out.println(b);
	}
}
