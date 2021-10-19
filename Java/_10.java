import java.util.Scanner;

// Was getting bored, challenged myself to write this on notepad. 
// Came back, hit `ALt + Shift + F` for auto-format and...no changes!
public class _10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the value for `a`: ");
        double a = sc.nextDouble();

        System.out.println("Please enter the value for `b`: ");
        double b = sc.nextDouble();

        System.out.println("Please enter the value for `c`: ");
        double c = sc.nextDouble();

        double d = Math.sqrt(b * b - (4 * a * c));
        double _2a = 2 * a;

        // Fun fact: the sign for `b` can reverse the order of roots obtained
        // as the positive and negative roots, (o_O").
        double positive = (-b + d) / _2a, negative = (-b - d) / _2a;

        System.out.println("The positive root is: `" + positive + "`, and,\nThe negative root is: " + negative + '.');

    }
}