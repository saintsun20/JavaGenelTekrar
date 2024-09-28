package Tekrarlar.OOP._08_Encapsulation._01_Encapsulation;

public class Kisi {
    String ad;
    String soyad;
   private int yas;

   public void yasAta(int yas){
       if (yas>0 && yas<150)
           this.yas=yas;
       else
           System.out.println("Hatalı yaş");
   }
   public int yasVer(){
       return this.yas;
   }
}
