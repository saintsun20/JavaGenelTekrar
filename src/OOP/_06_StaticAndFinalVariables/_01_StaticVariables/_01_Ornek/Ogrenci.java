package Tekrarlar.OOP._06_StaticAndFinalVariables._01_StaticVariables._01_Ornek;

public class Ogrenci {
    String ad;
    String soyad;
   static String OkulAd;
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar.
    // hepsine atanır, tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String ad, String soyad){

        this.ad=ad;
        this.soyad=soyad;
        this.OkulAd="Yıldırım İlkokulu";

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", OkulAd='" + OkulAd + '\'' +
                '}';
    }
}
