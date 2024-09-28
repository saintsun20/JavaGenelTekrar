package Tekrarlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _17_ArrayListAnd2D {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Collections.fill(sayilar,5);
        System.out.println("sayilar = " + sayilar);

        Collections.min(sayilar);
        System.out.println("sayilar = " + sayilar);

        Collections.max(sayilar);
        System.out.println("sayilar = " + sayilar);

        Collections.addAll(sayilar,3,5,6,22);
        System.out.println("sayilar = " + sayilar);

        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        Collections.replaceAll(sayilar,3,9);
        System.out.println("sayilar = " + sayilar);

        Integer[] dizi={8,67,34,67};
        ArrayList<Integer> sayilar1=new ArrayList<>(Arrays.asList(dizi));
        System.out.println("sayilar1 = " + sayilar1);

        ArrayList<Integer>sayilar2=new ArrayList<>(Arrays.asList(11,22));
        ArrayList<String> kelime=new ArrayList<>(Arrays.asList("Ev","Yağmur","Deniz"));
        System.out.println("kelime = " + kelime);
        System.out.println("sayilar2 = " + sayilar2);

        //--------------------------------------- 2D ARRAYS --------------------------------------------------------
        ArrayList<ArrayList<Integer>> list2D=new ArrayList<>();
        list2D.add(sayilar1);
        list2D.add(sayilar2);
        System.out.println("list2D = " + list2D);
        System.out.println("list2D.get(0).size() = " + list2D.get(0).size());
        System.out.println("uzunluk= "+list2D.size());
  }
}
