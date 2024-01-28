package PROLAB3_1;

import java.util.Comparator;

class HashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private CiftLinkedList<Eleman<K, V>>[] tablo;
    private int boyut;

    public HashMap() {
        tablo = new CiftLinkedList[DEFAULT_CAPACITY];
        boyut = 0;
    }

    public void koy(K anahtar, V deger) {
        int hash = hash(anahtar);
        if (tablo[hash] == null) {
            tablo[hash] = new CiftLinkedList<>();
        }

        CiftLinkedList<Eleman<K, V>> liste = tablo[hash];
        CiftLinkedList.Dugum<Eleman<K, V>> son = liste.getSon();

        while (son != null) {
            Eleman<K, V> entry = son.veri;
            if (entry.getAnahtar().equals(anahtar)) {
                entry.setDeger(deger);
                return;
            }
            son = son.onceki;
        }

        liste.ekle(new Eleman<>(anahtar, deger));
        boyut++;
    }

    public V al(K anahtar) {
        int hash = hash(anahtar);
        CiftLinkedList<Eleman<K, V>> list = tablo[hash];

        if (list != null) {
            CiftLinkedList.Dugum<Eleman<K, V>> son = list.getSon();
            while (son != null) {
                Eleman<K, V> eleman = son.veri;
                if (eleman.getAnahtar().equals(anahtar)) {
                    return eleman.getDeger();
                }
                son = son.onceki;
            }
        }

        return null;
    }

    public void sil(K anahtar) {
        int hash = hash(anahtar);
        CiftLinkedList<Eleman<K, V>> list = tablo[hash];

        if (list != null) {
            CiftLinkedList.Dugum<Eleman<K, V>> onceki = null;
            CiftLinkedList.Dugum<Eleman<K, V>> mevcut = list.getSon();

            while (mevcut != null) {
                Eleman<K, V> eleman = mevcut.veri;
                if (eleman.getAnahtar().equals(anahtar)) {
                    if (onceki == null) {
                        list.setSon(mevcut.onceki);
                    } else {
                        onceki.onceki = mevcut.onceki;
                    }
                    boyut--;
                    return;
                }
                onceki = mevcut;
                mevcut = mevcut.onceki;
            }
        }
    }
    public void tumElemanlariYazdir() {
        for (CiftLinkedList<Eleman<K, V>> liste : tablo) {
            if (liste != null) {
                CiftLinkedList.Dugum<Eleman<K, V>> mevcut = liste.getBas();
                while (mevcut != null) {
                    Eleman<K, V> eleman = mevcut.veri;
                    System.out.println("Anahtar: " + eleman.getAnahtar() + ", Deger: " + eleman.getDeger());
                    mevcut = mevcut.sonraki;
                }
            }
        }
    }
    public CiftLinkedList<K> getAnahtarlar() {
        CiftLinkedList<K> keys = new CiftLinkedList<>();
        for (CiftLinkedList<Eleman<K, V>> liste : tablo) {
            if (liste != null) {
                CiftLinkedList.Dugum<Eleman<K, V>> current = liste.getBas();
                while (current != null) {
                    keys.ekle(current.veri.getAnahtar());
                    current = current.sonraki;
                }
            }
        }
        return keys;
    }
    public CiftLinkedList<V> getVeriler() {
        CiftLinkedList<V> values = new CiftLinkedList<>();
        for (CiftLinkedList<Eleman<K, V>> liste : tablo) {
            if (liste != null) {
                CiftLinkedList.Dugum<Eleman<K, V>> current = liste.getBas();
                while (current != null) {
                    values.ekle(current.veri.getDeger());
                    current = current.sonraki;
                }
            }
        }
        return values;
    }

    public int boyut() {
        return boyut;
    }
    private int hash(K anahtar) {
        return Math.abs(anahtar.hashCode() % tablo.length);
    }

    public CiftLinkedList<Eleman<K, V>>[] getTablo() {
        return tablo;
    }

    public void setTablo(CiftLinkedList<Eleman<K, V>>[] tablo) {
        this.tablo = tablo;
    }

    static class Eleman<K, V> {
        private K anahtar;
        private V deger;

        public Eleman(K anahtar, V deger) {
            this.anahtar = anahtar;
            this.deger = deger;
        }
        public K getAnahtar() {
            return anahtar;
        }
        public V getDeger() {
            return deger;
        }

        public void setDeger(V deger) {
            this.deger = deger;
        }
    }

}





