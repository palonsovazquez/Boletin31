/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31_2;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public interface IntegranteSeleccionFutbol {
    
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    public default void ruedaPrensa(){
        System.out.println("Atendiendo a la prensa.");
       
    }
    
    public default void     videoPublicitario(){
        System.out.println("Haciendo video publicitario.");
    }
    
    
    
    
}
