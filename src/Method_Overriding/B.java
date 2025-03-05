/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overriding;

/**
 *
 * @author RafiNaufal28
 */
public class B extends A {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Memanggil method milik superclass (A)
        System.out.println("Method milik class B dipanggil");
    }
}
