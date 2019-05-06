/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31_3;

import java.util.ArrayList;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin31_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<SeleccionFutbolHM> selFut = new ArrayList<>();

        selFut.add(new Futbolista());
        selFut.add(new Entrenador());
        selFut.add(new Masajista());

       
        Entrenador auxEnt = null;
        for (int i = 0; i < selFut.size(); i++) {
            if (selFut.get(i) instanceof Entrenador) {
                auxEnt = (Entrenador) selFut.get(i);
                auxEnt.SeleccionarXogador();
            }

        }

    }

}
