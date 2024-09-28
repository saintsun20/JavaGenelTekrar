package Tekrarlar.OOP._09_Inheritance._02_inheritance;

public class HayvanatBahcesiMain {
    public static void main(String[] args) {
        Kedi k1=new Kedi("Siyah",3.3,4,2);
        k1.konustu();
        Kopek ko1=new Kopek("Beyaz",12,2,5);
        ko1.konustu();
        Ordek o1=new Ordek("Sarı",2.4,1,7,3);
        o1.konustu();
        System.out.println(o1);
        Yılan y1=new Yılan("Sarı",1.0,3,2,"Zehirsiz");
        y1.konustu();
        System.out.println(y1);

    }
}
