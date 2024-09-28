package Tekrarlar;

public class _4_Aritmetic_Operators {
    public static void main(String[] args) {

//---------------------------TRUE/FALSE ÇIKTISI VEREN------------------------------------------------------------------
        int a=50;    int b=50;

        System.out.println("a>b =  " + (a>b)); // a b den büyük mü : false
        System.out.println("(a>=b) = " + (a>=b)); // a b den büyük veya eşit mi : true
        System.out.println("(a<b) = " + (a<b));  // a b den küçük mü : false
        System.out.println("(a<=b) = " + (a<=b)); // a b den küçük veya eşit mi: true
        System.out.println("(a==b) = " + (a==b)); // a b ye eşit mi: true
        System.out.println("(a!=b) = " + (a!=b)); // a b den farklı mı: false

//-------------------------------DEĞERİ ARTIRMA VEYA EKSİLTME---------------------------------------------------------------------
        a=5;  // a nın değeri 5
        a=a+6;     a+=6;   // a nın artış değeri 6, 6 artır:17
        a=a-5;     a-=5;  // a nın değerini 5 azalt
        a=a*5;     a*=5;   // a yı 5 ile çarp
        a=a/5;     a/=5;   // a yı 5 e böl

        int c=7;
        int d=6;
        c+=d;
        System.out.println("c = " + c);

//------------------------------DEĞERİ 1 AZALTMA VEYA ARTIRMA-----------------------------------------------------------------------
        int toplam=0;    int sayac=1;

        toplam=toplam+sayac; // toplam=1, sayac=1
        sayac=sayac+1;  //toplam=1 , sayac=2

        toplam=toplam+sayac++; // yukarıdaki 2 satırın dengi
        //sayacı toplama ekle, daha sonra yani işlemden sonra sayacı 1 artır

        /***************************************************************************************************/

        toplam=0;  sayac=1;
        sayac=sayac+1;  //toplam=0 , sayac=2
        toplam=toplam+sayac; //toplam=2 , sayac=2

        toplam=toplam+ ++sayac; //bu yukarıdaki 2 satırın dengi
        //işlemden önce sayacı artır, sonra işlemi yap

        // Özet
        //  ++ sonra ise, önce işlem, sonra artış
        //  ++ önce ise, önce artış,  sonra işlem

//-------------------------ARİTMETİK İŞLEMLER-----------------------------------------------------------------------------------------------------
        int a1=9;
        int b1=5;

        System.out.println("Toplama işlemi = " + (a1+b1)); //14
        System.out.println("Çıkarma işlemi = " + (a1-b1)); //4
        System.out.println("Çarpma işlemi = " + (a1*b1)); //45

        System.out.println("Bölme işlemi = " + (a1/b1)); // 1
        System.out.println("Bölme işlemi = " + ((double)a1/b1)); //1.8  //parantez içindeki sayılardan herhangi birinin önünde
                                                                        // double olacak ya da ilk girilen sayılardan biri double olacak o
                                                                        // şekilde double sonuç verir.

        // normal sonuc 1.8, fakat bilgisayar 2 si de tam sayı tipinde ise, küsüratı atar
        // bu sebeple sonuç 1 olur, yuvarlama yapmaz, int/int bölüm sonucu int olur
        // küsüratlı sonuç istiyorsan ,işleme girenlerden en az birisi double olmalı

       // int kalan=a1 % b1; // 4 ,     % işareti kalanı yani bölünemeyeni verir
       // System.out.println("kalan = " + kalan);

//-----------------------------------DEĞER ARTIRMA VE AZALTMA------------------------------------------------------------------------
        int say=0;

        say=say+1;   //sayacın değerini 1 artırır :1
        say++;         //sayacın değerini 1 artırır :2
        ++say;         //sayacın değerini bir artırır:3
        say=say-1;   //sayacın değerini 1 azaltır:2
        say--;         //sayacın değerini 1 azaltır:1
        --say;         //sayacın değerini 1 azaltır:0
    }
}
