/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * ref https://www.youtube.com/watch?v=1HQ9qpUR39E&t=14s
 * @author mdsjj
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
    
        isNum n1 = new Num();
        isNum n2 = new Num();
        isNum res = new Num();
        String opc = "S";
        
        while (opc.equals("s") || opc.equals("S")) {
            
            System.out.printf("%n first number: ");
            n1.setValue(scan.nextInt());
            System.out.printf("%n second number: ");
            n2.setValue(scan.nextInt());
            res.setValue(n1.getValue() + n2.getValue());
            System.out.printf("%n the sum is: %d", res.getValue());
            System.out.printf("%n Do you want to sum other number?");
            opc = scan.next();        }

    
    }
    
}
