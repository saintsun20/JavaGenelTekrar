package Tekrarlar.OOP._03_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

    Ogrenci()
    {
        System.out.println("Nesne oluşturulma anı");
        System.out.println("denize git");
    }
// Generate yapılarak Constructor eklenir

    Ogrenci(int id, String ad, String  soyad, int sinif)  // Constructor
    {
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=sinif;
    }
}
