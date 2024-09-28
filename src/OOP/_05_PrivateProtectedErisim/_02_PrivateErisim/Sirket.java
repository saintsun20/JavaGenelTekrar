package Tekrarlar.OOP._05_PrivateProtectedErisim._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="İsmet";
        cal1.surname="Temur";
      //  cal1.sifre="1234";  // böyle direk erişip istediği şifreyi atayamaması lazım.

        cal1.sifreAta("1,2,3,4");
        cal1.sifreAta("kuvvetli.Sifre1");

        cal1.sifreGoster();
    }
}
