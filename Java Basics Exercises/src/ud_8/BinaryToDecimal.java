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
public class BinaryToDecimal {

    public static void main(String[] args) {
        String str;
        int len, dec;
        char ch;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string (just 0 and 1): ");
        str = sc.nextLine();
        len = str.length();

        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (!(ch == '0' || ch == '1')) {
                valid = false;
                break;
            }
        }
        if (valid) {
            dec = Integer.parseInt(str, 2); //hemen, 2 jartzen dugu binary to decimal egin nahi dugulako.
            System.out.println("\"" + str + "\"" + " is a valid binary string and translated to decimal is: " + dec);
        } else {
            System.out.println("\"" + str + "\"" + " is NOT a valid binary string.");
        }
    }

}
