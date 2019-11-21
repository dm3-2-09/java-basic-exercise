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
public class CountVowelAndDigits {

    public static void main(String[] args) {
        int n_count = 0, v_count = 0;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu mezu bat string eta integer erabiliz: ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v_count++;
            } /*else if (ch >= 0 || ch <= 9) { // Hau egin ezkero, sartutako datuak gaizki ageriko dira.
                n_count++;
            }*/else if (Character.isDigit(ch)) {
                n_count++;
            }
        }
        System.out.println("The total of vowels entered is: " + v_count);
        System.out.println("The total of digits entered is: " + n_count);

    }
}
