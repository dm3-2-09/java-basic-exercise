/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_8;

import java.util.Scanner;

/**
 *
 * @author DM3-2-09
 */
public class PhoneKeyPad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhoneKeyPad keypad = new PhoneKeyPad();
        keypad.run();
    }
     private void run() {
         Scanner sc = new Scanner(System.in);
         
         String mezua;
         System.out.println("Sartu string mezu bat: ");
         mezua = sc.next();
         
         int d = 0;
         
         for (int i = 0; i<mezua.length();i++)
         {
             switch(mezua.toUpperCase().charAt(i))
                     {
                 case 'A': case'B': case'C': d = 2; break;
                 case 'D': case'E': case'F': d = 3; break;
                 case 'G': case'H': case'I': d = 4; break;
                 case 'J': case'K': case'L': d = 5; break;
                 case 'M': case'N': case'O': d = 6; break;
                 case 'P': case'Q': case'R': case 'S': d = 7; break;
                 case 'T': case'U': case'V': d = 8; break;
                 case 'W': case'X': case'Y': case'Z': d = 9; break;
                     }
             System.out.print(d);
         }
         System.out.println("");
     }
    
}
