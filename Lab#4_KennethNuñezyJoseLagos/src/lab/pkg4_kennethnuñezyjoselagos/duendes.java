/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_kennethnuñezyjoselagos;

import static lab.pkg4_kennethnuñezyjoselagos.mago.read;

/**
 *
 * @author tali_
 */
public class duendes extends Piezas {

    public duendes() {
        super();
    }

    public duendes(String color, String material) {
        super(color, material);
    }

    public String getColor() {
        return color;
    }

    @Override
    public void movement(Piezas[][] Tablero, int x, int y, int a, int b) {
        boolean v = false;
        while (v = false) {
            if (Tablero[x][y] == null) {
                if (x < 9 && x == a + 1) {
                    Tablero[a][b] = null;
                    Tablero[x][y] = this;
                    v=true;
                } else {
                    System.out.println("Numeros illegales, ingrese nuevos");
                    System.out.println("Ingrese x");
                    x = read.nextInt();
                    System.out.println("Ingrese y");
                    y = read.nextInt();
                    v = false;
                }
            }
            if(Tablero!=null){
                if (x < 9 && x == a + 1) {
                    Tablero[a][b] = null;
                    Tablero[x][y] = this;
                    v=true;
                } else {
                    System.out.println("Numeros illegales, ingrese nuevos");
                    System.out.println("Ingrese x");
                    x = read.nextInt();
                    System.out.println("Ingrese y");
                    y = read.nextInt();
                    v = false;
                }
            }
        }

    }
}
