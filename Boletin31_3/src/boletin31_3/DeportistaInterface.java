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
public interface DeportistaInterface {
     public default void entrenar() {
        System.out.println("Deportista entrenando.");
    }
     
     public default void jugarPartido() {
        System.out.println("Deportista jugando partido.");
    }
}
