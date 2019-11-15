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
public class TimeTable {
        public static void main(String[] args) {
            int size;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            
            for (int i = 1; i<=size; i++) {
                System.out.format("%4d",i);
            }
            System.out.println();
            System.out.println("------------------");
            for (int i = 1; i<=size; i++) {
                    System.out.format("%4d |",i);
                    for (int j = 1; j<=size; j++) {
                        System.out.format("%4d", i * j);
                    }
            System.out.println("");
            }
        }
}
