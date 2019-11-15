/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TRIANGULO DE PASCAL
/*
El triangulo de pascal es un triangulo, que siempre empieza con un 1 en la copa
y segun vaya bajando, se sumaran los dos numeros encontrados arriba de manera 
bidireccional
        1
      1   1
    1   2   1
Los numeros 1, se iran sumando hasta el pie del triangulo.
*/

public class PascalTriangle {
    
    public static void main(String[] args) throws IOException {
        
        int n;
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in)); 

        System.out.print("Enter the number of rows: ");
        n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++)
        {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j<= i; j++)
            {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
    }    
}
