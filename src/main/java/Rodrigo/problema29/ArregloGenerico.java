package Rodrigo.problema29;

import java.util.ArrayList;

public class ArregloGenerico<T> {
    private T[] a;
    private final int MAX = 20;
    private int ocupados;

    public ArregloGenerico() {
        a = (T[]) new Object[MAX];
        ocupados = 0;
    }
    
    public ArregloGenerico(int tamano) {
        a = (T[]) new Object[tamano];
        ocupados = 0;
    }

    public boolean agrega(T valor) {
        boolean res = false;
        if (ocupados < a.length) {
            a[ocupados] = valor;
            ocupados++;
            res = true;
        }

        return res;
    }
    
    public boolean equalsConOrden(Object obj) {
        boolean res = false;

        if(obj != null || obj.getClass().equals(this.getClass())) {
            ArregloGenerico<T> otro = (ArregloGenerico<T>) obj;

            if (otro.ocupados == this.ocupados)
                res = equalsConOrden(otro,0);
        }

        return res;
    }
    
    private boolean equalsConOrden(ArregloGenerico<T> otro, int aux) {
        if(aux >= ocupados)
            return true;
        if(!a[aux].equals(otro.a[aux]))
            return false;
        else
            return equalsConOrden(otro,aux + 1);
    }

    public boolean equalsSinOrden(Object obj) {
        boolean res = false;

        if(obj != null || obj.getClass().equals(this.getClass())) {
            ArregloGenerico<T> otro = (ArregloGenerico<T>) obj;

            if (otro.ocupados == this.ocupados) {
                ArrayList<T> auxAl = new ArrayList<>();
                res = equalsSinOrden(otro, auxAl, 0);
            }
        }

        return res;
    }

    private boolean equalsSinOrden(ArregloGenerico<T>otro, ArrayList<T> auxAl, int aux){
        if(aux >= ocupados)
            return true;
        if(!auxAl.contains(a[aux])){
            auxAl.add(a[aux]);
            int repThis = repetidos(this,aux,a[aux]);
            int repOtro = repetidos(otro,0,a[aux]);
            if(repThis != repOtro)
                return false;
        }

        return equalsSinOrden(otro,auxAl,aux+1);
    }

    private int repetidos(ArregloGenerico<T> tArregloGenerico, int aux, T t) {
        if(aux >= ocupados)
            return 0;
        if(tArregloGenerico.a[aux].equals(t))
            return 1 + repetidos(tArregloGenerico,aux+1,t);
        else
            return repetidos(tArregloGenerico,aux+1,t);

    }
}
