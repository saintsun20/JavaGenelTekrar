package Tekrarlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class _18_Hash_Tree_LinkedHash_Sets {



        public static void main(String[] args) {

            HashSet<String> liste=new HashSet<>();
            liste.add("Bir");
            liste.add("İki");
            liste.add("üç");
            liste.add("Dört");
            LinkedHashSet<Integer> liste1=new LinkedHashSet<>();
            liste1.add(1);
            liste1.add(2);
            liste1.add(3);
            liste1.add(4);
            TreeSet<Integer> liste2=new TreeSet<>();
            liste2.add(1);
            liste2.add(2);
            liste2.add(3);
            liste2.add(4);

            LinkedHashSet<String> liste2_1=new LinkedHashSet<>();
            liste2_1.add("Bir");
            liste2_1.add("İki");
            liste2_1.add("üç");
            liste2_1.add("Dört");

            TreeSet<String> liste3= new TreeSet<>();
            liste3.add("Bir");
            liste3.add("İki");
            liste3.add("üç");
            liste3.add("Dört");
            liste3.add("Beş");
            liste3.add("altı");

            System.out.println("liste = " + liste);
            System.out.println("liste1 = " + liste1);
            System.out.println("liste2 = " + liste2);
            System.out.println("liste2_1 = " + liste2_1);
            System.out.println("liste3 = " + liste3);

            HashSet<String> birlestir=new HashSet<>();
            birlestir.addAll(liste);
            birlestir.addAll(liste3);
            System.out.println("birlestir = " + birlestir);

            TreeSet<String> farki=new TreeSet<>();
            farki.addAll(liste3);
            farki.removeAll(liste);
            System.out.println("farki = " + farki);

            LinkedHashSet<String> kesisim=new LinkedHashSet<>();
            kesisim.addAll(liste3);
            kesisim.retainAll(liste);
            System.out.println("kesisim = " + kesisim);

            liste.remove("Bir");
            System.out.println("liste = " + liste);

            liste.clear();
            System.out.println("liste = " + liste);

            if (liste3.contains("Beş"))
                System.out.println("Var");
            else
                System.out.println(" Yok ");

            for (String sayilar:liste3)
                System.out.println("sayilar = " + sayilar);

            Iterator sıradakiVarsaYaz= liste3.iterator();
            while (sıradakiVarsaYaz.hasNext())
                System.out.println("sıradakiVarsaYaz = " + sıradakiVarsaYaz.next());

        }
    }

