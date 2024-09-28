package Tekrarlar.OOP._08_Encapsulation._02_Soru;
public class Araba {

    private String renk;
    private int uretimYili;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba(String renk,int uretimYili, int kapiSayisi, double motorHacmi){
     //  this.renk=renk;
     //  this.uretimYili=uretimYili;
     //   this.kapiSayisi=kapiSayisi;
     //  this.motorHacmi=motorHacmi;
        setRenk(renk);
        setUretimYili(uretimYili);
        setKapiSayisi(kapiSayisi);
        setMotorHacmi(motorHacmi);
    }

    public Araba() {

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<=7)
        this.kapiSayisi = kapiSayisi;
        else
            System.out.println("Hatalı kapı sayısı");

    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", uretimYili=" + uretimYili +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

}
