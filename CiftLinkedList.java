package PROLAB3_1;
import java.util.Comparator;
import java.util.ListIterator;

class CiftLinkedList<T> {
    private Dugum<T> bas;
    private Dugum<T> son;
    private int boyut;

    public void ekle(T veri)
    {
        Dugum<T> yeniDugum = new Dugum<>(veri);
        if (bas == null)
        {
            bas = yeniDugum;
            son = yeniDugum;
        }
        else
        {
            son.sonraki = yeniDugum;
            yeniDugum.onceki = son;
            son = yeniDugum;
        }
        boyut++;
    }
    public T get(int index) {
        if (index < 0 || index >= boyut) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        Dugum<T> enSon = bas;
        for (int i = 0; i < index; i++) {
            enSon = enSon.sonraki;
        }
        return enSon.veri;
    }
    public void sil(int index) {
        if (index < 0 || index >= boyut) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }

        if (boyut == 1) {
            bas = null;
            son = null;
        } else if (index == 0) {
            bas = bas.sonraki;
            bas.onceki = null;
        } else if (index == boyut - 1) {

            son = son.onceki;
            son.sonraki = null;
        } else {

            Dugum<T> current = bas;
            for (int i = 0; i < index; i++) {
                current = current.sonraki;
            }

            current.onceki.sonraki = current.sonraki;
            current.sonraki.onceki = current.onceki;
        }

        boyut--;
    }

    public void set(int index, T yeniDeger) {
        if (index < 0 || index >= boyut) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        Dugum<T> current = bas;
        for (int i = 0; i < index; i++) {
            current = current.sonraki;
        }
        current.veri = yeniDeger;
    }
    public int hangiIndis(T arananDeger) {
        Dugum<T> current = bas;
        int index = 0;

        while (current != null) {
            if (current.veri.equals(arananDeger)) {
                return index;
            }

            current = current.sonraki;
            index++;
        }

        return -1;
    }
    public int boyut() {
        return boyut;
    }
    public Dugum<T> getBas() {
        return bas;
    }
    public Dugum<T> getSon() {
        return son;
    }

    public void setBas(Dugum<T> bas) {
        this.bas = bas;
    }

    public void setSon(Dugum<T> son) {
        this.son = son;
    }

    static class Dugum<T> {
        T veri;
        Dugum<T> onceki;
        Dugum<T> sonraki;

        public Dugum(T veri)
        {
            this.veri = veri;
            this.onceki = null;
            this.sonraki = null;
        }
    }


}
