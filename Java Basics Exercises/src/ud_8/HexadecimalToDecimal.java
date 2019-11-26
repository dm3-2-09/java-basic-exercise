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
public class HexadecimalToDecimal {
    
    public static void main(String[] args) {
        String str;
        int len, dec;
        char ch;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string (Numbers and A-F or a-f): ");
        str = sc.nextLine();
        len = str.length();

        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (!((ch >= '0' && ch <= '9')
                    || (ch >= 'A' && ch <= 'F')
                    || (ch >= 'a' && ch <= 'f'))) {
                valid = false;
                break;
            }
        }
        if (valid) {
            dec = Integer.parseInt(str, 16); //hemen, 16 jartzen dugu hexadecimal to decimal egin nahi dugulako.
            System.out.println("\"" + str + "\"" + " is a valid binary hexadecimal and translated to decimal is: " + dec);
        } else {
            System.out.println("\"" + str + "\"" + " is NOT a valid binary string.");
        }
    }
    
}
