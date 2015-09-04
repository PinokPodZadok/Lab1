import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class LB3
{
    public static void main(String[] args)
    {
        ArrayList<String> arrlst = new ArrayList<String>();//Создаем массив
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//Создаем сканер
        
        System.out.println("Введите комбинацию чисел от -бесконечности до +бесконечности:");//Приглашаем ввести числа
        String[] line = sc.nextLine().split(" ");//Разделяем цифры
        for (int i = 0; i < line.length; ++i)//Создаем цикл
            arrlst.add(line[i]);
        System.out.println("Исходный массив: " + arrlst); //Выводим введеный текст
        Collections.sort(arrlst, Collections.reverseOrder());//Сортируем
        
        System.out.println("Результат: " + arrlst);//Выводим отсортированый текст
    }
}
