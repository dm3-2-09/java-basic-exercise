/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_6;

import java.util.Scanner;

public class DiamondShapePattern {

    public static void main(String[] args) {
        int r, c, j, space = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();
        space = r - 1;

        for (j = 1; j <= r; j++) {
            for (c = 1; c <= space; c++) {
                System.out.print(" ");
            }
            space--;
            for (c = 1; c <= 2 * j - 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= r; j++) {
            for (c = 1; c <= space; c++) {
                System.out.print(" ");
            }
            space++;
            for (c = 1; c <= 2 * (r - j) - 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
