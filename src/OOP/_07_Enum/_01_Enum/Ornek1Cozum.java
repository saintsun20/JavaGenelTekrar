package Tekrarlar.OOP._07_Enum._01_Enum;
// Enumarator : Önde sembolik SIMGE, arkada numara
enum Aylar{
    Tanimsiz,OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,TEMMUZ,AGUSTOS,EYLUL,EKIM, KASIM, ARALIK
}   //Tanimsiz:0, Ocak:1

public class Ornek1Cozum {
    public static void main(String[] args) {
        Aylar ay = Aylar.HAZIRAN; //mayıs

        switch (ay) {
            case SUBAT:     System.out.println(28);   break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:   System.out.println(31);     break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL:    System.out.println(30);     break;
        }
        if (ay == Aylar.HAZIRAN)
        {
            System.out.println("Zam yap");
        }
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a:Aylar.values())
            System.out.println("a.ordinal() = " + a.ordinal());
    }
}