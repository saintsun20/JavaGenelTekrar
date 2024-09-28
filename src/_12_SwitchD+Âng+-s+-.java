package Tekrarlar;

import java.util.Scanner;

public class _12_SwitchDöngüsü {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayı 1 giriniz : ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayı 2 giriniz : ");
        int sayi2 = oku.nextInt();

        System.out.println("Yapmak istediğiniz işlemi giriniz :  (Çarpma için P, Bölme için B, Toplama için T , Çıkarma için Ç)");
        String islem = oku.next().toUpperCase();


        switch (islem) {
            case "T":
                System.out.println("Toplam = " + (sayi1 + sayi2));
                break;
            case "Ç":
                System.out.println("Çıkarma = " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("Çarpma = " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("Bölme = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
