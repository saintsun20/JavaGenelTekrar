package Tekrarlar;

public class _1_Escape_Characters {
    public static void main(String[] args) {
         /*


        \n  : alt satıra geç
        \t  : tab tuşuna basma etkisi, 2-3 karakterli boşluk açar
        \b  : backspace tuşuna basma etkisi, yani 1 karakter geri siler
        \"  : çift tırnak " yazdırmak için kullanılır
        \\  : slaç yani \ yazmak için kullanılır
        \r  : bulunduğu satırın başına gider


         */
                                     //-----------ekrana verdiği çıktı---------------
        System.out.println("MerhabaDünya");    // MerhabaDünya
        System.out.println("Merhaba\nDünya");  // Merhaba alt satıra geçer Dünya yazar
        System.out.println("Merhaba\tDünya");  //Merhaba   Dünya
        System.out.println("Merhaba\bDünya"); //MerhabDünya
        System.out.println("Merhaba\"Dünya\""); //Merhaba "Dünya"
        System.out.println("Merhaba\\Dünya");  //Merhaba\Dünya
        System.out.println("Merhaba\rDünya");   //Dünya


            }
        }


