package PROLAB3_1;
/*import org.graphstream.ui.javafx.renderer.shape.javafx.baseShapes.Form;
import org.json.*;

import java.io.*;
import java.util.List;
import java.util.Random;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class Main {
    public static void main(String[] args) throws IOException {
        kullanici_ilgiAlani kullanici_ilgiAlani = new kullanici_ilgiAlani();
        ilgiAlani_kullanici ilgiAlani_kullanici = new ilgiAlani_kullanici();
        HashMap<String, Kullanici> KullaniciHash = new HashMap<>();
        HashMap<String, CiftLinkedList<String>> KullanicilarinIlgıAlanlari = new HashMap<>();
        HashMap<String, HashMap<String, CiftLinkedList<Kullanici>>> ilgiAlani_KullaniciHASH_HASHlist = new HashMap<>();
        //AYRI AYRI HASHTABLOSU
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHash = new HashMap<>();


        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashDOGA_OLAYLARI = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Doga_Olaylari", ilgiAlani_kullaniciHashDOGA_OLAYLARI);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashCANLILAR = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Canlilar", KilgiAlani_kullaniciHashCANLILAR);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashHAYVANLAR = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Hayvanlar", ilgiAlani_kullaniciHashHAYVANLAR);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashBITKILER = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Bitkiler", KilgiAlani_kullaniciHashBITKILER);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashINSAN = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Insan", ilgiAlani_kullaniciHashINSAN);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashYEMEK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Yemek", KilgiAlani_kullaniciHashYEMEK);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashSPOR = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Spor", ilgiAlani_kullaniciHashSPOR);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashISTATISTIK_MATEMATIK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Istatistik_matematik", KilgiAlani_kullaniciHashISTATISTIK_MATEMATIK);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashEKONOMI = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Ekonomi", ilgiAlani_kullaniciHashEKONOMI);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashSOSYAL_MEDYA = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Sosyal_medya", KilgiAlani_kullaniciHashSOSYAL_MEDYA);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashMUZIK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Müzik", ilgiAlani_kullaniciHashMUZIK);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashRESIM = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Resim", KilgiAlani_kullaniciHashRESIM);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashTIYATRO = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Tiyatro", ilgiAlani_kullaniciHashTIYATRO);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashFILM = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Film", KilgiAlani_kullaniciHashFILM);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashDANS = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Dans", ilgiAlani_kullaniciHashDANS);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashSAGLIK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Saglik", KilgiAlani_kullaniciHashSAGLIK);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashOYUN = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Oyun", ilgiAlani_kullaniciHashOYUN);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashTEKNOLOJI = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Teknoloji", KilgiAlani_kullaniciHashTEKNOLOJI);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashSIYASET = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Siyaset", ilgiAlani_kullaniciHashSIYASET);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashTOPLUM = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Toplum", KilgiAlani_kullaniciHashTOPLUM);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashARAC = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Arac", ilgiAlani_kullaniciHashARAC);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashDUYGU_DUSUNCE = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Duygu_Dusunce", KilgiAlani_kullaniciHashDUYGU_DUSUNCE);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashDIN = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Din", ilgiAlani_kullaniciHashDIN);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashAILE = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Aile", KilgiAlani_kullaniciHashAILE);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashHAVA_DURUMU = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Hava_durumu", ilgiAlani_kullaniciHashHAVA_DURUMU);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashSUC = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Suc", KilgiAlani_kullaniciHashSUC);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashSAVAS_GUVENLIK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Savas_güvenlik", ilgiAlani_kullaniciHashSAVAS_GUVENLIK);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashCINSELLIK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Cinsellik", KilgiAlani_kullaniciHashCINSELLIK);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashANTIK_ESKI_CAG = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Antik-Eski_Cag", ilgiAlani_kullaniciHashANTIK_ESKI_CAG);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashDOGA = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Doga", KilgiAlani_kullaniciHashDOGA);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashULKE = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Ulke", ilgiAlani_kullaniciHashULKE);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashEGITIM = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Egitim", KilgiAlani_kullaniciHashEGITIM);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashBILIM = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Bilim", ilgiAlani_kullaniciHashBILIM);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashDIL = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Dil", KilgiAlani_kullaniciHashDIL);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashMEVSIM = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Mevsim", ilgiAlani_kullaniciHashMEVSIM);
        HashMap<String, CiftLinkedList<Kullanici>> KilgiAlani_kullaniciHashBAGIMLILIK = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Bagımlılık", KilgiAlani_kullaniciHashBAGIMLILIK);
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashEDEBI_TUR = new HashMap<>();
        ilgiAlani_KullaniciHASH_HASHlist.koy("Edebi_tür", ilgiAlani_kullaniciHashEDEBI_TUR);


        Graf<Kullanici> graf = new Graf<>();


        FileReader fileReader = new FileReader("Veriler/sahte_kullanicilar_updated1.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line;
        String dosyaAdi = "yazilanDosya.txt";


        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        bufferedReader.close();
        JSONArray jsonArray = new JSONArray(sb.toString());
        for (int i = 0; i < jsonArray.length(); i++) {
            CiftLinkedList<String> tempIlgiAlanlari = new CiftLinkedList<>();
            Kullanici tempKullanici = new Kullanici();
            //graf için nodelar oluşturduk


            JSONObject jsonKullanici = jsonArray.getJSONObject(i);
            tempKullanici.setKullaniciAdi(jsonKullanici.getString("username"));
            tempKullanici.setAdSoyad(jsonKullanici.getString("name"));
            tempKullanici.setBolge(jsonKullanici.getString("region"));
            tempKullanici.setDil(jsonKullanici.getString("language"));


            JSONArray jsonTakipciArray = jsonKullanici.getJSONArray("followers");
            CiftLinkedList<String> tempTakipciList = new CiftLinkedList<>();
            for (int j = 0; j < jsonTakipciArray.length(); j++) {
                tempTakipciList.ekle(jsonTakipciArray.get(j).toString());
            }
            tempKullanici.setTakipciler(tempTakipciList);

            JSONArray jsonTakipEdilenlerArray = jsonKullanici.getJSONArray("following");
            CiftLinkedList<String> tempTakipEdilenlerList = new CiftLinkedList<>();
            for (int j = 0; j < jsonTakipEdilenlerArray.length(); j++) {
                tempTakipEdilenlerList.ekle(jsonTakipEdilenlerArray.get(j).toString());
            }
            tempKullanici.setTakipEdilenler(tempTakipEdilenlerList);

            JSONArray jsonTweetlerArray = jsonKullanici.getJSONArray("tweets");
            CiftLinkedList<String> tempTweetlerList = new CiftLinkedList<>();
            for (int j = 0; j < jsonTweetlerArray.length(); j++) {
                tempTweetlerList.ekle(jsonTweetlerArray.getString(j));
            }
            tempKullanici.setTweetler(tempTweetlerList);
            //kullanici ilgi alanı

            KullaniciHash.koy(tempKullanici.getKullaniciAdi(), tempKullanici);
            DUGUM<Kullanici> kullaniciNode = new DUGUM<>(tempKullanici);
            graf.nodeEkle(kullaniciNode);

            //KullanicilarinIlgıAlanlari.koy(tempKullanici.getKullaniciAdi(),tempIlgiAlanlari);
        }
        CiftLinkedList<Kullanici> eleman = KullaniciHash.getVeriler();
        System.out.println(eleman.boyut());
        System.out.println(eleman.get(0).getTakipEdilenler().boyut());

        for (int i = 0; i < KullaniciHash.boyut(); i++) {
            KullanicilarinIlgıAlanlari.koy(KullaniciHash.getVeriler().get(i).getKullaniciAdi(), PROLAB3_1.kullanici_ilgiAlani.kullanici_ilgiAlani(KullaniciHash.getVeriler().get(i)));
        }
        ilgiAlani_kullanici.ilgiAlani_kullaniciFunc(ilgiAlani_kullaniciHash, KullanicilarinIlgıAlanlari, KullaniciHash, ilgiAlani_KullaniciHASH_HASHlist);

        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("[");
        int elemanSayisi = eleman.boyut();
        System.out.println(KullaniciHash.boyut());
        for (int l = 0; l < KullaniciHash.boyut(); l++) {
            Kullanici value = KullaniciHash.al(graf.getNodes().get(l).getVeri().getKullaniciAdi());
            // Kullanıcı verilerini JSON formatına dönüştürün
            jsonBuilder.append("  {\n");
            jsonBuilder.append("    \"kullaniciAdi\":\"").append(value.getKullaniciAdi()).append("\",\n");
            jsonBuilder.append("    \"adSoyad\":\"").append(value.getAdSoyad()).append("\",\n");
            jsonBuilder.append("    \"takipciSayisi\":").append(value.getTakipciler().boyut()).append(",\n");
            jsonBuilder.append("    \"takipEdilenSayisi\":").append(value.getTakipEdilenler().boyut()).append(",\n");
            jsonBuilder.append("    \"dil\":\"").append(value.getDil()).append("\",\n");
            jsonBuilder.append("    \"bolge\":\"").append(value.getBolge()).append("\",\n");
            jsonBuilder.append("    \"İlgi Alanları\":{\"").append(KullanicilarinIlgıAlanlari.getVeriler().get(l).get(0)).append("\",\"").append(KullanicilarinIlgıAlanlari.getVeriler().get(l).get(1)).append("\",\"").append(KullanicilarinIlgıAlanlari.getVeriler().get(l).get(2)).append("\"},\n");
            // Tweetler dizisini oluşturun
            jsonBuilder.append("    \"tweetler\": [\n");
            for (int a = 0; a < value.getTweetler().boyut(); a++) {
                String tweet = value.getTweetler().get(a);
                jsonBuilder.append("      {\"tweet\":\"").append(tweet).append("\",\n        \"konu\":\"").append(IlgiAlaniBulucu.IlgiAlaniBul(tweet)).append("\"\n}");

                // Son tweet değilse virgül ekleyin
                if (a < value.getTweetler().boyut() - 1) {
                    jsonBuilder.append(",");
                }
                jsonBuilder.append("\n");
            }
            jsonBuilder.append("    ],\n");

            // Takip edilenler dizisini oluşturun
            jsonBuilder.append("    \"takipEdilenler\": [\n");
            for (int i = 0; i < value.getTakipEdilenler().boyut(); i++) {
                jsonBuilder.append("      \"").append(value.getTakipEdilenler().get(i)).append("\"");
                //KENAR<Kullanici> edge =new KENAR<>(graf.getNodes().get(value.getUserId()),graf.getNodes().get(value.getTakipEdilenler().get(i)));
                //graf.getNodes().get(value.getUserId()).kenarEkle(edge);
                // Son takip edilen değilse virgül ekleyin
                if (i < value.getTakipEdilenler().boyut() - 1) {
                    jsonBuilder.append(",");
                }
                jsonBuilder.append("\n");
            }
            jsonBuilder.append("    ],\n");

            // Takipçiler dizisini oluşturun
            jsonBuilder.append("    \"takipciler\": [\n");
            for (int i = 0; i < value.getTakipciler().boyut(); i++) {
                jsonBuilder.append("      \"").append(value.getTakipciler().get(i)).append("\"");
                //KENAR<Kullanici> edge =new KENAR<>(graf.getNodes().get(value.getUserId()),graf.getNodes().get(value.getTakipciler().get(i)));
                //graf.getNodes().get(value.getUserId()).kenarEkle(edge);
                // Son takipçi değilse virgül ekleyin
                if (i < value.getTakipciler().boyut() - 1) {
                    jsonBuilder.append(",");
                }
                jsonBuilder.append("\n");
            }
            jsonBuilder.append("    ]\n");

            // Kullanıcı kapanışı
            jsonBuilder.append("  }");

            // Son kullanıcı değilse virgül ekleyin
            if (l < elemanSayisi - 1) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\n");
        }

        jsonBuilder.append("]\n");

        // JSON verilerini dosyaya yazın
        try (FileWriter fileWriter = new FileWriter("output.json")) {
            fileWriter.write(jsonBuilder.toString());
            System.out.println("JSON verileri başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(graf.getEdges().boyut());
        System.out.println(graf.getNodes().get(0).getKenarlar().boyut());

        Graph graph = new SingleGraph(graf.getNodes().get(0).getVeri().getKullaniciAdi() + "kullancısının Grafı");

        // "graf" nesnesinin Nodes ve Edges koleksiyonlarından bilgileri alarak GraphStream'deki Graph'a ekleyin
        Node graphNode1 = graph.addNode(graf.getNodes().get(0).getVeri().getKullaniciAdi());
        graphNode1.setAttribute("ui.label", graf.getNodes().get(0).getVeri().getKullaniciAdi()); // Kullanıcı adlarını göstermek için etiket ekleyin
        graphNode1.setAttribute("ui.style", "text-size: 20;");

        for(int i =0;i<graf.getNodes().get(0).getKenarlar().boyut();i++) {
            if (graph.getNode(graf.getNodes().get(0).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi()) == null) {
                Node graphNode = graph.addNode(graf.getNodes().get(0).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi());
                graphNode.setAttribute("ui.label", String.valueOf(graf.getNodes().get(i).getVeri().getKullaniciAdi())); // Kullanıcı adlarını göstermek için etiket ekleyin
                graphNode.setAttribute("ui.style", "text-size: 20;");

            }
        }

        for (int i=0;i<graf.getNodes().get(0).getKenarlar().boyut(); i++) {
            String sourceNodeId = String.valueOf(graf.getNodes().get(0).getKenarlar().get(i).getBaslangic().getVeri().getKullaniciAdi());
            String targetNodeId = String.valueOf(graf.getNodes().get(0).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi());
            Edge graphEdge = graph.addEdge(sourceNodeId + targetNodeId, sourceNodeId, targetNodeId); // Kenarları oluşturun
            graphEdge.setAttribute("ui.style", "fill-color: rgb(0,100,255);"); // Kenarları mavi olarak ayarlayın
            if (i> KullaniciHash.getVeriler().get(0).getTakipEdilenler().boyut()){
                graphEdge.setAttribute("ui.style", "fill-color: rgb(255,54,54);"); // Kenarları kırmızı olarak ayarlayın
            }
        }




        for (int i = 0; i < ilgiAlani_KullaniciHASH_HASHlist.boyut(); i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(ilgiAlani_KullaniciHASH_HASHlist.getAnahtarlar().get(i));
                for (int k = 0; k < ilgiAlani_KullaniciHASH_HASHlist.getVeriler().get(i).getVeriler().get(0).boyut(); k++) {
                    System.out.print(ilgiAlani_KullaniciHASH_HASHlist.getVeriler().get(i).getVeriler().get(0).get(k).getKullaniciAdi() + " ,");
                }
                System.out.println();
            }
        }
        //tree tree = new tree(KullaniciHash);
        System.out.println(graf.getNodes().get(0).getVeri().getKullaniciAdi());
        // GraphStream görüntüleyiciyi oluşturun ve grafi gösterin
        System.setProperty("org.graphstream.ui","swing");
        graph.display();







    }

}
*/
