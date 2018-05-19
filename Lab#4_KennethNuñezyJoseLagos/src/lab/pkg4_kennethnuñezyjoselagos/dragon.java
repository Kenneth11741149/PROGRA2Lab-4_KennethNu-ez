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
public class dragon extends Piezas {

    public dragon() {
        super();
    }

    public dragon(String color, String material) {
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
                if (Math.abs(a - x) == Math.abs(y - b)) {
                    Tablero[x][y] = this;
                    Tablero[a][b] = null;
                    if (x + 1 < 9) {
                        Tablero[x + 1][y] = null;
                    }
                    if (x - 1 > 0) {
                        Tablero[x - 1][y] = null;
                    }
                    if (y + 1 < 9) {
                        Tablero[x][y + 1] = null;
                    }
                    if (y - 1 > 0) {
                        Tablero[x][y - 1] = null;
                    }
                    if (x + 2 < 9 && y + 2 < 9) {
                        Tablero[x + 2][y + 2] = null;
                    }
                    if (x - 2 > 0 && y - 2 > 0) {
                        Tablero[x - 2][y - 2] = null;
                    }
                    if (x + 2 < 9 && y - 2 > 0) {
                        Tablero[x + 2][y - 2] = null;
                    }
                    if (x - 2 > 0 && y + 2 < 9) {
                        Tablero[x - 2][y + 2] = null;
                    }
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
            v = false;
            if (Tablero[x][y] != null) {
                while (v = false) {
                    if (((Piezas) this).color.equals((Tablero[x][y]).color)) {
                        System.out.println("No puede comerse a su propia pieza");
                        System.out.println("ingrese x");
                        x = read.nextInt();
                        System.out.println("ingrese y");
                        y = read.nextInt();
                        v = false;
                    } else {
                        if (Math.abs(a - x) == Math.abs(y - b)) {
                            Tablero[x][y] = this;
                            Tablero[a][b] = null;
                            if (x + 1 < 9) {
                                Tablero[x + 1][y] = null;
                            }
                            if (x - 1 > 0) {
                                Tablero[x - 1][y] = null;
                            }
                            if (y + 1 < 9) {
                                Tablero[x][y + 1] = null;
                            }
                            if (y - 1 > 0) {
                                Tablero[x][y - 1] = null;
                            }
                            if (x + 2 < 9 && y + 2 < 9) {
                                Tablero[x + 2][y + 2] = null;
                            }
                            if (x - 2 > 0 && y - 2 > 0) {
                                Tablero[x - 2][y - 2] = null;
                            }
                            if (x + 2 < 9 && y - 2 > 0) {
                                Tablero[x + 2][y - 2] = null;
                            }
                            if (x - 2 > 0 && y + 2 < 9) {
                                Tablero[x - 2][y + 2] = null;
                            }
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
