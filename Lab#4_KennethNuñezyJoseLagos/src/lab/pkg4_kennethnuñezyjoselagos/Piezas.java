
package lab.pkg4_kennethnuñezyjoselagos;

import java.util.ArrayList;

public abstract class Piezas {
    protected String color;
    protected String material;

    public Piezas() {
    }

    public Piezas(String color, String material) {
        this.color = color;
        this.material = material;
    }
    public abstract void movement();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Piezas{" + "color=" + color + ", material=" + material + '}';
    }
    
}
