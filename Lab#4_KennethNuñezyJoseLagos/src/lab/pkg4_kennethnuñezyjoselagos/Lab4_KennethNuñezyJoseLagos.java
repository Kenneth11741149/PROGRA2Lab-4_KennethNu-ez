package lab.pkg4_kennethnuñezyjoselagos;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab4_KennethNuñezyJoseLagos {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Jugadores> Players = new ArrayList<Jugadores>();
    static boolean PlayerOne = false;
    static boolean PlayerTwo = false;
    static int pene = 1;
    static String[][] Tablero = {{"nC","__","nF","nA","nR","nM","nA","nF","__","nC"},
                                 {"nD","__","nA","nD","nC","nF","nD","nA","__","nD"},
                                 {"__","__","__","__","__","__","__","__","__","__"},
                                 {"__","__","__","__","__","__","__","__","__","__"},
                                 {"__","__","__","__","__","__","__","__","__","__"},
                                 {"__","__","__","__","__","__","__","__","__","__"},
                                 {"__","__","__","__","__","__","__","__","__","__"},
                                 {"__","__","__","__","__","__","__","__","__","__"},
                                 {"wD","__","wA","wD","wF","wC","wD","wA","__","wD"},
                                 {"wC","__","wF","wA","wM","wR","wA","wF","__","wC"}
                                };

    public static void main(String[] args) {
        System.out.println("Bienvenido al laboratorio de Jose Lagos 11741409");
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

}
