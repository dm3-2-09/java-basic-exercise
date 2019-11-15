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
public class AverageWithInput_XXXX {
            public static void main(String[] args) {
                final int students = 3;
                boolean validation;
                int oper = 0, num1, c = 1;
                double average = 0;
                
                for (int count = 1; count<students; count++)
                {
                    do {
                    System.out.print("Enter the mark (10) for a student: ");
                    Scanner sc = new Scanner(System.in);
                    num1 = sc.nextInt();
                    validation = false;
                  
                    if (num1 >=0 && num1 <= 10)
                    {
                        //System.out.println("You entered: " + num1);
                        c++;
                        
                        if (c > students)
                        {
                            validation = true;
                            System.out.println("The average is: " + oper);
                        }
                    }
                    
                    else  {
                        System.out.println(num1 + " is a invalid input, please try again...");
                    }
                        
                    } while (!validation);
                    oper =+ num1;
                    
                    
                }
            }
}
