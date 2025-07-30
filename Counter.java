/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication108;

/**
 *
 * @author anzoh
 */
public class Counter {
        // --- Static (Class) Variable ---
    // This variable belongs to the Counter class itself, not to individual objects.
    // There is only ONE copy of 'count', shared by all instances.
    public static int count = 0; // Initialized to 0 when the class is loaded

    // --- Instance (Non-static) Variable ---
    // Each object will have its own 'instanceId'
    private int instanceId;

    // --- Constructor ---
    public Counter() {
        // Increment the static 'count' every time a new Counter object is created
        count++;
        this.instanceId = count; // Assign a unique ID based on the static count
        System.out.println("Counter object created. Instance ID: " + this.instanceId + ". Total objects: " + count);
    }

    // --- Static (Class) Method ---
    // This method belongs to the class and can be called without creating an object.
    // It can only access static members directly.
    public static void displayTotalCount() {
        System.out.println("Current total count of Counter objects: " + count);
        // System.out.println("Instance ID: " + instanceId); // <--- This would cause a compile error!
        // Because a static method cannot access a non-static (instance) variable directly.
    }

    // --- Non-static (Instance) Method ---
    // This method belongs to an object and can access both static and non-static members.
    public void displayInstanceAndTotal() {
        System.out.println("Instance " + this.instanceId + " says: Total objects created so far is " + count);
    
}
    
}
