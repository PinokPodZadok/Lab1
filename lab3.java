import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LB3 {

	public static void main(String[] args) {
		// create array list object
		ArrayList<String> arrlst = new ArrayList<String>();
		// populate the list
		System.out
				.print("Введите комбинацию цифр от минус бесконечности до плюс бесконечности: ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);// Создаем сканер
		String str = s.nextLine();
		int c = 0;
		for (int i = 0; i < str.length(); i++) {

			c = str.codePointAt(i);
			if (c == 32) {
			} else  {
				arrlst.add(str);
			}
		}

		System.out.println("Вы ввели комбинацию :" + arrlst);
		Collections.sort(arrlst, Collections.reverseOrder());
		System.out.println("Отсортированная комбинация :" + arrlst);
	}
}
