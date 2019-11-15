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
public class SumInts {
    public static void main(String[] args){
        int min;
        int max;
        int num = 0;
        int sum = 0;
        double average;
        
        Scanner txi = new Scanner(System.in);
        System.out.printf("Sartu zenbaki txiki bat:");
        min = txi.nextInt();
        
        Scanner han = new Scanner(System.in);
        System.out.printf("Sartu zenbaki handi bat:");
        max = han.nextInt();
        
        for (int i = min; i <= max; i++)
        {
            sum += i;
        }
        double decimal = (float) num;
        
        System.out.println("The sum of all integers from " + min + " and " + max + " is: " + sum);
        
        average = (double) sum / 100;
        
        System.out.println("The average is: " + average);
        
    }
}
