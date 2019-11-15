/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_4;

import java.util.Scanner;

/**
 *
 * @author DM3-2-09
 */
public class Product1Ton {
    public static void main(String[] args){
        int min;
        int max;
        long sum = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the min value:");
        min = sc.nextInt();
        
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Enter the max value:");
        max = sc1.nextInt();
        
        for (long i = min; i < max; i++)
        {
           sum *= i;
        }
        System.out.println("The final factorial is: " + sum);
    }
}
