package Tekrarlar.OOP._10_ProtectedAndFinal._02_Final.classFinal;

public class ParkMain {
    public static void main(String[] args) {
        Tasıtlar t1=new Tasıtlar();
        Tasıtlar t2=new Tasıtlar();
        t1.agirlik=200;
        t2.agirlik=150;

        //kullanım kısmında bir sınırlama yok
        //class final olursa eger mainde birden
        // fazla cağırabiliyor fakat baska class a extend edilemez
    }
}
