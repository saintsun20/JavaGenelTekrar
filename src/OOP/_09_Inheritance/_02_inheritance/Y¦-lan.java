package Tekrarlar.OOP._09_Inheritance._02_inheritance;

public class Yılan extends Hayvan{
    private String zehirTipi;

    public String getZehirTipi() {
        return zehirTipi;
    }

    public void setZehirTipi(String zehirTipi) {
        this.zehirTipi = zehirTipi;
    }


    public Yılan(String renk, double kilo, int no, int yas, String zehirtipi) {
        super(renk, kilo, no, yas);
        setZehirTipi(zehirtipi);

    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("tsssss");
    }

    @Override
    public String toString() {
        return super.toString()+"zehirtipi: "+zehirTipi;
    }
}
