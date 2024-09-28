package Tekrarlar.OOP._09_Inheritance._02_inheritance;

public class Hayvan {
    String renk;
    double kilo;
    int no;
    int yas;

    public Hayvan(String renk, double kilo, int no, int yas) {
        setRenk(renk);
        setKilo(kilo);
        setNo(no);
        setYas(yas);
    }

    public void konustu(){
        System.out.println("Ses çıkardı");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;

    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", no=" + no +
                ", yas=" + yas +
                '}';
    }
}
