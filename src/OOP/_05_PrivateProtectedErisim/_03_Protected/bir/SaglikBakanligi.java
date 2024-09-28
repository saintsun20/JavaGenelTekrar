package Tekrarlar.OOP._05_PrivateProtectedErisim._03_Protected.bir;

public class SaglikBakanligi {
    public static void main(String[] args) {
        Doktor d1=new Doktor();
        d1.adi="Selcuk";
        d1.bolum="Cildiye";
        d1.hastaneAdi="Sakarya Devlet Hastanesi";
        Doktor d2=new Doktor("Mehmet");

    }
}
