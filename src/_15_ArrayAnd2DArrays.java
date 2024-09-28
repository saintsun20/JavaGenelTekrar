package Tekrarlar;

import java.util.Arrays;

public class _15_ArrayAnd2DArrays {
    public static void main(String[] args) {

        int[] dizi=new int[5];   // tek boyutlu dizi
        dizi[0]=1;
        dizi[1]=7;
        dizi[2]=5;
        dizi[3]=88;
        dizi[4]=43;

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi)); // diziyi direk yazdırma

         //diziyi sıralar
        Arrays.sort(dizi);
        System.out.println("Arrays.toString(dizi = " + Arrays.toString(dizi));

        //elemanları tek bir rakam ile doldurmak
        Arrays.fill(dizi,4);
        System.out.println(Arrays.toString(dizi));;


        int[][] dizi2D=new int[2][4]; // iki boyutlu dizi
        dizi2D[0][0]=1;           dizi2D[1][0]=1;       //dizi2D[2][0]=11;
        dizi2D[0][1]=2;           dizi2D[1][1]=5;    //   dizi2D[2][1]=81;
        dizi2D[0][2]=31;          dizi2D[1][2]=6;   //    dizi2D[2][2]=66;
        dizi2D[0][3]=41;          dizi2D[1][3]=8;   //    dizi2D[2][3]=22;

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
        }

        System.out.print("dizi = " + Arrays.toString(dizi));
        for (int i = 0; i < dizi2D.length; i++) {
            System.out.print("{");
            for (int j = 0; j < dizi2D[i].length; j++) {
                System.out.print(dizi2D[i][j] +",");
            }
            System.out.println("}");
        }



    }
}
