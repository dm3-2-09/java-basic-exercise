package ud_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DM3-2-09
 */

public class CheckPassFail {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter a integer: ");
    
    int zenb = sc.nextInt();
    
        if (zenb < 50 && zenb > 101) // CheckPass, greater than 50 till 100 pass, else fail.
        {
            System.out.println("FAIL!");
        }
        else {
            System.out.println("PASS");
        }
        System.out.println("Exiting...");
    }
}