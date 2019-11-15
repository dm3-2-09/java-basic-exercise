package ud_1;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DM3-2-09
 */
public class CheckBakoitiBikoiti {
    public static void main(String[] args){
    int Z;
    Scanner sc = new Scanner (System.in);
    System.out.printf("Sartu zenbaki bat mesedez. ");
    Z = sc.nextInt();
    
    if (Z % 2 == 0)
    {
        System.out.println("Zure zenbakia: " + Z + " da, eta bikoitia da.");
    }
    else {
        System.out.println("Zure zenbakia: " + Z + " da, eta bakoitia da.");
    }
        System.out.println("Exiting...");
    }
}
