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
public class SumDigitsofInt {
    public static void main(String[] args) {
        int n1, sum = 0, digit;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n1 = sc.nextInt();
        
        
        if (n1>0) {
            System.out.print("The sum of all integers is: ");
            while(n1 > 0) 
            {
                sum = sum + n1%10;
                n1 /= 10;
            }
            System.out.println(sum);
            }
            else {
                System.out.println("Enter a positive integer...");
            }
        
    }
}
