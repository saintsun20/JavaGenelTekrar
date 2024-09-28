package Tekrarlar;

import java.util.Scanner;

public class _14_Metodlar {
    public static void main(String[] args) {
// main içinde işlem yapma --------------------------------------------------------------------------------------------
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayi = ");
        int sayi = oku.nextInt();
        if (sayi % 2 == 0)
            System.out.println("Çift sayı");
        else
            System.out.println("Tek sayı");
//-----------------------------------------------------------------------------------------------------------------------------------

        tekMiCiftMiOkuYaz();
        toplamyaz(3,5);


    }
// ------------------- Metod ile aynı işlemi yapma -----------------------------------------------------------------------------
public static void tekMiCiftMiOkuYaz() {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayi = ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("Çift sayı");
        else
            System.out.println("Tek sayı");
    }
//------------------------int döndüren metod ---------------------------------------------------------------------------------------
    public static int toplamyaz(int sayi, int sayi1){  //String,int , Array, ArrayList, Set, Map ne döndürüyorsa o yazılır.
       int toplam= sayi+sayi1;
        System.out.println("toplam = " + toplam);
    return toplam;}
}
