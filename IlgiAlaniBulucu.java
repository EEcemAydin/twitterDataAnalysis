    package PROLAB3_1;

    public class IlgiAlaniBulucu {


        public static String IlgiAlaniBul(String cumle) {
            HashMap<String, Listt<String>> kelimeListeleri = new HashMap<>();
            String[][] kelimeler = {{"deprem", "doğa olayları", "volkan"},
                    {"mezar", "ölüm", "aç", "ekosistem"},
                    {"kurt", "hayvanlar", "koyun", "kuş", "dinozor", "böceklerin", "kedi",},
                    {"bitki", "dut ağacından ", "hasılat", "Üzüm", "ağaç",},
                    {"çıplak", "şişman", "ayak", "insan"},
                    {"tuz", "fıstıktan", "yemek", "hamur işi", "kiraz", "pizza", "ızgara", "pişirmek", "lezzeti", "sosis", "köri"},
                    {"takım", "maç", "spor", "maraton", "Galatasaray", "Ligi", "şampiyonluğunu", "Fenerbahçe", "Beşiktaş", "kaykay", "spor salonunda", "golcü", "çeyrek finale", "Real Madrid", "penaltı"},
                    {"daire", "toplam", "çıkarım", "Olasılıkları", "Koni",},
                    {"vergi", "fabrika", "ekonomi", "bütçe", "demiryolu", "rüşvet", "para", "ticari", "Finansman",},
                    {"kullanıcı adı", "paylaş", "internet", "yorum", "beğeni", "çevrimiçi", "tweet",},
                    {"nota", "rap", "müzik", "albüm", "Konservatuvarı", "şan", "bestecisidir", "rock", "vokali", "solo", "piyano", "Albümlerindeki", "bestesini"},
                    {"sulu boya", "fırçayı", "resim", "ressamlığı"},
                    {"tiyatro", "sahnelenen", "rollerini"},
                    {"film", "Örümcek Adam", "gerilim", "romantik", "sezonlar", "senaryoda", "rollerini"},
                    {"balo", "dans",},
                    {"rüya", "vajina", "sağlık", "uyku", "doktor", "esteteik", "Antibiyotikler", "bakteriyel", "enfeksiyonları", "Plazma", "kan hücre", "ameliyathane", "dna", "regl kkanı", "plazma"},
                    {"oyun", "oyuncu", "jenga",},
                    {"hack", "eğitim", "uygulama", "anakart", "internet", "pc yuvası", "mouse", "dizüstü bilgisayar", "kod", "proje"},
                    {"yasal", "seçim", "siyaset", "politika", "parti", "yönetim", "cumhurbaşkanı"},
                    {"haber", "fikrim", "israf", "toplum", "cahil", "mültecilerin"},
                    {"denizaltı", "tekerlek", "egzozuma", "otomobil", "araç", "araba", "benzin", "yakıt", "gaz", "motor", "uçak", "karavan", "jet", "bisiklet"},
                    {"üzgün", "mahvol", "özle", "gül", "sevdiğimi", "saçma", "gülünç", "heyecan", "altına sıçmak"},
                    {"günah çıkarma", "dua", "sure", "tanrı", "allah", "ibadet", "şükür", "ateist", "arafat", "Müslüman", "Hristiyan", "vaftiz", "Türbe", "şeytan", "camileri", "Cehennem", "mezhebinde", "Katolik"},
                    {"çocuk", "anne", "baba", "dede", "bebek", "evlilik", "kadın", "erkek", "hamile"},
                    {"yağmur", "güneş", "bulut", "yağış"},
                    {"uyuşturucu", "hapishane", "şüpheli", "cinayet", "hapis", "terör"},
                    {"füze", "mermi", "dünya savaşı", "Saldırı", "yaralı", "silah", "polis", "asker", "Tümen Komutanı", "güenlik güçleri", "Kol Orduda ", "subay", "Tabur","Saldırı", "yaralı", "komutanı", "sivillerin", "zafere", "Silah", "savaş", "asker", "tank", "ordu", "taret", "mayın"},
                    {"cinsellik", "sex", "penis", "Eşcinselliği"},
                    {"tapınak", "imparatorluk", "Asur", "Yugoslavya Krallığı", "kabile", "kral", "Bizans", "Helenistik", "anzimat Devri"},
                    {"köy", "bazalt taşı", "Habitat", "ada", "göl", "deniz", "dağ", "mağara"},
                    {"Türkiye", "Ermenistan", "Çin", "Kürdistan", "Suriye", "Yunanistan", "İskoçya", "Moğol", "amerika"},
                    {"ilkokul", "Üniversitesi", "Fakültesi", "lisansı", "doktorası", "akademik", "Yüksek Okulunda"},
                    {"termodinamik", "bilim adamı", "laktik asit ", "mineraller", "antiseptik", "yakınsak", "Termodinamiğin", "kara delik", "jeopolitik", "araştırması", "merkezkaç", "kuvveti", "Sosyal Psikolojiye", "parçacık", "iyonu", "göreli", "elementtir", "bileşiktir", "Lateks"},
                    {"Almanca", "İngilizce", "Rusça"},
                    {"yaz", "kış", "ilkbahar", "sonbahar", "iklim"},
                    {"alkol", "sarhoş", "bira", "viski"},
                    {"şiir", "deneme", "dizi", "hikaye", "kompozisyon", "fıkra", "dergi", "yazılar"}
            };

            kelimeListeleri.koy("Doga_Olaylari", new Listt(kelimeler[0]));
            kelimeListeleri.koy("Canlilar", new Listt(kelimeler[1]));
            kelimeListeleri.koy("Hayvanlar", new Listt(kelimeler[2]));
            kelimeListeleri.koy("Bitkiler", new Listt(kelimeler[3]));
            kelimeListeleri.koy("Insan", new Listt(kelimeler[4]));
            kelimeListeleri.koy("Yemek", new Listt(kelimeler[5]));
            kelimeListeleri.koy("Spor", new Listt(kelimeler[6]));
            kelimeListeleri.koy("Istatistik_matematik", new Listt(kelimeler[7]));
            kelimeListeleri.koy("Ekonomi", new Listt(kelimeler[8]));
            kelimeListeleri.koy("Sosyal_medya", new Listt(kelimeler[9]));
            kelimeListeleri.koy("Müzik", new Listt(kelimeler[10]));
            kelimeListeleri.koy("Resim", new Listt(kelimeler[11]));
            kelimeListeleri.koy("Tiyatro", new Listt(kelimeler[12]));
            kelimeListeleri.koy("Film", new Listt(kelimeler[13]));
            kelimeListeleri.koy("Dans", new Listt(kelimeler[14]));
            kelimeListeleri.koy("Saglik", new Listt(kelimeler[15]));
            kelimeListeleri.koy("Oyun", new Listt(kelimeler[16]));
            kelimeListeleri.koy("Teknoloji", new Listt(kelimeler[17]));
            kelimeListeleri.koy("Siyaset", new Listt(kelimeler[18]));
            kelimeListeleri.koy("Toplum", new Listt(kelimeler[19]));
            kelimeListeleri.koy("Arac", new Listt(kelimeler[20]));
            kelimeListeleri.koy("Duygu_Dusunce", new Listt(kelimeler[21]));
            kelimeListeleri.koy("Din", new Listt(kelimeler[22]));
            kelimeListeleri.koy("Aile", new Listt(kelimeler[23]));
            kelimeListeleri.koy("Hava_durumu", new Listt(kelimeler[24]));
            kelimeListeleri.koy("Suc", new Listt(kelimeler[25]));
            kelimeListeleri.koy("Savas_güvenlik", new Listt(kelimeler[26]));
            kelimeListeleri.koy("Cinsellik", new Listt(kelimeler[27]));
            kelimeListeleri.koy("Antik-Eski_Cag", new Listt(kelimeler[28]));
            kelimeListeleri.koy("Doga", new Listt(kelimeler[29]));
            kelimeListeleri.koy("Ulke", new Listt(kelimeler[30]));
            kelimeListeleri.koy("Egitim", new Listt(kelimeler[31]));
            kelimeListeleri.koy("Bilim", new Listt(kelimeler[32]));
            kelimeListeleri.koy("Dil", new Listt(kelimeler[33]));
            kelimeListeleri.koy("Mevsim", new Listt(kelimeler[34]));
            kelimeListeleri.koy("Bagımlılık", new Listt(kelimeler[35]));
            kelimeListeleri.koy("Edebi_tür", new Listt(kelimeler[36]));

            String[] cumleKelimeleri = cumle.split("\\s+");
            for (int j = 0; j < kelimeListeleri.boyut(); j++) {
                String diziAdi = kelimeListeleri.getAnahtarlar().get(j);
                Listt<String> kelimeListesi = kelimeListeleri.al(diziAdi);
                for (int f =0;f< kelimeListesi.boyut();f++) {
                    String kelime = kelimeListesi.get(f);
                    for (String k : cumleKelimeleri) {
                        if (k.startsWith(kelime)) {
                            return diziAdi;
                        }

                    }
                }
            }



        return null;
        }
    }


