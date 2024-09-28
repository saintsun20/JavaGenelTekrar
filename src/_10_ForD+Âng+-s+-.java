package Tekrarlar;

import java.util.Arrays;
import java.util.Scanner;

public class _10_ForDöngüsü {
    public static void main(String[] args) {
//------------------------------tek for ile 2 ler çarpım tablosu --------------------------------------------------------------------
        System.out.println("2 ler Çarpım Tablosu");
        for (int i = 1; i < 11; i++) {
            System.out.println(("2 x "+ i) + " = " + (2*i));
        }
//------------------------------iki for ile 1-5 ler arası çarpım tablosu------------------------------------------------------------
        for (int i = 1; i < 6; i++) //for içinde tek satır olacaksa süslü paranteze gerek yok
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+ "x" + j +"= " + (i * j));
            }
//-------------------------------For ile kullanıcıdan sayı alıp dizilere ekleme-------------------------------------------------------        
        Scanner oku=new Scanner(System.in);
        String[] dizi=new String[5];
        for (int i = 0; i < dizi.length; i++) { // dizi.length dizinin uzunluğu kadar demektir.
            System.out.print("Dizinin "+(i+1)+". elemanını giriniz: ");   dizi[i]=oku.nextLine();
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        
    }
}
