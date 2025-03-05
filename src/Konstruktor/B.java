/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author RafiNaufal28
 */
public class B extends A{
    B() {
        super("test"); // Memanggil konstruktor A dengan parameter "test"
        System.out.println("Konstruktor class B dieksekusi ...");
    }
}
