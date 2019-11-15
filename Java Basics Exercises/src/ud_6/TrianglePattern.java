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
public class TrianglePattern {
            public static void main(String[] args) {
                int size = 1;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size: ");
                size = sc.nextInt();
                
                // a) 
                System.out.println("a) ");
                
                for (int i=0;i<=size;i++) {
                    for (int j=0;j<i;j++) {
                        System.out.print("* ");
                    }
                    System.out.println(""); }
                System.out.println("");
                
                // b) 
                System.out.println("b) ");
                
                for(int i=0; i<size; i++) {
                for (int j=2*(size - i); j>=0; j--) {
                        System.out.print(" ");
                    }
                for (int j = 0; j<=i; j++) {
                    System.out.print("* ");
                }
                    System.out.println(""); 
                }
                /*
                // c) 
                System.out.println("c) ");
                
                for (int i=0; i<size; i++) {
                    
                }*/

            }
}
