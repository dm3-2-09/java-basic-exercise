/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_1;

import java.util.Scanner;

/**
 *
 * @author DM3-2-09
 */
public class PrintDayinInt {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Sartu zenbaki bat: ");
        num = sc.nextInt();
        
        switch(num) { //SWITCH CASE
            case 1: 
                System.out.println("Astelehena.");
            case 2:
                System.out.println("Asteartea.");
            case 3:
                System.out.println("Asteazkena.");
            case 4: 
                System.out.println("Osteguna.");
            case 5:
                System.out.println("Ostirala.");
            case 6:
                System.out.println("Larunbata.");
            case 7:
                System.out.println("Igandea");
            default:
                System.out.println("Ez dago horrelako egunik.");
        }
        if (num == 1) // NESTED IF
        {
            System.out.println("Astelehena");
        }
        else if (num == 2)
        {
            System.out.println("Asteartea");
        }
        else if (num == 3)
        {
            System.out.println("Asteazkena");
        }
        else if (num == 4)
        {
            System.out.println("Osteguna");
        }
        else if (num == 5)
        {
            System.out.println("Ostirala");
        }
        else if (num == 6)
        {
            System.out.println("Larunbata");
        }
        else if (num == 7)
        {
            System.out.println("Igandea");
        }
        else 
        {
            System.out.println("Ez dago horrelako egunik.");   
        }
    }
}
