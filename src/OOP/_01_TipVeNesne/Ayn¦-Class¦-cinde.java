package Tekrarlar.OOP._01_TipVeNesne;

public class AynıClassİcinde {
    public static void main(String[] args) {

        Okul ogr1 =new Okul();
        ogr1.adi="Selçuk";
        ogr1.soyaid="Aydın";
        ogr1.sinifi="Java";
        ogr1.okulNo=1;
        ogr1.adres="Sakarya";

        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyaid = " + ogr1.soyaid);
        System.out.println("ogr1.adres = " + ogr1.adres);
        System.out.println("ogr1.sinifi = " + ogr1.sinifi);
        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
    }
}
class Okul{
    int okulNo;
    String adi;
    String soyaid;
    String sinifi;
    String adres;
}
