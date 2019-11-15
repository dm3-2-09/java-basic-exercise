/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_6;

import java.util.Scanner;

public class BoxPattern {
    private static Scanner sc;
    public static void main(String[] args) 
	{
            int row, col, i, j, size;
            sc = new Scanner(System.in);
            
            System.out.print("Sartu zutabearen tamaianera: ");
            col = sc.nextInt();
            
            System.out.print("Sartu ilararen tamainera: ");
            row = sc.nextInt();
            for (i = 1; i<=row;i++)
            {
                for (j = 1; j<=col;j++)
                {
                        if(i == 1 || i == row || j == 1 || j == col)
                        {
                            System.out.print("#");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                }
               System.out.print("\n");
            }
        }
    
}
