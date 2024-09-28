package Tekrarlar.OOP._09_Inheritance._02_inheritance;

public class Kopek extends Hayvan{
    public Kopek(String renk, double kilo, int no, int yas) {
        super(renk, kilo, no, yas);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Havladı");
    }
}
