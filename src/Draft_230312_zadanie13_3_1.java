import java.util.Scanner;

public class Draft_230312_zadanie13_3_1 {
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
        /* инфо здесь: https://ru.stackoverflow.com/questions/1275581/%D0%9A%D0%B0%D0%BA-%D1%81-%D0%BF%D0%BE%D0%BC%D0%BE%D1%89%D1%8C%D1%8E-scanner-%D1%81%D1%87%D0%B8%D1%82%D1%8B%D0%B2%D0%B0%D1%82%D1%8C-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D1%83-%D0%BF%D0%BE%D0%BB%D0%BD%D0%BE%D1%81%D1%82%D1%8C%D1%8E-%D1%81-%D1%83%D1%87%D1%91%D1%82%D0%BE%D0%BC-%D0%BF%D1%80%D0%BE%D0%B1%D0%B5%D0%BB%D0%BE%D0%B2 */
        // Здесь полезная инфо есть: https://www.examclouds.com/ru/java/java-core-russian/console-vvod-vivod
        System.out.print("Игрок 1, введите исходное слово: ");
        Scanner inWordScan = new Scanner(System.in); //new InputStreamReader
        String inWord = inWordScan.next();

        System.out.println("Игрок 2, введите два порядковых номера символов (разделение - клавиша Enter): ");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int num1 = scan1.nextInt() - 1;
        int num2 = scan2.nextInt();
        String fragmentWord2 = inWord.substring(num1, num2);
        System.out.println(fragmentWord2);

        System.out.println("Игрок 1, введите два порядковых номера символов (разделение - клавиша Enter): ");
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        int num3 = scan3.nextInt() - 1;
        int num4 = scan4.nextInt();
        String fragmentWord1 = inWord.substring(num3, num4);
        System.out.println(fragmentWord1);

        int len2 = fragmentWord2.length();
        int len1 = fragmentWord1.length();

        if (len2 > len1) {
            System.out.println("Победил игрок 2.");
        } else {
            if (len1 > len2) {
                System.out.println("Победил игрок 1.");
            } else {
                if (len1 == len2) {
                    System.out.println("Длины слов равны. Ничья.");
                }
            }
        }
    }
}