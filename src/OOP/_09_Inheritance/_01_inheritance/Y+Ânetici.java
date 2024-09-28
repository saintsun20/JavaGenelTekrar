package Tekrarlar.OOP._09_Inheritance._01_inheritance;

public class Yönetici {
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String departmen;
    private int sicilNo;
    private String telefon;

    public void  bordroYazdir(){
        System.out.println("Bordro yazdırıldı");
    }

    public void zamYap(){
        System.out.println("Zam yapıldı");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Yönetici{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", departmen='" + departmen + '\'' +
                ", sicilNo=" + sicilNo +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
