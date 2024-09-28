package Tekrarlar.OOP._06_StaticAndFinalVariables._02_FinalVariables;

public class School {
    public static void main(String[] args) {

        Student s1 = new Student("İsmet Temur");
        Student s2 = new Student("Mehmet Demir");
        Student s3 = new Student("Ayşe Yıldız");
        Student s4 = new Student("Zeynep Yılmaz");

        System.out.println("s4 = " + s4);
        System.out.println("s3 = " + s3);

        //Student.sayac=25;

        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1);

        //s1.id=6;
        //Math.PI public static final double

    }
}
