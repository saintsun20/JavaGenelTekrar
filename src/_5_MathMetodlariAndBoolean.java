package Tekrarlar;

import java.util.Scanner;

public class _5_MathMetodlariAndBoolean {
    public static void main(String[] args) {
        int a=12;
        int b=4;

        //2 değer için geçerli
        System.out.println("a ve b den büyük olanı ver = " + Math.max(a,b));
        System.out.println("a ve b den büyük olanı ver = " + Math.min(a,b));
        System.out.println("2 nin 3. kuvveti = " + Math.pow(2,3)); //8
        System.out.println("b nin karekökü = " + Math.sqrt(b));   //2
        System.out.println("round yuvarlama 3.1 = " + Math.round(3.1)); // 3
        System.out.println("round yuvarlama 3.4 = " + Math.round(3.4)); //3 --- 5 e kadar olan alta yuvarlanır
        System.out.println("round yuvarlama 3.5 = " + Math.round(3.5)); //4 -- 5 ve üstü yukarı yuvarlanır

        System.out.println("ceil yuvarlama 3.1 = " + Math.ceil(3.1)); //4 bu rakamdan büyük en yakın tam sayıya yuvarlar
        System.out.println("ceil yuvarlama 3.5 = " + Math.ceil(3.5)); //4 bu rakamdan buyük en yakın tam sayıya yuvarlar

        System.out.println("floor yuvarlama 3.1 = " + Math.floor(3.1)); //3 bu rakamdan küçük en yakın tam sayı
        System.out.println("floor yuvarlama 3.5 = " + Math.floor(3.5)); //3 bu rakamdan küçük en yakın tam sayıya yuvarlar

//-----------------------------------------------------------------------------------------------------------------------------------------

        //Sadece 2 değeri vardır, true veya false olabilir, bu tip değerler
        // saklamak için kullanılır.

        boolean DevamMi = true; // true, false
        int sayi1;

        System.out.println("DevamMi = " + DevamMi);
        Scanner oku = new Scanner(System.in);
        System.out.print("Seçiminizi Giriniz (1-12) = ");
        int secim = oku.nextInt();
        switch (secim)
        {
            case 1:
                System.out.print("Ocak");
                break;
            case 2:
                System.out.print("Şubat");
                break;
        }

}
// Değişken tipi olarak: int, double, char,String ve boolean kullanılacak


}
