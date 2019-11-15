/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_7;

import java.util.Scanner;

/**
 *
 * @author DM3-2-09
 */
public class Factorial {

    public static void main(String[] args) {  // Set an initial breakpoint at this statement
        int n;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu zenbaki bat bere faktoriala aurkitzeko: ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;   // *
      }
      System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
