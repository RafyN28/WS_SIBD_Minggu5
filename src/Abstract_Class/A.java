/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Class;

/**
 *
 * @author RafiNaufal28
 */
public abstract class A {
    abstract public void method2(); // Deklarasi method abstrak
    
    public void method1() { // Method konkrit dengan implementasi
        System.out.println("Method konkrit dari class A");
    }
}
