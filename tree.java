package PROLAB3_1;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

import java.util.Random;

public class tree {
    public Graf<Kullanici> tree(HashMap<String,Kullanici> KullaniciHash,Kullanici kullanici){
        Graph graph2 = new SingleGraph("Graf2");
        graph2.setAttribute("ui.style", "fill-color: rgb(255,255,255);");
        Graf<Kullanici> graf2 = new Graf<>();
        Random random = new Random();
        DUGUM<Kullanici> kullaniciNodeGraf2 = new DUGUM<>(kullanici);
        graf2.nodeEkle(kullaniciNodeGraf2);

        if (graph2.getNode(String.valueOf(kullaniciNodeGraf2.getVeri().getKullaniciAdi())) == null) {
            graf2.nodeEkle(kullaniciNodeGraf2);
            Node nodeadd = graph2.addNode(String.valueOf(kullaniciNodeGraf2.getVeri().getKullaniciAdi()));
            nodeadd.setAttribute("ui.label", String.valueOf(kullaniciNodeGraf2.getVeri().getKullaniciAdi()));
            nodeadd.setAttribute("ui.style", "fill-color: rgb(247,235,0);");
            nodeadd.setAttribute("ui.style", "text-size: 20;");

        }

        Listt<Integer> randomList = new Listt<>();
        for (int i = 0; i < 3; i++) {
            int randomint = -1;
            do {
                randomint = random.nextInt(kullaniciNodeGraf2.getVeri().getTakipciler().boyut());
            } while (randomList.icerir(randomint));
            randomList.add(randomint);
            DUGUM<Kullanici> ilkKademe = new DUGUM<>(KullaniciHash.al(kullaniciNodeGraf2.getVeri().getTakipciler().get(randomint)));
            graf2.nodeEkle(ilkKademe);
            // Tüm düğümleri kontrol etmek için kullanılan if koşulu
            if (graph2.getNode(ilkKademe.getVeri().getKullaniciAdi()) == null) {
                graf2.nodeEkle(ilkKademe);
                Node nodeadd2 = graph2.addNode(ilkKademe.getVeri().getKullaniciAdi());
                nodeadd2.setAttribute("ui.label", ilkKademe.getVeri().getKullaniciAdi());
                nodeadd2.setAttribute("ui.style", "fill-color: rgb(45,101,92);");
                nodeadd2.setAttribute("ui.style", "text-size: 20;");


            }
            graf2.kenarEkle(kullaniciNodeGraf2, ilkKademe);
            Edge edgeadd = graph2.addEdge(kullaniciNodeGraf2.getVeri().getKullaniciAdi() + ilkKademe.getVeri().getKullaniciAdi(),
                    kullaniciNodeGraf2.getVeri().getKullaniciAdi(), ilkKademe.getVeri().getKullaniciAdi());
            edgeadd.setAttribute("ui.style", "fill-color:  rgb(247,235,0);");
            Listt<Integer> random2List = new Listt<>();
            for (int j = 0; j < 3; j++) {
                int randomint2 = -1;
                do {
                    randomint2 = random.nextInt(ilkKademe.getVeri().getTakipciler().boyut());
                } while (random2List.icerir(randomint2));
                random2List.add(randomint2);
                DUGUM<Kullanici> ikinciKademe = new DUGUM<>(KullaniciHash.al(ilkKademe.getVeri().getTakipciler().get(randomint2)));
                graf2.nodeEkle(ikinciKademe);

                // Tüm düğümleri kontrol etmek için kullanılan if koşulu
                if (graph2.getNode(ikinciKademe.getVeri().getKullaniciAdi()) == null) {
                    graf2.nodeEkle(ikinciKademe);
                    Node nodeadd3 = graph2.addNode(ikinciKademe.getVeri().getKullaniciAdi());
                    nodeadd3.setAttribute("ui.label", ikinciKademe.getVeri().getKullaniciAdi());
                    nodeadd3.setAttribute("ui.style", "fill-color: rgb(147,36,16);");
                    nodeadd3.setAttribute("ui.style", "text-size: 20;");


                }
                graf2.kenarEkle(ilkKademe, ikinciKademe);
                Edge edgeadd2 = graph2.addEdge(ilkKademe.getVeri().getKullaniciAdi() + ikinciKademe.getVeri().getKullaniciAdi(), ilkKademe.getVeri().getKullaniciAdi(), ikinciKademe.getVeri().getKullaniciAdi());
                edgeadd2.setAttribute("ui.style", "fill-color: rgb(45,101,92);");

                for (int k = 0; k < 3; k++) {
                    int randomint3 = -1;
                    do {
                        randomint3 = random.nextInt(ikinciKademe.getVeri().getTakipciler().boyut());
                    } while (random2List.icerir(randomint3));
                    random2List.add(randomint3);
                    DUGUM<Kullanici> ucuncuKademe = new DUGUM<>(KullaniciHash.al(ikinciKademe.getVeri().getTakipciler().get(randomint3)));
                    graf2.nodeEkle(ucuncuKademe);

                    // Tüm düğümleri kontrol etmek için kullanılan if koşulu
                    if (graph2.getNode(ucuncuKademe.getVeri().getKullaniciAdi()) == null) {
                        graf2.nodeEkle(ucuncuKademe);
                        Node nodeadd4 = graph2.addNode(ucuncuKademe.getVeri().getKullaniciAdi());
                        nodeadd4.setAttribute("ui.label", ucuncuKademe.getVeri().getKullaniciAdi());
                        nodeadd4.setAttribute("ui.style", "fill-color: rgb(187,223,237);");
                        nodeadd4.setAttribute("ui.style", "text-size: 20;");
                    }
                    graf2.kenarEkle(ikinciKademe, ucuncuKademe);
                    Edge edgeadd3 = graph2.addEdge(ikinciKademe.getVeri().getKullaniciAdi() + ucuncuKademe.getVeri().getKullaniciAdi(), ikinciKademe.getVeri().getKullaniciAdi(), ucuncuKademe.getVeri().getKullaniciAdi());
                    edgeadd3.setAttribute("ui.style", "fill-color: rgb(147,36,16);");
                }
            }
        }
        System.setProperty("org.graphstream.ui","swing");
        graph2.display();
        return graf2;
    }
}

