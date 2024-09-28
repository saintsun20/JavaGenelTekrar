package Tekrarlar;

import java.util.Scanner;

public class _8_JavaTernary {
    public static void main(String[] args) {

      //if- else kısa yöntem--TERNARY------------------------------------------------------------------------
        int sayi=35;
        String sonuc=sayi%2==0 ? "Çift" : "Tek" ;
        // ?-->if    :---->değilse anlamına gelir
        System.out.println("sonuc = " + sonuc);
//-----------------------TERNARY İLE DIŞARIDAN ALINAN SAYI İLE İLGİLİ İŞLEM YAPMA----------------------------
        Scanner oku=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=oku.nextInt();

        String sonuc1=sayi>50 ? "Büyük" : "Değil";
        System.out.println("sonuc = " + sonuc);
    }
}
