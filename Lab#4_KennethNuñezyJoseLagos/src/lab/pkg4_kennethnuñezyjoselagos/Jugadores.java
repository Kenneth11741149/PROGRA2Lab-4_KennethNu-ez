
package lab.pkg4_kennethnuñezyjoselagos;


public class Jugadores {
    protected String nombre;
     protected String nombre_u;
     protected int puntos;
     protected String lugar;
     protected int edad;
     protected String sexo;

    public Jugadores() {
    }

    public Jugadores(String nombre, String nombre_u, int puntos, String lugar, int edad, String sexo) {
        this.nombre = nombre;
        this.nombre_u = nombre_u;
        this.puntos = puntos;
        this.lugar = lugar;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", nombre_usuario=" + nombre_u + ", puntos=" + puntos + ", lugar=" + lugar + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
     
    
}
