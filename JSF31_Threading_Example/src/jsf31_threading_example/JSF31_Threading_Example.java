/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf31_threading_example;

/**
 *
 * @author Sven
 */
public class JSF31_Threading_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());
        
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
