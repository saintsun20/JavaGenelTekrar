package Tekrarlar;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _19_Hash_Tree_LinkedHash_Maps {
    public static void main(String[] args) {

        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMAp
        // Map -> Anahtar + Set -> Anahtarlı Set
        // Anahtar + Değer -> Key + Value
        // anahtarın ve valuenin tipini biz vereceğiz

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001, "İsmet Temur");
        hm.put(2001,"Engin");
        hm.put(2,"Ummuhan");
        hm.put(1003,"Merve");
        hm.put(1001,"Kübranur");  // Aynı key e put yaptığınızda değeri günceller öncekini dikkate almaz

        System.out.println("hm = " + hm);

        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(1003) = " + hm.get(1003));

        System.out.println("hm.containsValue(\"Engin\") = " + hm.containsValue("Engin"));
        System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));

        System.out.println("hm.keySet() = " + hm.keySet()); // keyleri verir
        System.out.println("hm = " + hm.values());       // değerleri verir

        hm.remove(2001);
        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);

 //--------------------------------------------------------------------------------------------------------------------------------------
        HashMap<Integer,String> hm1=new HashMap<>();

        hm1.put(1001,"Ummuhan");
        hm1.put(1002,"Yusuf");
        hm1.put(2001,"Şaban");
        hm1.put(5001,"Polat");
        hm1.put(1002,"Halil");

        System.out.println("hm1.keySet() = " + hm1.keySet());
        System.out.println("hm1.values() = " + hm1.values());

        System.out.println();

        System.out.println("keyler");
        for (Integer k :hm1.keySet())
            System.out.println("k = " + k);

        System.out.println("value ler");
        for (String v : hm1.values())
            System.out.println("v = " + v);

        System.out.println("key ve value birlikte ");  // Birinci yöntem birlikte yazdırmak için
        for (Map.Entry<Integer,String> kv: hm1.entrySet()) {
            System.out.println(kv);
        }

        System.out.println("key ve value birlikte 2 ");  // 2. yöntem birlikte yazdırmak için
        for (Map.Entry<Integer,String> kv1: hm1.entrySet())
            System.out.println(kv1.getKey()+" "+kv1.getValue());
        System.out.print(hm1.keySet()+" "+hm1.values());  // böyle yazınca key ile value karşısına yazmıyor test amaçlı yazdırdım

//--------------------------------------------------------------------------------------------------------------------------------------------

        //Bir kartvizit uygulamasını 2 kişi için yapınız
        // isim, e mail, telefon , adres

        TreeMap<String, String> yusufKartvizit=new TreeMap<>();

        yusufKartvizit.put("isim", "Yusuf Ucucu");
        yusufKartvizit.put("email","yusuf@gmail.com");
        yusufKartvizit.put("telefon","0 5421222111");
        yusufKartvizit.put("adres", "Çekmeköy");

        System.out.println("yusufKartvizit.get(\"isim\") = " + yusufKartvizit.get("isim"));
        System.out.println("yusufKartvizit.get(\"email\") = " + yusufKartvizit.get("email"));

        TreeMap<String, String> ummuhanKartvizit=new TreeMap<>();

        ummuhanKartvizit.put("isim", "ummuhan teke");
        ummuhanKartvizit.put("email","ummuhan@gmail.com");
        ummuhanKartvizit.put("telefon","05421222155");
        ummuhanKartvizit.put("adres", "Üsküdar");

        System.out.println("Kartvizit.get(\"isim\") = " + ummuhanKartvizit.get("isim"));
        System.out.println("Kartvizit.get(\"email\") = " + ummuhanKartvizit.get("email"));


        //--------------iki map birleştirme - ----------------------------------------
        TreeMap<String,TreeMap<String,String>> kartvizitler=new TreeMap<>();

        kartvizitler.put("Yusuf",yusufKartvizit);
        kartvizitler.put("Ummuhan",ummuhanKartvizit);

        System.out.println("Yusufun e maili: " + kartvizitler.get("Yusuf").get("email"));
        System.out.println("Ummuhan teli: " + kartvizitler.get("Ummuhan").get("telefon"));
    }
}
