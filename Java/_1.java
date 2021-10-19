import java.util.Scanner;

public class _1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the first number: ");
        int x = sc.nextInt();
        System.out.println();

        System.out.print("Please enter the second number: ");
        int y = sc.nextInt();
        System.out.println();

        System.out.println("Currently `x` = `" + x + "`, and `y` = `" + y + '`' + '.');
        x += y;
        y = x - y;
        x -= y;

        System.out.print("Numbers swapped! Now `x` = `" + x + "`, and `y` = `" + y + '`' + '.');

    } // End of main()
}