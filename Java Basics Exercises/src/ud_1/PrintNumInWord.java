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
public class PrintNumInWord {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Sartu zenbaki bat: ");
        num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("The number you entered is: One");
                break;
            case 2:
                System.out.println("The number you entered is: Two");
                break;
            case 3:
                System.out.println("The number you entered is: Three");
                break;
            case 4:
                System.out.println("The number you entered is: Four");
                break;
            case 5:
                System.out.println("The number you entered is: Five");
                break;
            case 6:
                System.out.println("The number you entered is: Six");
                break;
            case 7:
                System.out.println("The number you entered is: Seven");
                break;
            case 8:
                System.out.println("The number you entered is: Eight");
                break;
            case 9:
                System.out.println("The number you entered is: Nine");
                break;
            default:
                System.out.println("Enter a number between 1 and 9");
                break;
        }
    }
}
