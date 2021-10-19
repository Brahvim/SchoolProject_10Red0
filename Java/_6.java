import java.util.Scanner;

public class _6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter the size of the matrix: ");
        int s = sc.nextInt();

        double matrix[][] = new double[s][s];

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                matrix[i][j] = i == j ? 1 : 0;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
