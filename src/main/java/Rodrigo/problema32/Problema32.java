package Rodrigo.problema32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problema32 {

    public static int cuentaPal(String nomArc) throws FileNotFoundException {
        File miArch = new File(nomArc);
        Scanner lectura = new Scanner(miArch);
        return cuentaPal(lectura);
    }

    private static int cuentaPal(Scanner lectura){
        if(!lectura.hasNext())
            return 0;
        else
            return cuentaPal(lectura.nextLine(),0) + cuentaPal(lectura);
    }

    private static int cuentaPal(String nextLine, int i) {
        if(i >= nextLine.length())
            return 1;
        else{
            if(nextLine.charAt(i)==' ')
                return 1 + cuentaPal(nextLine,i+1);
            else
                return cuentaPal(nextLine,i+1);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //13
        System.out.println(cuentaPal("C:\\Users\\fvbit\\Documents\\ITAM\\Semestres\\Tercer Semestre\\Materias\\Estructuras de Datos\\LabED\\src\\main\\java\\Rodrigo\\problema32\\prueba.txt"));
    }
}
