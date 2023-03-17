package Rodrigo.problema29;

public class Problema29 {
    public static void main(String[] args) {
        ArregloGenerico<Integer> ag1 = new ArregloGenerico<>(), ag2 = new ArregloGenerico<>(), ag3 = new ArregloGenerico<>();

        for (int i = 0; i < 10; i++) {
            ag1.agrega(i);
            ag2.agrega(i);
            ag3.agrega(9 - i);
        }

        System.out.println("Con Orden");
        System.out.println(ag1.equalsConOrden(ag2));
        System.out.println(ag1.equalsConOrden(ag3));

        System.out.println("\nSin Orden");
        System.out.println(ag1.equalsSinOrden(ag2));
        System.out.println(ag1.equalsSinOrden(ag3));
    }
}
