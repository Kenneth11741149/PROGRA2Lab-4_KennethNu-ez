/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_kennethnuñezyjoselagos;

/**
 *
 * @author tali_
 */
public class caballero extends Piezas{

    public caballero() {
        super();
    }

    public caballero(String color, String material) {
        super(color, material);
    }

    public String getColor() {
        return color;
    }

    @Override
    public void movement(Piezas[][]Tablero, int x,int y,int a,int b) {
        
    }
    
    
}
