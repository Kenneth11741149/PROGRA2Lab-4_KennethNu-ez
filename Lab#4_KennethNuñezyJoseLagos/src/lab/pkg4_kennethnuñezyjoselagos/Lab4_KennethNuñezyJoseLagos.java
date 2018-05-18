package lab.pkg4_kennethnuñezyjoselagos;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab4_KennethNuñezyJoseLagos {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Jugadores> Players = new ArrayList<Jugadores>();
    static boolean PlayerOne = false;
    static boolean PlayerTwo = false;
    static boolean alive = true;
    static int pene = 1;
    static Piezas[][] Tablero1 = new Piezas [10][10];
    

    public static void main(String[] args) {
        Tablero1[0][0] = new caballero("Negro","Madera");
        Tablero1[1][0] = new duendes("Negro","Madera");
        Tablero1[0][2] = new dragon("Negro","Madera");
        Tablero1[0][3] = new arquero("Negro","Madera");
        Tablero1[0][4] = new rey("Negro","Madera");
        Tablero1[0][5] = new mago("Negro","Madera");
        Tablero1[0][6] = new arquero("Negro","Madera");
        Tablero1[0][7] = new dragon("Negro", "Madera");
        Tablero1[0][9] = new caballero("Negro","Madera");
        Tablero1[1][2] = new arquero("Negro","Madera");
        Tablero1[1][3] = new duendes("Negro","Madera");
        Tablero1[1][4] = new caballero("Negro","Madera");
        Tablero1[1][5]= new dragon("Negro","Madera");
        Tablero1[1][6] = new duendes("Negro","Madera");
        Tablero1[1][7] = new arquero("Negro","Madera");
        Tablero1[1][9] = new duendes("Negro","Madera");
        
        Tablero1[8][0] = new duendes("Blanco","Madera");
        Tablero1[9][0] = new caballero("Blanco","Madera");
        Tablero1[8][2] = new arquero("Blanco","Madera");
        Tablero1[8][3] = new duendes("Blanco","Madera");
        Tablero1[8][4] = new dragon("Blanco","Madera");
        Tablero1[8][5] = new caballero("Blanco","Madera");
        Tablero1[8][6] = new duendes("Blanco","Madera");
        Tablero1[8][7] = new arquero("Blanco","Madera");
        Tablero1[8][9] = new duendes("Blanco","Madera");
        Tablero1[9][2] = new caballero("Blanco","Madera");
        Tablero1[9][3] = new arquero("Blanco","Madera");
        Tablero1[9][4] = new mago("Blanco","Madera");
        Tablero1[9][5] = new rey("Blanco","Madera");
        Tablero1[9][6] = new arquero("Blanco","Madera");
        Tablero1[9][7] = new caballero("Blanco","Madera");
        Tablero1[9][9] = new caballero("Blanco","Madera");
        
        
        System.out.println("Bienvenido azl laboratorio de Jose Lagos 11741409");
        System.out.println("Bienvenido al laboratorio de Kenneth Nuñez 11741149");
        char resp = 'S';
        while (resp == 'S' || resp == 's') {
            System.out.println("***Menu Inicial***");
            System.out.println("1. Jugadores");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            int option = read.nextInt();
            switch (option) {
                case 1:
                    JugadoresMain();
                    break;
                case 2:
                    if(PlayerOne == true && PlayerTwo == false){
                    Printer();
                    System.out.println("Las coordenadas se meten de la siguiente manera: ");
                    System.out.println("X,Y      (Sin parentesis ni nada siendo x su posicion en x y Y su posicion en y");
                    while(alive == true){
                        if(alive == true){
                            System.out.println("Primer jugador ingrese su posicion actual. ");
                            String position = read.nextLine();
                            String[] positionizer = position.split(",");
                            
                            
                        }
                        if(alive == true){
                            
                        }
                    }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            
        }
    }

    static void JugadoresMain() {
        char resp = 'S';
        while (resp == 'S' || resp == 's') {
            System.out.println("***Menu Jugadores***");
            System.out.println("1. Agregar Jugadores. ");
            System.out.println("2. Listar Jugadores. ");
            System.out.println("3. Eliminar Jugadores. ");
            int option = read.nextInt();
            switch (option) {
                case 1:
                    if (PlayerOne == false) {
                        System.out.println("***Menu Jugadores***");
                        Jugadores();
                    } else if (PlayerTwo == false) {
                        System.out.println("***Menu Jugadores***");
                        Jugadores();
                    } else {
                        System.out.println("Es totalmente imposible tener mas de 2 jugadores, Favor usuar la clase Jugar. ");
                    }
                    break;
                case 2:
                    System.out.println(Players);
                    break;
                case 3:
                    System.out.println("Que jugador desea eliminar? ");
                    for(int i = 0; i < Players.size();i++){
                        System.out.println(i+"."+Players.get(i));
                    }
                    System.out.println("Ingrese su opcion");
                    int toEliminate = read.nextInt();
                    toEliminate--;
                    if(toEliminate < 0 || toEliminate > Players.size()){
                        System.out.println("No se puede modificar su opcion. ");
                    } else {
                        Players.remove(toEliminate);
                        System.out.println("Se ha removido al jugador.");
                    }
                    break;
            }
            System.out.println("Desea volver al menu de Jugadores? ");
            System.out.println("(S == MENU DE JUGADORES) (N == MENU INICIAL)");
            resp = read.next().charAt(0);
        }
    }

    static void Jugadores() {

        System.out.println("Ingrese su nombre: ");
        read.nextLine();
        String name = read.nextLine();
        System.out.println("Ingrese su nombre de usuario: ");
        String username = read.nextLine();
        int puntos = 0;
        System.out.println("Ingrese su lugar de nacimiento: ");
        String birthplace = read.nextLine();
        System.out.println("Ingrese su edad: ");
        int age = read.nextInt();
        System.out.println("Ingrese su sexo: ");
        System.out.println("1. Masculino ");
        System.out.println("2. Femenino ");
        System.out.println("3. Otro ");
        int option = read.nextInt();
        String gender;
        switch (option) {
            case 1:
                gender = "Masculino";
                break;
            case 2:
                gender = "Femenino";
                break;
            case 3:
                gender = "Otro";
                break;
            default:
                gender = "Ninguno especificado.";
                break;
        }
        Jugadores x = new Jugadores(name, username, puntos, birthplace, age, gender);
        Players.add(x);
    }
    static void Printer(){
        for(int i = 0; i < Tablero1.length; i++){
            for(int j = 0; j < Tablero1.length; j++){
                if(Tablero1[i][j] instanceof caballero){
                    if(Tablero1[i][j].getColor().equals("Blanco")){
                        System.out.print("[bC]");
                    } else{
                        System.out.print("[nC]");
                    }
                } else if(Tablero1[i][j] instanceof arquero){
                    if(Tablero1[i][j].getColor().equals("Blanco")){
                        System.out.print("[bA]");
                    } else{
                        System.out.print("[nA]");
                    }
                } else if(Tablero1[i][j] instanceof dragon){
                    if(Tablero1[i][j].getColor().equals("Blanco")){
                        System.out.print("[bF]");
                    } else{
                        System.out.print("[nF]");
                    }
                } else if(Tablero1[i][j] instanceof duendes){
                    if(Tablero1[i][j].getColor().equals("Blanco")){
                        System.out.print("[bD]");
                    } else{
                        System.out.print("[nD]");
                    }
                } else if(Tablero1[i][j] instanceof mago){
                    if(Tablero1[i][j].getColor().equals("Blanco")){
                        System.out.print("[bM]");
                    } else{
                        System.out.print("[nM]");
                    }
                } else if(Tablero1[i][j] instanceof rey){
                    if(Tablero1[i][j].getColor().equals("Blanco")){
                        System.out.print("[bR]");
                    } else{
                        System.out.print("[nR]");
                    }
                } else {
                    System.out.print("[__]");
                }
            }
            System.out.println("");
        }
    }

}
