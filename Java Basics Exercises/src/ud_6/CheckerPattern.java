/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_6;

import java.util.Scanner;

/**
 *
 * @author DM3-2-09
 */
public class CheckerPattern {
            public static void main(String[] args) {
            int size;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the size: ");
            size = sc.nextInt();
            
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <= size; col++) {
                    if (((row % 2) == 0) || ((col % 2) == 0)) {
                        System.out.print(" ");
                    }
                    System.out.print(" # ");
                }
                System.out.println("");
            }
            }
}
