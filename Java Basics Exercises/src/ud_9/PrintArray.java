package ud_9;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        n = sc.nextInt();
        int a[] = new int[n]; //A listaren ITEM kopurua zehazteko.
        System.out.println("Enter the value for all the items: ");

        for (int i = 0; i < n; ++i) {  // Read all items
            a[i] = sc.nextInt();
        }
        System.out.print("Entered array is: " + Arrays.toString(a));
    }
}
