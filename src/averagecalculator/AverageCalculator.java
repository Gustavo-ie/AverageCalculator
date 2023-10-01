/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagecalculator;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Mykb = new Scanner(System.in);
        System.out.println("First Grade");
        float g1 = Mykb.nextFloat();
        System.out.println("Second Grade");
        float g2 = Mykb.nextFloat();
        float a = (g1+g2)/2;
        System.out.println("Your grade average is " + a);
        if (a>9){
            System.out.println("Congratulations dear student!");
        }
        if (a<6){
            System.out.println("Be carefull with your grades you might fail!");
        }
    }
    
}
