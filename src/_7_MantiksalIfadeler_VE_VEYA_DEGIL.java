package Tekrarlar;

import java.util.Scanner;

public class _7_MantiksalIfadeler_VE_VEYA_DEGIL {
    public static void main(String[] args) {

    //Mantıksal ifadeler
    // ve &&
    // veya ||
    // değil !

    // soru: girilen bir sayı 0 dan büykü ve 100 den küçük eşit ise geçerli not, değil ise geçerli olmayan not

    Scanner oku=new Scanner(System.in);

        System.out.print("Öğrenci Notu :  ");
    int ogrNot=oku.nextInt();

        if (ogrNot>=0 && ogrNot<=100 ) // true veya false, sonuc TRUE ise if çalışır
            System.out.println("Geçerli not");

    //  1.yol
        if (ogrNot<0 || ogrNot>100)
            System.out.println("Geçerli not değil");
    //2. yol
        if (!(ogrNot>=0 && ogrNot<=100))
            System.out.println("Geçerli not değil");
    }
  }
