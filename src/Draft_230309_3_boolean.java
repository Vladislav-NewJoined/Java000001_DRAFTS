import java.util.Scanner;

public class Draft_230309_2_boolean {
    public static void main(String[] args) {
        String tru = "true";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 'true' or 'false': ");
        int x = scanner.nextInt();


        boolean b = true;
        System.out.println("value of b is: " + b);

        b = (x <= 8);
        System.out.println("Value of b is: " + b);
    }

}