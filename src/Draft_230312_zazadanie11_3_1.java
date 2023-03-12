import java.util.Scanner;

public class Draft_230312_zazadanie11_3_1 {
    /* 13. Мини-игра в слова. Первый игрок вводит слово. Потом второй
        игрок вводит два числа, с какого по какой символ можно найти слово внутри
        исходного, используя substring. Потом первый игрок вводит два числа.
        Побеждает тот, чье слово длиннее. Пример:
        1: революционный
        2: 0 3 (вывод: рев)
        1: 7 13 (вывод: ионный)
        Победил игрок 1 */

    public static void main(String[] args) {
        /* инфо здесь: https://ru.stackoverflow.com/questions/1275581/%D0%9A%D0%B0%D0%BA-%D1%81-%D0%BF%D0%BE%D0%BC%D0%BE%D1%89%D1%8C%D1%8E-scanner-%D1%81%D1%87%D0%B8%D1%82%D1%8B%D0%B2%D0%B0%D1%82%D1%8C-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D1%83-%D0%BF%D0%BE%D0%BB%D0%BD%D0%BE%D1%81%D1%82%D1%8C%D1%8E-%D1%81-%D1%83%D1%87%D1%91%D1%82%D0%BE%D0%BC-%D0%BF%D1%80%D0%BE%D0%B1%D0%B5%D0%BB%D0%BE%D0%B2 */

        Scanner scan1 = new Scanner(System.in); //new InputStreamReader
        System.out.print("Enter an Initial word: ");
        String inWord = scan1.next();
        int n = 2;
        System.out.print("Player 2, enter a numbers of chars 1, 2: ");
        //int charsFirst =
        int num1 = scan1.nextInt();
        int num2 = scan1.nextInt();
        System.out.print(num1);
        System.out.print(" ");
        System.out.print(num2);




        /* Scanner scan2 = new Scanner(System.in);
        System.out.print("Player 2: Please enter two number of chars: "); */
        /* int num1 = scan.nextInt();
        System.out.print(" ");
        int num2 = scan.nextInt();
        String word1 = inWord.substring(num1, num2);
        System.out.println(word1); */


        System.out.println(inWord);
    }
}