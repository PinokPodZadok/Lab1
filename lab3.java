import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class LB33
{
    public static void main(String[] args)
    {
        ArrayList<String> arrlst = new ArrayList<String>();
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите комбинацию чисел от -бесконечности до +бесконечности:");
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < line.length; ++i)
            arrlst.add(line[i]);
        System.out.println("Исходный массив: " + arrlst);
        Collections.sort(arrlst, Collections.reverseOrder());
        
        System.out.println("Результат: " + arrlst);
    }
}
