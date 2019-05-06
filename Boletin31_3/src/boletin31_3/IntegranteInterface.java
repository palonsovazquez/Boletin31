/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31_3;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public interface IntegranteInterface {
    
    public default void concentrarse() {
        System.out.println("Concentrandose entrenador.");
    }

    
    public default void viajar() {
        System.out.println("Viajando entrenador.");
    }
    
}
