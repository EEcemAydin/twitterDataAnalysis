package PROLAB3_1;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

import java.io.*;

public class NEWMAİN {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        kullanici_ilgiAlani kullanici_ilgiAlani = new kullanici_ilgiAlani();
        ilgiAlani_kullanici ilgiAlani_kullanici = new ilgiAlani_kullanici();
        Graf<Kullanici> graf =new Graf<Kullanici>();
        HashMap<String, Kullanici> KullaniciHash = new HashMap<>();
        HashMap<String, CiftLinkedList<String>> KullanicilarinIlgiAlanlari = new HashMap<>();
        HashMap<String, HashMap<String, CiftLinkedList<Kullanici>>> ilgiAlani_KullaniciHASH_HASHlist = new HashMap<>();
        //AYRI AYRI HASHTABLOSU
        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHash = new HashMap<>();


        HashMap<String, CiftLinkedList<Kullanici>> ilgiAlani_kullaniciHashDOGA_OLAYLARI = new HashMap<>();//ilgi alanları için ayrı ayrı hash tablosu ve kullanıcı listesi
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

        FileReader fileReader = new FileReader("Veriler/guncellenmis_veri.json");//dosyadan okuma
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line;


        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        bufferedReader.close();
        fileReader.close();

        JSONArray jsonArray = new JSONArray(sb.toString());
        for (int i = 0; i < jsonArray.length(); i++) {//json dosyasından okuma ve kullanıcı oluşturma işlemleri hash tablosuna ekleme graf için nodelar oluşturma kullanıcının ilgi alanlarını bulma
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
                CiftLinkedList<tweet> tempTweetlerList = new CiftLinkedList<>();
                for (int j = 0; j < jsonTweetlerArray.length(); j++) {
                    tweet tempTweet = new tweet();
                    tempTweet.setTweet(jsonTweetlerArray.getString(j));
                    tempTweet.setKonu(IlgiAlaniBulucu.IlgiAlaniBul(jsonTweetlerArray.getString(j)));
                    tempTweetlerList.ekle(tempTweet);
                }
                tempKullanici.setTweetler(tempTweetlerList);
                KullaniciHash.koy(tempKullanici.getKullaniciAdi(), tempKullanici);
                KullanicilarinIlgiAlanlari.koy(tempKullanici.getKullaniciAdi(), PROLAB3_1.kullanici_ilgiAlani.kullanici_ilgiAlani(tempKullanici));
                DUGUM<Kullanici> tempDUGUM = new DUGUM<>(tempKullanici);
                graf.nodeEkle(tempDUGUM);

        }

        ilgiAlani_kullanici.ilgiAlani_kullaniciFunc(ilgiAlani_kullaniciHash, KullanicilarinIlgiAlanlari, KullaniciHash, ilgiAlani_KullaniciHASH_HASHlist);

        long stopTime = System.currentTimeMillis();
        System.out.println(("Dosyadan okuma ve ilgi alanlarını eklenmesi "+(stopTime - startTime)));
        JSONArray jsonUsersArray = new JSONArray();

        try (JsonGenerator jsonGenerator = new JsonFactory().createGenerator(new FileWriter("output.json"))) {//json dosyasına yazma
            jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());

            jsonGenerator.writeStartArray();

