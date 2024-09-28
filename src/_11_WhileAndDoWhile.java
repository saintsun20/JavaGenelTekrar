package Tekrarlar;

public class _11_WhileAndDoWhile {
    public static void main(String[] args) {
        int sayi = 1;
        int sayi1 = 3;
        int toplam = sayi + sayi1;
        boolean dogruMu = true;

//------------------------------------------------WHİLE------------------------------------------------------------------------
        // Bu döngü önce şartı kontrol eder şart uyuyorsa döngüye girer uymazsa hiç girmeden döngü altına geçer
        while (dogruMu) // sadece boolean ismi yazıyorsa ilk verilen değer geçerlidir.
            if (toplam == 4) {
                dogruMu = true;
                System.out.println("dogruMu = " + dogruMu);
                break;  // break yazmazsak döngü true olduğu sürece ekrana sürekli yazar
            }                                                        // sonsuza kadar döngü devam eder, break ile birkez yazınca döngüden çıkar.
            else {
                dogruMu = false;
                System.out.println("dogruMu = " + dogruMu);
                break;
            }

//-------------------------------------------------DO WHİLE-----------------------------------------------------------------------
        // Bu döngüde hiçbir şeye bakmaz direk döngü içine girer ve işlemleri yapar en son döngü şartını kontrol eder.

        do {
            if (toplam == 4) {
                dogruMu = true;
                System.out.println("dogruMu = " + dogruMu);
                break;  // break yazmazsak döngü true olduğu sürece ekrana sürekli yazar
            }                                                        // sonsuza kadar döngü devam eder, break ile birkez yazınca döngüden çıkar.
            else {
                dogruMu = false;
                System.out.println("dogruMu = " + dogruMu);
                break;
            }

        }while (dogruMu);
    }
}
