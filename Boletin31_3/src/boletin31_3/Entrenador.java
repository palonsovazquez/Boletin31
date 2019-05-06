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
public class Entrenador extends SeleccionFutbolHM implements DeportistaInterface, IntegranteInterface{
    private Integer idFederacion;
    
   
    

    

   
    public void SeleccionarXogador(){
        System.out.println("Seleccionando jugador.");
    
    
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planificando Entrenamiento");
    
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }
    
}
