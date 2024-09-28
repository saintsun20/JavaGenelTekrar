package Tekrarlar.OOP._06_StaticAndFinalVariables._01_StaticVariables._02_Ornek;

public class School {
    public static void main(String[] args) {
        Student std1=new Student(1,"İsmet Temur");
        Student std2=new Student(1,"Ahmet Yılmaz");
        Student std3=new Student(1,"Mehmet Kaya");
        Student std4=new Student(1,"Çilem YILDIZ");

        //Öyle bir şey olsunki id ler sıralı ve eşsiz gitsin

        Student std11=new Student("İsmet Temur");
        Student std12=new Student("Ahmet Yılmaz");
        Student std13=new Student("Mehmet Kaya");
        Student std14=new Student("Çilem YILDIZ");
        //new dendiğinde bütün this li değişkenler başlangıç haline döner

        System.out.println("std11 = " + std11);
        System.out.println("std12 = " + std12);
        System.out.println("std13 = " + std13);
        System.out.println("std14 = " + std14);

    }
}
