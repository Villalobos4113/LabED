package Rodrigo.Problema31;

public class OperacionesArregloBidimencional {

    /*

    public static double sumaPorRenglon(double [][] matriz) {
        return sumaPorRenglon(matriz, 0, 0);
    }

    private static double sumaPorRenglon(double [][] a, int auxF, int auxC) {
        if (auxF >= a.length)
            return 0;
        else {
            if (auxC >= a[0].length) {
                return sumaPorRenglon(a, auxF + 1, 0);
            } else
                return a[auxF][auxC] + sumaPorRenglon(a, auxF, auxC + 1);
        }
    }


    public static double sumaPorColumna(double [][] matriz) {
        return sumaPorColumna(matriz, 0, 0);
    }

    private static double sumaPorColumna(double [][] a, int auxF, int auxC) {
        if (auxC >= a[0].length)
            return 0;
        else {
            if (auxF >= a.length) {
                return sumaPorColumna(a, 0, auxC + 1);
            } else
                return a[auxF][auxC] + sumaPorColumna(a, auxF + 1, auxC);
        }
    }

     */


    public static String toString(double [][] matriz) {
        StringBuilder sb = new StringBuilder("[");
        toString(matriz, 0, 0, sb);
        return sb.toString().substring(0, sb.length() - 1);
    }

    private static void toString(double [][] a, int auxF, int auxC, StringBuilder sb) {
        if (auxF < a.length) {
            if (auxC >= a[0].length) {
                sb.append("]\n[");
                toString(a, auxF + 1, 0, sb);
            } else {
                sb.append(a[auxF][auxC] + " ");
                toString(a, auxF, auxC + 1, sb);
            }
        }
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(toString(a));
    }
}
