import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class LB2 {

	public static void main(String[] args) {

		System.out
				.print("               Проверка индификатора цвета. \n – пример правильных выражений: #FFFFFF, #FF3421, #00ff00. \n – пример неправильных выражений: 232323, f#fddee, #fd2.\n Введите индификатор цвета: ");// Приглашение
																													// ввести
		@SuppressWarnings("resource")																											// текст
		Scanner s = new Scanner(System.in);// Создаем сканер
		String str = s.nextLine();// Сканируем введеный текст
		// проверка на соответствие строки шаблону
		Pattern p1 = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");// Создаем
			     								// регулярное
											// выражение
		Matcher m1 = p1.matcher(str);// Сравниваем с условием
		boolean b = m1.matches();// Проверяем на истинность выражение
		System.out.println(b);// Выводим результат
	}
}

