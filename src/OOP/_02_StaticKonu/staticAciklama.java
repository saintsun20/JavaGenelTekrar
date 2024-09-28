package Tekrarlar.OOP._02_StaticKonu;

public class staticAciklama {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.belgeYazdir(); // ogr1 NESNE
        // nesne ye bağlı (static yok)
        // metodun içinde nesneye ait özellikler(field)
        // kullanılacaksa, yani içinde this le belirtilen
        // değişkenler kullanılacaksa STATIC YOK

        Ogrenci.belgeYazdirStatic();
        // static : zaten var, oluşturulmaya ihtiyacı yok
        // yani nesnenin oluşturulmasına ihtiyaç yok
        // tipin adı ile direk kullanılabilir.
        // içinde NESNE ye ait değişkenler kullanılmayacak
        // ise ozaman hızlı ve pratik kullanım için
        // ve programları her yerinden direk çağırabilmek ,
        // için STATIC kelimesi eklenir.
        // Math.Max() gibi kulalnılacak tool lar için
        // static kullanılır. STATIC metodların içinden
        // ANCAK direk olarak STATİC metodları çağrılabilir.
        // Bir diğer kullanım amacı: TİPİ ilgilendiren
        // metodlar içinde STATİC Kullanılılabilir.

        BenimFonksiyonlarım.rndSayiVer(10);

    }

    public static void bilgiYazdir() {

    }
}

