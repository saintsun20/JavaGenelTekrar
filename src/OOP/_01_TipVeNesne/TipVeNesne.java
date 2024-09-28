package Tekrarlar.OOP._01_TipVeNesne;

public class TipVeNesne {
    public static void main(String[] args) {


        Araba sabaninArabasi=new Araba();
        sabaninArabasi.marka="Mercedes";
        sabaninArabasi.renk="Kırmızı";
        sabaninArabasi.yılı=2025;
        sabaninArabasi.motorHacmi=1.5;

        System.out.println("sabaninArabasi.motorHacmi = " + sabaninArabasi.motorHacmi);
        System.out.println("sabaninArabasi.renk = " + sabaninArabasi.renk);
        System.out.println("sabaninArabasi.yılı = " + sabaninArabasi.yılı);
        System.out.println("sabaninArabasi.marka = " + sabaninArabasi.marka);


    }
}
