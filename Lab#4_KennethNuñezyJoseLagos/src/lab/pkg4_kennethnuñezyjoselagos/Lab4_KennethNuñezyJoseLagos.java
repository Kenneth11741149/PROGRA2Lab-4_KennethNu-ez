package lab.pkg4_kennethnuñezyjoselagos;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab4_KennethNuñezyJoseLagos {
    static Scanner read = new Scanner(System.in);
    static ArrayList<Jugadores> Players = new ArrayList<Jugadores>();
    boolean PlayerOne = false;
    boolean PlayerTwo = false;
    
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al laboratorio de Jose Lagos 11741409");
        System.out.println("Bienvenido al laboratorio de Kenneth Nuñez 11741149");
        char resp = 'S';
        while(resp == 'S'||resp == 's'){
            System.out.println("***Menu Inicial***");
            System.out.println("1. Jugadores");
            System.out.println("2. Jugar");
            int option = read.nextInt();
            switch(option){
                case 1:
                    System.out.println("***Menu Jugadores***");
                    Jugadores();
                    break;
                case 2:
                    break;
            }
        }
    }
    static void Jugadores(){
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
        switch(option){
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
