import java.util.Scanner;

public class _4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, S;

        System.out.println("This program will tell a triangle\'s area if you specify the lengths of it\'s sides.");
        System.out.println("Let's begin. Please enter the length of the first side... ");
        a = sc.nextDouble();
        System.out.println("Now, please enter the length of the second side... ");
        b = sc.nextDouble();
        System.out.println("Finally, the length of the third side, please... ");
        c = sc.nextDouble();

        S = (a + b + c) / 2.f;
        System.out.println("The triangle's area is: " + Math.sqrt(S * (S - a) * (S - b) * (S - c)));

    }
}
