import java.util.Scanner;

public class _5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "This program's job is to\n\tcalculate the price of an article\n\t\twith a certain amount of tax applied.\n");

        System.out.print("Please enter the price of the article: ");
        double p = sc.nextDouble();
        System.out.println();

        System.out.println("Please enter the percentage of tax: ");
        double r = sc.nextDouble();
        System.out.println();

        System.out.println("The amount to be paid is: " + (p + (p * (r / 100))));

    }
}
