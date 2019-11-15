/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_5;

import java.util.Scanner;

/**
 *
 * @author DM3-2-09
 */
public class SumAndPro3 {
        public static void main(String[] args) {
            int n1, n2, n3, sum = 0, prod = 0, min;
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the 1st int: ");
            n1 = sc.nextInt();
            System.out.print("Enter the 2nd int: ");
            n2 = sc.nextInt();
            System.out.print("Enter the 3rd int: ");
            n3 = sc.nextInt();
            
            sum = n1 + n2 + n3;
         
            System.out.println("The sum of all 3 ints is: " + sum);
            
            prod = n1 * n2 * n3;
            
            System.out.println("The product of this 3 ints is: " + prod);
            
            min = n1;
            if (n2 < min) {
                min = n2;
            }
            if (n3 < min) {
                min = n3;
            }
            System.out.println("The min number is: " + min);
        }
}