package Tekrarlar.OOP._10_ProtectedAndFinal._01_Protected.Paket1;

public class P1Hayvan {
    public String ad;            // her yerden
    int yas;                    //sadece kendi paketinden
    protected String cinsi;    //kendi paketinden + extend edilen diğer paketlerin içinden
    private String renk;      //sadece kendi class ın içinden
}
