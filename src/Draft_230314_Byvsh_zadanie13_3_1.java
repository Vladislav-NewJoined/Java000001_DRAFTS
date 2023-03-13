import java.util.Scanner;

public class Draft_230314_Byvsh_zadanie13_3_1 {
    /* 13. Мини-игра в слова. Первый игрок вводит слово. Потом второй
        игрок вводит два числа, с какого по какой символ можно найти слово внутри
        исходного, используя substring. Потом первый игрок вводит два числа.
        Побеждает тот, чье слово длиннее. Пример:
        1: революционный
        2: 0 3 (вывод: рев)
        1: 7 13 (вывод: ионный)
        Победил игрок 1 */
    // В одну строку использовать split

    public static void main(String[] args) {

        System.out.print("Игрок 1, введите исходное слово: ");
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s,;]+");
        String inWord = scanner.next();

        System.out.println("Игрок 2, введите два порядковых номера символов (разделитель: , или ;): ");
        int num1 = scanner.nextInt() - 1;
        int num2 = scanner.nextInt();
        String fragmentWord2 = inWord.substring(num1, num2);
        System.out.println(fragmentWord2);

        System.out.println("Игрок 1, введите два порядковых номера символо (разделитель: , или ;): ");
        int num3 = scanner.nextInt() - 1;
        int num4 = scanner.nextInt();
        String fragmentWord1 = inWord.substring(num3, num4);
        System.out.println(fragmentWord1);

        int len2 = fragmentWord2.length();
        int len1 = fragmentWord1.length();

        if (len2 > len1) {
            System.out.println("Победил игрок 2.");
        } else if (len1 > len2) {
            System.out.println("Победил игрок 1.");
        } else {
            System.out.println("Длины слов равны. Ничья.");
        }
    }
}
