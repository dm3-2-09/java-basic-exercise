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
public class InputValidation {
        public static void main(String[] args) {
            int n1;
            boolean valid;
            valid = false;
            
            while (!valid) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between 0-10 or 90-100: ");
            n1 = sc.nextInt();
          
            if (n1 >= 0 && n1 <= 10)
            {
                System.out.println("You entered: " + n1);
                valid = true;
            }
            else if (n1 >=90 && n1 <=100)
            {
                System.out.println("You entered: " + n1);
                valid = true;
            }
            else  {
                System.out.println(n1 + " is a invalid input, please try again...");
            }
        } 
    }
}
