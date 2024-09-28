package Tekrarlar;

import java.util.Arrays;

public class _16_ArrayDiziDonusumleri {
    public static void main(String[] args) {

        // int'i veya int dizisini Stringe dönüştürme------------------------------------------------------------------------------
        int[] rastgeleDizi={1,2,3,4};
        String dönüşmüş= Arrays.toString(rastgeleDizi);
        System.out.println("dönüşmüş = " + dönüşmüş);

        // String'i int e dönüştürme----------------------------------------------------------------------------------------------
        String yazi=" 12";
        int yaziDönüsmüs= Integer.parseInt(yazi.trim()); //trim boşlukları kaldırır -------
        System.out.println("yaziDönümüş = " + yaziDönüsmüs);

        //String dizisini int dizisine dönüştürme-----------------------------------------------------------------------------
        String[] yeniStr={"3","5","7","9"};
        int[] yeniDizi=new int[yeniStr.length];
        for (int i = 0; i < yeniStr.length; i++) {
            yeniDizi[i]=Integer.parseInt(yeniStr[i]);
        }
        System.out.println("yeniDizi = " + Arrays.toString(yeniDizi));

        //int dizisini String dizisine dönüştürme-----------------------------------------------------------------------------------
        String yeniStr2=Arrays.toString(yeniDizi);
        System.out.println("yeniStr2 = " + yeniStr2);
        String[] yeniStr2Dizi=yeniStr2.split(",");
        System.out.println("yeniStr2Dizi = " + Arrays.toString(yeniStr2Dizi));
        System.out.println("yeniStr2Dizi.[1] = " + yeniStr2Dizi[1]);
    }
}
