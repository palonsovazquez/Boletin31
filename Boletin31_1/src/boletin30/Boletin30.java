/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> selFut = new ArrayList<>();

        selFut.add(new Futbolista());
        selFut.add(new Entrenador());
        selFut.add(new Masajista());

        for (int i = 0; i < selFut.size(); i++) {
            selFut.get(i).concentrarse();
        }
        for (int i = 0; i < selFut.size(); i++) {
            selFut.get(0).entrenar();
        }
        for (int i = 0; i < selFut.size(); i++) {
            selFut.get(0).viajar();
        }
        for (int i = 0; i < selFut.size(); i++) {
            selFut.get(0).jugarPartido();
        }
        Entrenador auxEnt = null;
        for (int i = 0; i < selFut.size(); i++) {
            if (selFut.get(i) instanceof Entrenador) {
                auxEnt = (Entrenador) selFut.get(i);
                auxEnt.SeleccionarXogador();
            }

        }

    }

}
