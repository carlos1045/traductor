/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.HashMap;

/**
 *
 * @author Neider Mejia Ciro
 */
public class modelo {
    public HashMap<Integer, String> ListaPalabras = new HashMap<Integer, String>();

    public modelo () {
        ListaPalabras.put(1, "Ventana");
        ListaPalabras.put(2, "puerta");
        ListaPalabras.put(3, "carro");
        ListaPalabras.put(4, "piso");
        ListaPalabras.put(5, "castillo");
        ListaPalabras.put(6, "lobo");
        ListaPalabras.put(7, "escuela");
        ListaPalabras.put(8, "libro");
        ListaPalabras.put(9, "patineta");
        ListaPalabras.put(10, "tablero");
    }

    public String buscador(int index) {
        return ListaPalabras.get(index);
    }
}
