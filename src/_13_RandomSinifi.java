package Tekrarlar;

import java.util.Arrays;
import java.util.Random;

public class _13_RandomSinifi {
    public static void main(String[] args) {

        // rastgele sayı üretmek için metod çağırmadır.---------------------------------------------------------------------
        Random rastgelesayi=new Random();
        int sayi1= rastgelesayi.nextInt();   System.out.println("sayi1 = " + sayi1);
        int sayi2= rastgelesayi.nextInt();   System.out.println("sayi2 = " + sayi2);

        // iki randomdaki sayıların aynı değeri getirmesi.------------------------------------------------------------------
        Random rastgeleEşitle=new Random(8);
        Random rastgeleEşitle1=new Random(8);

        int rastgeleEşit=rastgeleEşitle.nextInt();     System.out.println("rastgeleEşit = " + rastgeleEşit);
        int rastgeleEşit1=rastgeleEşitle1.nextInt();   System.out.println("rastgeleEşit1 = " + rastgeleEşit1);

        // 0-9 arasında rastgele sayı üretir.----------------------------------------------------------------------------------
        int rastgele=(int)(Math.random()*10);
        System.out.println(rastgele);

        // random dizi oluşturma--------------------------------------------------------------------------------------------------
        int[] rastgeleDizi=new int[5];
        for (int i = 0; i < rastgeleDizi.length; i++) {
          rastgeleDizi[i]=(int)((Math.random()*10)+1);    // 1-10 arasında sayı üretir.
        }
        System.out.println(Arrays.toString(rastgeleDizi));

        // random ASCİİ değerleri atama
        Random rastgeleAscii=new Random();
        char[] Asciikarakter=new char[256];

        for (int i = 0; i <Asciikarakter.length ; i++) {
            Asciikarakter[i] = (char) ((char) rastgeleAscii.nextInt(256) + 0);
        }
        System.out.println("Asciikarakter = " + Arrays.toString(Asciikarakter));
    }
}
