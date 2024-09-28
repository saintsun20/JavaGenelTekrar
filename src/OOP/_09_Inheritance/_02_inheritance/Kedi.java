package Tekrarlar.OOP._09_Inheritance._02_inheritance;

public class Kedi extends Hayvan {

    public Kedi(String renk, double kilo, int no, int yas) {
        super(renk, kilo, no, yas);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("miyavladı");
    }
}
