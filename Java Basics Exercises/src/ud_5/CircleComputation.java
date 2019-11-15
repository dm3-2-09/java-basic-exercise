/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud_5;

import java.io.IOException;
import java.util.Scanner;
import javafx.stage.Stage;

/**
 *
 * @author DM3-2-09
 */
public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextInt();
        
        diameter = 2.0 * radius;
        System.out.printf("The diameter is: %.2f%n", diameter);
        
        area = Math.PI * radius * radius;
        System.out.printf("The area is : %.2f%n", area);
        
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("The circumference is: %.2f%n", circumference);
    }
}