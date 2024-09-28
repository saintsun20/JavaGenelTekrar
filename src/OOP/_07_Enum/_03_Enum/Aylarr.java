package Tekrarlar.OOP._07_Enum._03_Enum;

public enum Aylarr {
    OCAK(1,31,"Ocak"),
    ŞUBAT(2,28,"Şubat"),
    MART(3,31,"Mart"),
    NİSAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZİRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    AGUSTOS(8,31,"Ağustos"),
    EYLUL(9,30,"Eylül"),
    EKIM(10,31,"Ekim"),
    KASIM(11,30,"Kasım"),
    ARALIK(12,31,"Aralık");

    int ayNum;
    int günSay;
    String ayİsim;

    Aylarr(int ayNum, int günSay, String ayİsim) {
        this.ayİsim=ayİsim;
        this.ayNum=ayNum;
        this.günSay=günSay;
    }
}
