import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class LB3 {
	public static void main(String[] args) {
		ArrayList<Integer> arrlst = new ArrayList<Integer>();// Создаем массив
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);// Создаем сканер

		System.out
				.println("Введите комбинацию ЧИСЕЛ от -бесконечности до +бесконечности:");// Приглашаем
													// ввести
													// числа
		String[] line = sc.nextLine().split(" ");// Разделяем цифры
		int i = 0; // обнуляем переменную i
		try { // Пока
			for (i = 0; i < line.length; ++i)
				// Создаем цикл
				arrlst.add(Integer.parseInt(line[i])); // Записываем цифры
		} catch (NumberFormatException e) { // Если не цифра
			System.out.println("Неверный формат данных: " + line[i]); // Тогда
										// выводим
										// предупреждение
			return; // возвр.
		}
		System.out.println("Исходный массив: " + arrlst); // Выводим введеный
								// текст
		Collections.sort(arrlst, Collections.reverseOrder()); // Сортируем

		System.out.println("Результат: " + arrlst);// Выводим отсортированый
							// текст
	}
}
