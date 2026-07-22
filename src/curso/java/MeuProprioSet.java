package curso.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MeuProprioSet implements Set {
    private Object[] elementos;
    private int tamanho;

    public MeuProprioSet() {
        this.elementos = new Object[10];
        this.tamanho = 0;
    }

    public boolean add(Object elemento) {
        if (contains(elemento)) {
            return false;
        }
        if (tamanho == elementos.length) {
            expandirCapacidade();
        }
        elementos[tamanho++] = elemento;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(o)) {
                System.arraycopy(elementos, i + 1, elementos, i, tamanho - i - 1);
                tamanho--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    public boolean contains(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private void expandirCapacidade() {
        Object[] novoArray = new Object[elementos.length * 2];
        System.arraycopy(elementos, 0, novoArray, 0, elementos.length);
        elementos = novoArray;
    }

    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