            for (int l = 0; l < KullaniciHash.boyut(); l++) {
                Kullanici value = KullaniciHash.getVeriler().get(l);
                if (value.getBolge().equals("TR")) {


                    jsonGenerator.writeStartObject();

                    jsonGenerator.writeStringField("kullaniciAdi", value.getKullaniciAdi());
                    jsonGenerator.writeStringField("adSoyad", value.getAdSoyad());
                    jsonGenerator.writeNumberField("takipciSayisi", value.getTakipciler().boyut());
                    jsonGenerator.writeNumberField("takipEdilenSayisi", value.getTakipEdilenler().boyut());
                    jsonGenerator.writeStringField("dil", value.getDil());
                    jsonGenerator.writeStringField("bolge", value.getBolge());

                    jsonGenerator.writeArrayFieldStart("ilgiAlanlari");
                    jsonGenerator.writeString(KullanicilarinIlgiAlanlari.al(value.getKullaniciAdi()).get(0));
                    jsonGenerator.writeString(KullanicilarinIlgiAlanlari.al(value.getKullaniciAdi()).get(1));
                    jsonGenerator.writeString(KullanicilarinIlgiAlanlari.al(value.getKullaniciAdi()).get(2));
                    jsonGenerator.writeEndArray();

                    jsonGenerator.writeArrayFieldStart("tweetler");
                    for (int a = 0; a < value.getTweetler().boyut(); a++) {
                        jsonGenerator.writeStartObject();
                        jsonGenerator.writeStringField("tweet", value.getTweetler().get(a).getTweet());
                        jsonGenerator.writeStringField("konu", value.getTweetler().get(a).getKonu());
                        jsonGenerator.writeEndObject();
                    }
                    jsonGenerator.writeEndArray();

                    jsonGenerator.writeArrayFieldStart("takipEdilenler");
                    for (int i = 0; i < value.getTakipEdilenler().boyut(); i++) {
                        jsonGenerator.writeString(value.getTakipEdilenler().get(i));
                    }
                    jsonGenerator.writeEndArray();

                    jsonGenerator.writeArrayFieldStart("takipciler");
                    for (int i = 0; i < value.getTakipciler().boyut(); i++) {
                        jsonGenerator.writeString(value.getTakipciler().get(i));
                    }
                    jsonGenerator.writeEndArray();

                    jsonGenerator.writeEndObject();
                }
            }

            jsonGenerator.writeEndArray();

