/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xtras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_BufferedReader {

    public static void main(String[] args) throws IOException {
        String mezu, mezua;
        int zenbakia;
        double zenbakiaD;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu string motako mezu bat: ");
        mezua = sc.nextLine(); 

        //sc.next() egin ondoren, STRING hitz bakarra hartuko du. Hau da, espazio ondoren ez du irakurriko gehiago
        //System.out.print("Sartu string motako mezu bat espazioekin (esaldi osoak): ");
        //mezua = sc.nextLine(); EZIN DA nex() eta nextLine batera jarri, bat edo beste aukeratu behar da.
        
        System.out.print("Sartu int motako mezu bat: ");
        zenbakia = sc.nextInt();
        
        System.out.print("Sartu float edo double motako mezu bat (, erabiliz): ");
        zenbakiaD = sc.nextDouble();

        System.out.println("\nScannerakin sartutako datuak: \n"
                + "String: " + mezua + "\n"
                + "Int: " + zenbakia + "\n"
                + "Double: " + zenbakiaD + "\n\n\n");
        
        
        String mezua2;
        int zenbakia2;
        double zenbakiaD2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Sartu string mezu bat. ");
        mezua2 = br.readLine(); //Exception beharrezkoa
        
        System.out.println("Sartu int mezu bat: ");
        zenbakia2 = Integer.parseInt(br.readLine());
        
        System.out.println("Sartu float edo double mezu bat (. erabiliz): ");
        zenbakiaD2 = Double.parseDouble(br.readLine());
        
        System.out.println("BufferedReader eta InputStreamReaderekin sartutako datuak: \n"
                + "String: " + mezua2 + "\n"
                + "Int: " + zenbakia2 + "\n"
                + "Double: " + zenbakiaD2 + "\n");
    }
}
