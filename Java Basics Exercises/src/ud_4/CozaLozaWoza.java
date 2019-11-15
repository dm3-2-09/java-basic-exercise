/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_4;

/**
 *
 * @author DM3-2-09
 */
public class CozaLozaWoza {
    public static void main(String[] args){
        int min = 1; int max = 110;
        for (int i = min; i<max; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println("Coza");
            }
            if (i % 5 == 0)
            {
                System.out.println("Loza");
            }
            if (i % 7 == 0)
            {
                System.out.println("Woza");
            }
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("Coza Loza");
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
            {
                System.out.println("Coza Loza Woza");
            }
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
            if (i % 11 == 0)
            {
                System.out.println("");
            } else {
                System.out.print("");
            }
        }
    }
}
