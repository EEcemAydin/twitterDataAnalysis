package PROLAB3_1;


public class kullanici_ilgiAlani {


    public static CiftLinkedList<String> kullanici_ilgiAlani(Kullanici ilgiAlan) {

        HashMap<String,Integer>etiketSayici=new HashMap<>();
        etiketSayici.koy("Doga_Olaylari", 0);
        etiketSayici.koy("Canlilar", 0);
        etiketSayici.koy("Hayvanlar", 0);
        etiketSayici.koy("Bitkiler", 0);
        etiketSayici.koy("Insan", 0);
        etiketSayici.koy("Yemek",0);
        etiketSayici.koy("Spor", 0);
        etiketSayici.koy("Istatistik_matematik", 0);
        etiketSayici.koy("Ekonomi", 0);
        etiketSayici.koy("Sosyal_medya",0);
        etiketSayici.koy("Müzik",0);
        etiketSayici.koy("Resim", 0);
        etiketSayici.koy("Tiyatro",0);
        etiketSayici.koy("Film",0);
        etiketSayici.koy("Dans", 0);
        etiketSayici.koy("Saglik", 0);
        etiketSayici.koy("Oyun", 0);
        etiketSayici.koy("Teknoloji", 0);
        etiketSayici.koy("Siyaset", 0);
        etiketSayici.koy("Toplum",0);
        etiketSayici.koy("Arac", 0);
        etiketSayici.koy("Duygu_Dusunce", 0);
        etiketSayici.koy("Din",0);
        etiketSayici.koy("Aile", 0);
        etiketSayici.koy("Hava_durumu", 0);
        etiketSayici.koy("Suc", 0);
        etiketSayici.koy("Savas_güvenlik", 0);
        etiketSayici.koy("Cinsellik", 0);
        etiketSayici.koy("Antik-Eski_Cag", 0);
        etiketSayici.koy("Doga", 0);
        etiketSayici.koy("Ulke", 0);
        etiketSayici.koy("Egitim",0);
        etiketSayici.koy("Bilim",0);
        etiketSayici.koy("Dil", 0);
        etiketSayici.koy("Mevsim",0);
        etiketSayici.koy("Bagımlılık", 0);
        etiketSayici.koy("Edebi_tür", 0);


        CiftLinkedList<tweet> tweets = ilgiAlan.getTweetler();
        CiftLinkedList<String> Etiketler=new CiftLinkedList<>();
        CiftLinkedList<Integer> Degerler=new CiftLinkedList<>();
        for (int i = 0; i < etiketSayici.boyut(); i++) {
            Etiketler.ekle(etiketSayici.getAnahtarlar().get(i));
            Degerler.ekle(etiketSayici.getVeriler().get(i));
        }

        for (int i = 0; i < tweets.boyut(); i++) {
            tweet temptweet=tweets.get(i);
            String cumle=temptweet.getTweet();
            String IndisReturn=null;
            IndisReturn=IlgiAlaniBulucu.IlgiAlaniBul(cumle);
            if (IndisReturn!=null){
                int indis = Etiketler.hangiIndis(IndisReturn);
                Degerler.set(indis,Degerler.get(indis)+1);
            }


        }

        for (int i = 0; i < Degerler.boyut(); i++) {
            for (int j = i+1; j < Degerler.boyut(); j++) {
                if(Degerler.get(i)<Degerler.get(j)){
                    int temp=Degerler.get(i);
                    Degerler.set(i,Degerler.get(j));
                    Degerler.set(j,temp);
                    String temp2=Etiketler.get(i);
                    Etiketler.set(i,Etiketler.get(j));
                    Etiketler.set(j,temp2);
                }
            }
        }
        //kelimeler listesinde il3 değer kalıp gerisini sil
        for (int i = 0; i < Etiketler.boyut(); i++) {
            if(i>2){
                Etiketler.sil(i);
                Degerler.sil(i);
                i--;
            }
        }
        System.out.println("kullanıcinin ilgi bulma fonksiyonu çalıştı");
        return Etiketler;
    }

}




