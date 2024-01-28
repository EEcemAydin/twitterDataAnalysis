package PROLAB3_1;


public class ilgiAlani_kullanici {

    public void ilgiAlani_kullaniciFunc(HashMap<String,CiftLinkedList<Kullanici>> ilgiAlani_kullanaciHash,HashMap<String,CiftLinkedList<String>> KullanicilarinIlgıAlanlari,HashMap<String, Kullanici> KullaniciHash,HashMap<String,HashMap<String,CiftLinkedList<Kullanici>>> ilgiAlani_KullaniciHASH_HASHlist)
    {

        ilgiAlani_KullaniciHASH_HASHlist.al("Doga_Olaylari").koy("Doga_Olaylari", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Canlilar").koy("Canlilar",new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Hayvanlar").koy("Hayvanlar", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Bitkiler").koy("Bitkiler", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Insan").koy("Insan", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Yemek").koy("Yemek",new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Spor").koy("Spor",new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Istatistik_matematik").koy("Istatistik_matematik", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Ekonomi").koy("Ekonomi", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Sosyal_medya").koy("Sosyal_medya", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Müzik").koy("Müzik", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Resim").koy("Resim", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Tiyatro").koy("Tiyatro", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Film").koy("Film", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Dans").koy("Dans", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Saglik").koy("Saglik", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Oyun").koy("Oyun", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Teknoloji").koy("Teknoloji", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Siyaset").koy("Siyaset",new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Toplum").koy("Toplum",new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Arac").koy("Arac", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Duygu_Dusunce").koy("Duygu_Dusunce", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Din").koy("Din", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Aile").koy("Aile", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Hava_durumu").koy("Hava_durumu",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Suc").koy("Suc",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Savas_güvenlik").koy("Savas_güvenlik",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Cinsellik").koy("Cinsellik",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Antik-Eski_Cag").koy("Antik-Eski_Cag",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Doga").koy("Doga",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Ulke").koy("Ulke",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Egitim").koy("Egitim",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Bilim").koy("Bilim",  new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Dil").koy("Dil", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Mevsim").koy("Mevsim",new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Bagımlılık").koy("Bagımlılık", new CiftLinkedList<Kullanici>());
        ilgiAlani_KullaniciHASH_HASHlist.al("Edebi_tür").koy("Edebi_tür", new CiftLinkedList<Kullanici>());

        for (int i = 0; i < KullaniciHash.boyut(); i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < ilgiAlani_KullaniciHASH_HASHlist.boyut(); k++)
                {
                    if (KullanicilarinIlgıAlanlari.getVeriler().get(i).get(j).equals(ilgiAlani_KullaniciHASH_HASHlist.getAnahtarlar().get(k)))
                    {
                     ilgiAlani_KullaniciHASH_HASHlist.getVeriler().get(k).getVeriler().get(0).ekle(KullaniciHash.getVeriler().get(i));
                    }
                }
            }
            System.out.println("Kullanici ilgi alanlari eklendi");
        }
        System.out.println("Fonksiyon calisti");
    }
}
