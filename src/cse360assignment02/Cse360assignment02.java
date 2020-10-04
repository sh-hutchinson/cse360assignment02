/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assignment02;

/**
 *
 * @author Hutchinson-personal
 */
public class Cse360assignment02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(5);
        myCalculator.add(5);
        System.out.println(myCalculator.getTotal());
        System.out.println(myCalculator.toString());
        
        
    }
    
}
