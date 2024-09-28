package Tekrarlar.OOP._08_Encapsulation._01_Encapsulation;

public class ToplulukMain {
    public static void main(String[] args) {

        Kisi k1=new Kisi();
        k1.ad="Selcuk";
        k1.soyad="Aydın";
      //  k1.yas=-2;
        k1.yasAta(-2);
        k1.yasAta(33);

        //yani değerler nesneye atanırken
        //kontrolden geçmeli doğru DATA için

        System.out.println(k1.yasVer());

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gönderme
        //ve alma işlemine
        // ENCAPSULATİON denir.

    }
}
