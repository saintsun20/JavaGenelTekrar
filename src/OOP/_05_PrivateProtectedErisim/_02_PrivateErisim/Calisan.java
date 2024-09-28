package Tekrarlar.OOP._05_PrivateProtectedErisim._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surname;
    private String sifre;


    public void sifreAta(String sifre)  //şifreyi private yaptık sadece ilk atanır veya metod ile atanır.
    {
        if (sifre.length()>=8)
            this.sifre=sifre;
        else
            System.out.println("Zayıf şifre");
    }


    public void sifreGoster()
    {
        System.out.println(this.sifre);
    }
}
