import java.util.Scanner;

public class _13 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the `x` component of the vector: ");
        double x = sc.nextDouble();
        System.out.println();
        System.out.print("Please enter the `y` component of the vector: ");
        double y = sc.nextDouble();

        double mag = Math.sqrt(x * x + y * y);
        System.out.println("The normalized vector is:\n\t `x`: `" + (x / mag) + "` `y`: `" + (y / mag) + "`.");
    }

}
