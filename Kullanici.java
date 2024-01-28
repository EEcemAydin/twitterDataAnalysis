package PROLAB3_1;


public class Kullanici {

    private String kullaniciAdi;
    private String adSoyad;
    private String dil;
    private String bolge;
    private CiftLinkedList<tweet> tweetler; // Kullanıcının tweetlerini içeren liste
    private CiftLinkedList<String> takipciler; // Kullanıcının takipçi listesi
    private CiftLinkedList<String> takipEdilenler; // Kullanıcının takip ettiği kişilerin listesi


    public Kullanici()
    {
    }
    public Kullanici(String kullaniciAdi, String adSoyad, String dil, String bolge,
                     CiftLinkedList<tweet> tweetler, CiftLinkedList<String> takipciler, CiftLinkedList<String> takipEdilenler) {

        this.kullaniciAdi = kullaniciAdi;
        this.adSoyad = adSoyad;
        this.dil = dil;
        this.bolge = bolge;
        this.tweetler = tweetler;
        this.takipciler = takipciler;
        this.takipEdilenler = takipEdilenler;
    }


    public CiftLinkedList<tweet> getTweetler() {
        return tweetler;
    }

    public void setTweetler(CiftLinkedList<tweet> tweetler) {
        this.tweetler = tweetler;
    }

    public CiftLinkedList<String> getTakipciler() {
        return takipciler;
    }

    public void setTakipciler(CiftLinkedList<String> takipciler) {
        this.takipciler = takipciler;
    }

    public CiftLinkedList<String> getTakipEdilenler() {
        return takipEdilenler;
    }
    public void setTakipEdilenler(CiftLinkedList<String> takipEdilenler) {
        this.takipEdilenler = takipEdilenler; 
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public String getBolge() {
        return bolge;
    }
    public void setBolge(String bolge) {
        this.bolge = bolge;
    }
    public String getDil() {
        return dil;
    }
    public void setDil(String dil) {
        this.dil = dil;
    }

}

class tweet{
    String tweet;
    String konu;

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }
}
