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
public class Add2Integers {
    public static void main(String[] args) {
        int n1, n2, sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first int: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second int: ");
        n2 = sc.nextInt();
        
        sum = n1 + n2;
        
        System.out.println("The sum of '" + n1 + "' and '" + n2 + "' is:  " + sum);
    }
}
