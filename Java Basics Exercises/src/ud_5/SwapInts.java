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
public class SwapInts {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first int: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = sc.nextInt();
        
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("Once swaped: first int is: " + num1 + " and the second one: " + num2 + ".");
                
    }
}
