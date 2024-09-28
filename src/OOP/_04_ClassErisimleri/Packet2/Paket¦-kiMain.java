package Tekrarlar.OOP._04_ClassErisimleri.Packet2;


import Tekrarlar.OOP._04_ClassErisimleri.Packet1.PublicErisim;

public class PaketİkiMain {
    public static void main(String[] args) {
       PublicErisim pe=new PublicErisim();
             //  DefaultErisim de=new DefaultErisim(); default olduğundan erişemedi.
      //  diğer paketlerden default belirtecli class a erişilemez. yalnızca kendi paketindekiler erişebilir.
    }
}
