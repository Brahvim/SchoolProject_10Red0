import java.util.Scanner;

public class _8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Till what number do you want the sum of all numbers printed?");
        int x = sc.nextInt();

        System.out.println("Please wait..." + x);

        int s;
        for (s = 0; x > 0; x--)
            s += x;

        System.out.println("The sum is: " + s);
        sc.close();
    }
}