            System.out.println("JSON verileri başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long stopTime2 = System.currentTimeMillis();
        System.out.println(("Dosyaya yazma" + (stopTime2 - stopTime)));

        Kullanici kullanici = new Kullanici();
        kullanici=KullaniciHash.al("kelsey94");//İKİ graf içinde kullanici seçimi


        for (int i = 0; i < kullanici.getTakipEdilenler().boyut(); i++) {
            Kullanici temp = KullaniciHash.al(kullanici.getTakipEdilenler().get(i));//secilen graf için takip edilenlerin kenarları oluşturuan yer
            KENAR<Kullanici> edge =new KENAR<>(graf.dugumGetir(kullanici),graf.dugumGetir(temp));
            graf.dugumGetir(kullanici).kenarEkle(edge);
        }
        for (int i = 0; i < kullanici.getTakipciler().boyut(); i++) {
            Kullanici temp = KullaniciHash.al(kullanici.getTakipciler().get(i));//seçilen kullanıcı için graf içim takipçilerin kenarları oluşturulan yer
            KENAR<Kullanici> edge =new KENAR<>(graf.dugumGetir(kullanici),graf.dugumGetir(temp));
            graf.dugumGetir(kullanici).kenarEkle(edge);
        }

        Graph graph = new SingleGraph(graf.dugumGetir(kullanici)+ "kullancısının Grafı");

        Node graphNode1 = graph.addNode(graf.dugumGetir(kullanici).getVeri().getKullaniciAdi());
        graphNode1.setAttribute("ui.label", graf.dugumGetir(kullanici).getVeri().getKullaniciAdi()); // Kullanıcı adlarını göstermek için etiket ekleyin
        graphNode1.setAttribute("ui.style", "text-size: 20;");

        for(int i =0;i<graf.dugumGetir(kullanici).getKenarlar().boyut();i++) {
            if (graph.getNode(graf.dugumGetir(kullanici).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi()) == null) {
                Node graphNode = graph.addNode(graf.dugumGetir(kullanici).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi());
                graphNode.setAttribute("ui.label", graf.dugumGetir(kullanici).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi()); // Kullanıcı adlarını göstermek için etiket ekleyin
                graphNode.setAttribute("ui.style", "text-size: 20;");

            }
        }


        for (int i=0;i<graf.dugumGetir(kullanici).getKenarlar().boyut(); i++) {
            String sourceNodeId = String.valueOf(graf.dugumGetir(kullanici).getKenarlar().get(i).getBaslangic().getVeri().getKullaniciAdi());
            String targetNodeId = String.valueOf(graf.dugumGetir(kullanici).getKenarlar().get(i).getBitis().getVeri().getKullaniciAdi());
            Edge graphEdge = graph.addEdge(sourceNodeId + targetNodeId, sourceNodeId, targetNodeId); // Kenarları oluşturduk
            graphEdge.setAttribute("ui.style", "fill-color: rgb(0,100,255);"); // Kenarları mavi renk yaptık
            if (i> graf.dugumGetir(kullanici).getVeri().getTakipEdilenler().boyut()){
                graphEdge.setAttribute("ui.style", "fill-color: rgb(255,54,54);"); // Kenarları kırmızı olarak ayarladık
            }
        }

        JSONArray jsonArrayilgialaniKullanici = new JSONArray();
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("ILGIALANLARININKULLANİCİLARİ.json"))) {
            for (int i = 0; i < ilgiAlani_KullaniciHASH_HASHlist.boyut(); i++) {//ilgi alanları için kullanıcıları json dosyasına yazma
                for (int j = 0; j < 1; j++) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("İlgi Alani", ilgiAlani_KullaniciHASH_HASHlist.getAnahtarlar().get(i));
                    System.out.println(ilgiAlani_KullaniciHASH_HASHlist.getAnahtarlar().get(i));
                    JSONArray ilgiAlanlarikullanicilari = new JSONArray();
                    for (int k = 0; k < ilgiAlani_KullaniciHASH_HASHlist.getVeriler().get(i).getVeriler().get(0).boyut(); k++) {
                        ilgiAlanlarikullanicilari.put(ilgiAlani_KullaniciHASH_HASHlist.getVeriler().get(i).getVeriler().get(0).get(k).getKullaniciAdi());
                        System.out.print(ilgiAlani_KullaniciHASH_HASHlist.getVeriler().get(i).getVeriler().get(0).get(k).getKullaniciAdi() + " ,");
                    }
                    jsonObject.put("Kullanicilar", ilgiAlanlarikullanicilari);
                    jsonArrayilgialaniKullanici.put(jsonObject);

                    System.out.println();
                }
            }


            byte[] bytes = jsonArrayilgialaniKullanici.toString(4).getBytes();
            bufferedOutputStream.write(bytes);
            System.out.println("JSON verileri başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }



        System.setProperty("org.graphstream.ui","swing");
        graph.display();

        StringBuilder jsonBuilder2 = new StringBuilder();
        StringBuilder jsonBuilder3 = new StringBuilder();//kullanıcının eşleşen tweetleri
        tree tree =new tree();
        Graf<Kullanici>graf2 =tree.tree(KullaniciHash,kullanici);

        System.out.println("DFS");
        STACK<Kullanici> ziyaretEdilen = new STACK<>();
        ziyaretEdilen=graf2.dfs(graf2.dugumGetir(kullanici));//graf2 için dfs
        //graf2.anahtarKelimeIcerenTweetleriListele(kullanici,"Doga",graf2,KullaniciHash);//graf2 için anahtar kelime içeren tweetleri listele
        String secilenIlgiAlani="Doga";
        JSONArray jsonDFSoutput = new JSONArray();
        JSONArray jsonDFSilgiAlanArray=new JSONArray();

        while (!ziyaretEdilen.bosmu()){//DFS DE ÜRETİLEN STACKDEN KULLANICILARIN TEK TEK ALINMASI VE JSON DOSYASINA YAZILMASI VE STACKDEN ALINAN KULLANICLARININ TWEETLERİNİN GETRİLMESİ
            JSONObject jsonDFSilgiAlan=new JSONObject();
            String kullaniciAdi=ziyaretEdilen.al().getKullaniciAdi();
            jsonDFSilgiAlan.put("Kullanici Adi",kullaniciAdi);
            JSONArray jsonArrayTweet = new JSONArray();
            for (int i = 0; i < KullaniciHash.al(kullaniciAdi).getTweetler().boyut(); i++) {
                JSONObject tweet = null;
                if (KullaniciHash.al(kullaniciAdi).getTweetler().get(i).getKonu()!=null){
                    if (KullaniciHash.al(kullaniciAdi).getTweetler().get(i).getKonu().equals(secilenIlgiAlani)) {
                        tweet = new JSONObject();
                        tweet.put("Konu", KullaniciHash.al(kullaniciAdi).getTweetler().get(i).getKonu());
                        tweet.put("Tweet", KullaniciHash.al(kullaniciAdi).getTweetler().get(i).getTweet());
                        jsonArrayTweet.put(tweet);
                    }

                }

            }
            jsonDFSilgiAlan.put("Tweets",jsonArrayTweet);
            jsonDFSilgiAlanArray.put(jsonDFSilgiAlan);
            jsonDFSoutput.put(kullaniciAdi);

        }
        JSONObject json = new JSONObject();
        json.put("DFSSTACK", jsonDFSoutput);
        JSONObject json2 = new JSONObject();
        json2.put("DFSSTACK", jsonDFSilgiAlanArray);

        try (BufferedWriter writer2 = new BufferedWriter(new FileWriter("DFSSTACKOUTPUT.json"))) {//DFS STACK ÇIKTISI
            writer2.write(json.toString(4));
            System.out.println("JSON dosyasına yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer3 = new BufferedWriter(new FileWriter("DFSSTACKOUTPUTILGI.json"))) {//DFS STACK ÇIKTISI TWEETLERİ
            writer3.write(json2.toString(4));
            System.out.println("JSON dosyasına yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONArray ikiKullaniciIlgiJsonu=new JSONArray();
        //iki kullanıcının takipcileri arasında benzer ilgi alanına sahip kullanıcıların çıkarılması
        Kullanici kullanici1=graf2.getNodes().get(15).getVeri();
        Kullanici kullanici2=graf2.getNodes().get(19).getVeri();

        System.out.println("Kullanici 1 ="+kullanici1.getKullaniciAdi());
        System.out.println("Kullanici 2 ="+kullanici2.getKullaniciAdi());
        //2.kullanıcının takipcilerinin listlerindeki ortak ilgli alananı sahip kullanıcların eşlenmesi
        for (int i = 0; i < kullanici1.getTakipciler().boyut(); i++) {//1.kullanıcının takipcileri foru
            Kullanici tempKullanici= KullaniciHash.al(kullanici1.getTakipciler().get(i));
            for (int j = 0; j < KullanicilarinIlgiAlanlari.al(tempKullanici.getKullaniciAdi()).boyut(); j++) {//1.kullanıncın takipcileririn ilgi alanı foru
                for (int k = 0; k < kullanici2.getTakipciler().boyut(); k++) {//ikinci kullanıcnın takipcileri foru
                    Kullanici tempKullanici2 = KullaniciHash.al(kullanici2.getTakipciler().get(k));
                    for (int l = 0; l < KullanicilarinIlgiAlanlari.al(tempKullanici2.getKullaniciAdi()).boyut(); l++) {
                        if (KullanicilarinIlgiAlanlari.al(tempKullanici.getKullaniciAdi()).get(j).equals(KullanicilarinIlgiAlanlari.al(tempKullanici2.getKullaniciAdi()).get(l))){
                            System.out.println("Kullanici"+tempKullanici.getKullaniciAdi()+"Kullanici"+tempKullanici2.getKullaniciAdi()+"ile"+KullanicilarinIlgiAlanlari.al(tempKullanici.getKullaniciAdi()).get(j)+"Konusuyla eşleşdi");
                            JSONObject veri =new JSONObject();
                            veri.put("Kullanici 1",tempKullanici.getKullaniciAdi());
                            veri.put("Kullanici 2",tempKullanici2.getKullaniciAdi());
                            veri.put("Eşleşen Konu",KullanicilarinIlgiAlanlari.al(tempKullanici.getKullaniciAdi()).get(j));
                            ikiKullaniciIlgiJsonu.put(veri);
                        }
                    }
                }
            }

        }
        try (BufferedWriter writer4 = new BufferedWriter(new FileWriter("IKIKullaniciTakipciİlgi.json"))) {//2 kullanıcının takipcileri arasında benzer ilgi alanına sahip kullanıcıların json dosyasına yazılması
            writer4.write(ikiKullaniciIlgiJsonu.toString(4));
            System.out.println("JSON dosyasına yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
