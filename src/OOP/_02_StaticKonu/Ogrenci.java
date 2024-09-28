package Tekrarlar.OOP._02_StaticKonu;

public class Ogrenci {
    String ad;
    String soyad;

    void belgeYazdir(){
        this.ad="";
    }

    static void belgeYazdirStatic(){
        //  this.ad="";  // Statiğin içindeki herşey static olmalı this ile hata verir

    }
}
