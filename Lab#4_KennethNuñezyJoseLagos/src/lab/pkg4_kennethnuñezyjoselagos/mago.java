/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_kennethnuñezyjoselagos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tali_
 */
public class mago extends Piezas {

    static Scanner read = new Scanner(System.in);

    public mago() {
        super();
    }

    public mago(String color, String material) {
        super(color, material);
    }

    @Override
    public String getColor() {
        return color;
    }

    public void movement(Piezas[][] Tablero, int x, int y, int a, int b) {
        boolean v = false;
        while (v = false) {
            if (Tablero[x][y] == null) {
                if ((x <= 9 && y <= 9) && (x >= 0 && y > +0)) {
                    Tablero[x][y] = this;
                    Tablero[a][b] = null;
                    v = true;
                } else {
                    System.out.println("Numeros illegales, ingrese nuevos");
                    System.out.println("Ingrese x");
                    x = read.nextInt();
                    System.out.println("Ingrese y");
                    y = read.nextInt();
                    v = false;
                }
            }
            if (Tablero[x][y] != null) {
                v = false;
                while (v = false) {
                    if (((Piezas) this).color.equals((Tablero[x][y]).color)) {
                        System.out.println("No puede comerse a su propia pieza");
                        System.out.println("ingrese x");
                        x = read.nextInt();
                        System.out.println("ingrese y");
                        y = read.nextInt();
                        v = false;
                    } else {
                        if ((x <= 9 && y <= 9) && (x >= 0 && y > +0)) {
                            Tablero[x][y] = this;
                            Tablero[a][b] = null;
                            v = true;
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

    }


}
