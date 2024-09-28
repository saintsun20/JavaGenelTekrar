package Tekrarlar.OOP._09_Inheritance._02_inheritance;

public class Ordek extends Hayvan{
    private int kanatUzunluğu;

    public int getKanatUzunluğu() {
        return kanatUzunluğu;
    }

    public void setKanatUzunluğu(int kanatUzunluğu) {
        this.kanatUzunluğu = kanatUzunluğu;
    }

    public Ordek(String renk, double kilo, int no, int yas, int kanatUzunluğu) {
        super(renk, kilo, no, yas);
        setKanatUzunluğu(kanatUzunluğu);

    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("VakVakVak");
    }

    @Override
    public String toString() {
        return super.toString()+"kanatuzunluğu: "+this.kanatUzunluğu;
    }
}
