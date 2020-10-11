/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class TablasDeMultiplicarC {

    public  String sumaRecursiva(int hasta, int laTabla) {
        String cadena = "";

        if (hasta == 1) {
            cadena = laTabla + "x" + (1) + "=" + laTabla;
            return cadena;
        } else {
            return (sumaRecursiva(hasta - 1, laTabla) + "\n" + laTabla + " x " + hasta 
                    + " = "+ (laTabla+plasmar(hasta - 1, laTabla)));
        }
    }

    public int plasmar(int hasta, int laTabla) {

        if (hasta == 1) {
            return laTabla;
        } else {
            return (laTabla+plasmar(hasta - 1, laTabla));
        }
    }

}
