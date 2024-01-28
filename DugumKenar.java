
package PROLAB3_1;
class DUGUM<T> {
    private T veri;
    private CiftLinkedList<KENAR<T>> kenarlar;

    public DUGUM(T veri) {
        this.veri = veri;
        this.kenarlar = new CiftLinkedList<>();
    }

    public T getVeri() {
        return veri;
    }

    public CiftLinkedList<KENAR<T>> getKenarlar() {
        return kenarlar;
    }

    public void kenarEkle(KENAR<T> kenar) {
        kenarlar.ekle(kenar);
    }

}

class KENAR<T> {
    private DUGUM<T> baslangic;
    private DUGUM<T> bitis;

    public KENAR(DUGUM<T> baslangic, DUGUM<T> bitis) {
        this.baslangic = baslangic;
        this.bitis = bitis;
    }

    public DUGUM<T> getBaslangic() {
        return baslangic;
    }

    public DUGUM<T> getBitis() {
        return bitis;
    }
}

class Graf<T> {
    private CiftLinkedList<DUGUM<T>> nodes;
    private CiftLinkedList<KENAR<T>> edges;

    public Graf() {
        this.nodes = new CiftLinkedList<>();
        this.edges = new CiftLinkedList<>();
    }

    public void nodeEkle(DUGUM<T> node) {
        nodes.ekle(node);
    }

    public void kenarEkle(DUGUM<T> baslangic, DUGUM<T> bitis) {
        KENAR<T> kenar = new KENAR<>(baslangic, bitis);
        baslangic.kenarEkle(kenar); // Başlangıç düğümüne kenarı ekle
        edges.ekle(kenar); // Kenarı genel listeye ekle
    }

    public DUGUM<T> dugumGetir(T veri) {
        for(int i =0; i < nodes.boyut(); i++) {
            DUGUM<T> node = nodes.get(i);
            if (node.getVeri().equals(veri)) {
                return node;
            }
        }
        return null;
    }

    public STACK<T> dfs(DUGUM<T> baslangic) {
        Listt<DUGUM<T>> ziyaretEdilen = new Listt<>(); // Ziyaret edilen düğümleri tutmak için bir küme oluştur
        STACK<T> stack=new STACK<>();
        dfsUtil(baslangic, ziyaretEdilen,stack);
        for (int i=0;i<ziyaretEdilen.boyut();i++) {
            System.out.print(ziyaretEdilen.get(i).getVeri() + " ");
        }
        return stack;
    }

    // DFS yardımcı metodu
    private void dfsUtil(DUGUM<T> baslangic, Listt<DUGUM<T>> ziyaretEdilen,STACK<T>stack) {
        System.out.print(baslangic.getVeri() + " ");

        ziyaretEdilen.add(baslangic); // Düğümü ziyaret edildi olarak işaretledik
        stack.koy(baslangic.getVeri());
        // Düğümün kenarları üzerinde dolaş
        for (int i=0;i<baslangic.getKenarlar().boyut();i++) {
            DUGUM<T> bitis = baslangic.getKenarlar().get(i).getBitis();
            System.out.println(bitis.getVeri());
            if (!ziyaretEdilen.icerir(bitis)) { // Eğer bitiş düğümü daha önce ziyaret edilmediyse
                dfsUtil(bitis, ziyaretEdilen,stack); // DFS'yi tekar çağır
            }
        }
    }

    public CiftLinkedList<DUGUM<T>> getNodes() {
        return nodes;
    }

    public CiftLinkedList<KENAR<T>> getEdges() {
        return edges;
    }
}
