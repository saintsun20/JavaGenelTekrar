package Tekrarlar.OOP._05_PrivateProtectedErisim._03_Protected.bir;

public class Doktor {
    public String hastaneAdi;  // herkes erişebilir
    String adi; // yanı pakettekiler
    private String sicilNo; // sadece classın içinden erişilebilir
    protected String bolum;  //default gibi aynı pakette erişilebilir

    Doktor()  // kendi paketindekiler erişebilir
    {

    }

    public Doktor(String adi)  // herkes erişebilir
    {
        this.adi=adi;
    }
}
