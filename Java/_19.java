import java.util.Scanner;
import java.util.ArrayList;

public class _19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // `ArrayList`s start with a default of `10`,
        // though extendable, as they dynamically allocate space,
        // without you having to use pointers. Neat!
        ArrayList<Integer> list = new ArrayList<Integer>();
        // `int[] e = new int[]` <-- DEPRECATED SINCE `Java SE 7`!

        System.out.println("Please enter numbers to sort. To stop entering, enter a letter instead.");

        while (true) {
            try {
                list.add(sc.nextInt());
            } catch (Exception e) {
                break;
            }
        }

        System.out.println("Sorting...");

        int t;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                }
            }
        }

        System.out.println("Here are the sorted numbers!:");
        for (int i : list)
            System.out.println(i);
    }

}
