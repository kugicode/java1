/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication108;

/**
 *
 * @author anzoh
 */
public class JavaApplication108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("--- Java 'static' Keyword Example ---");

        // 1. Accessing a static method directly using the Class Name
        Counter.displayTotalCount(); // No objects created yet, but can call static method

        // 2. Creating multiple Counter objects
        System.out.println("\nCreating Counter objects:");
        Counter c1 = new Counter(); // Constructor increments 'count'
        Counter c2 = new Counter(); // Constructor increments 'count'
        Counter c3 = new Counter(); // Constructor increments 'count'

        // 3. Accessing the static variable directly using the Class Name
        System.out.println("\nAccessing static variable directly:");
        System.out.println("Counter.count is now: " + Counter.count); // Expected: 3

        // 4. Calling a static method again after creating objects
        Counter.displayTotalCount(); // Will show updated total count

        // 5. Calling non-static (instance) methods
        System.out.println("\nCalling non-static methods:");
        c1.displayInstanceAndTotal();
        c2.displayInstanceAndTotal();
        c3.displayInstanceAndTotal();
        
    }
    
}
