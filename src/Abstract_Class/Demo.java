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
public class Demo {
    public static void main(String[] args) {
        B ob = new B(); // Membuat objek dari class B
        ob.method1();   // Memanggil method konkrit dari class A
        ob.method2();   // Memanggil method abstrak yang sudah diimplementasikan di class B
    }
}
