package Tekrarlar;

import java.util.Scanner;

public class _6_İf_Else {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı 1 giriniz : ");    int sayi1=oku.nextInt();
        System.out.print("Sayı 2 giriniz : ");    int sayi2=oku.nextInt();

        System.out.println("Yapmak istediğiniz işlemi giriniz :  (Çarpma için P, Bölme için B, Toplama için T , Çıkarma için Ç)");
        String islem=oku.next().toUpperCase();


        int Toplam=sayi1+sayi2;
        int cıkarma=sayi1-sayi2;
        int Bolme=sayi1/sayi2;
        int carpma=sayi1*sayi2;

        if (islem.equals("T"))
            System.out.println("Sonuç : " + Toplam);

        else if (islem.equals("P") )
            System.out.println("Sonuç : " + carpma);

        else if (islem.equals("Ç"))
            System.out.println("Sonuç : " + cıkarma );
        else if (islem.equals("B"))
            System.out.println("Sonuç : " + Bolme );
    }
}
