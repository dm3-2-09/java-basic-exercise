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
public class ReverseDigits {
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to reverse: ");
            n = sc.nextInt();
            
            while (n > 0) {
                int num = n %10;
                System.out.print(num);
                n = n / 10;
            }
            System.out.println("\n");
        }
}
