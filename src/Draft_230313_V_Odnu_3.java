import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Draft_230313_V_Odnu_3 {
    public static void main(String[] args) throws IOException {
        // считываем строку из консоли
        System.out.print("Введите несколько чисел через пробел (или не пробел): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();

        // применяем метод split и получаем массив из строк
        // что такое "\\D+" ? это параметр метода split,
        // регулярное выражение, описывающее любое ненулевое количество не цифр
        // в частности пробел, попробуйте подставить " ", тоже сработает
        // но "\\D+" сработает независимо от того какие вообще символы между цифрами
        String[] splitStr = str.split("\\D+");

        // создаем массив из чисел, равный по длине массиву из строк
        // после разделения через "\\D+" в splitStr будут гарантированно цифры
        // попробуйте ввести "1 2 3 коза 4"
        int [] arr = new int[splitStr.length];

        // преобразуем каждую строку в число и записываем в ячейку с тем же номером
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(splitStr[i]);
        }

        // проверяем результат, воспользовавшись методом Arrays.toString
        System.out.println(Arrays.toString(arr));
    }
}
