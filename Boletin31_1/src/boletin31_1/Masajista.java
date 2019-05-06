/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private Integer aniosExperiencia;
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose masajista.");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando masajista.");
    }

    @Override
    public void entrenar() {
        System.out.println("Masajista entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Masajista jugando partido.");
    }
    public void darMasaje(){
        System.out.println("Dando masaje.");
    
    }
}
