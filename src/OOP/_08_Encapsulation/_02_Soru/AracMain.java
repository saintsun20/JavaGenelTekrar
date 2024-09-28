package Tekrarlar.OOP._08_Encapsulation._02_Soru;

public class AracMain {
    public static void main(String[] args) {

        Araba a1 = new Araba();
        a1.setRenk("Kırmızı");
        a1.setKapiSayisi(9);
        a1.setMotorHacmi(1900);
        a1.setUretimYili(2000);

        System.out.println(a1);

        Araba a2=new Araba("Siyah",2024,12,1900);
        System.out.println(a2);

    }
}
