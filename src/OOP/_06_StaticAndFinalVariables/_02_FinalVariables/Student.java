package Tekrarlar.OOP._06_StaticAndFinalVariables._02_FinalVariables;

public class Student {
   private final int id;
   //final değişkenlere, ya tanımladığında ya da
  // constructor da değer atanabilir / metodla atanamaz
  // ve sonra değiştirilemez
    String adSoyad;

    private static int sayac=1;

    public Student(String adSoyad) {
        this.adSoyad = adSoyad;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", adSoyad='" + adSoyad + '\'' +
                '}';
    }
    void kimlikYaz(){

       //  this.id=8; final değişkenlere sonradan değer atanamaz
    }
}
