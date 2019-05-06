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
public class Masajista extends SeleccionFutbolHM implements IntegranteInterface{
    private String titulacion;
    private Integer aniosExperiencia;
    


    
    public void entrenar() {
        System.out.println("Masajista entrenando.");
    }

   
    public void jugarPartido() {
        System.out.println("Masajista jugando partido.");
    }
    public void darMasaje(){
        System.out.println("Dando masaje.");
    
    }
}
