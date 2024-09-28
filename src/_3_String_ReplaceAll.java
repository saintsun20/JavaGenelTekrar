package Tekrarlar;

public class _3_String_ReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll: replace gibi çalışır, farkı kriter(regex) verilebiliyor
        //regex: regular expression / düzenli ifadeler

        String s1 = "Merhaba12 Dünya23";


        System.out.println("s1 = " + s1);
        System.out.println("s1. a, b, n -- sil ) = " + s1.replaceAll("[abn]", "_"));
        System.out.println("s1.1,2,3 -- sil ) = " + s1.replaceAll("[123]", ""));
        System.out.println("s1.rakamları sil) = " + s1.replaceAll("[0-9]", ""));
        System.out.println("s1.rakamların dışındakileri sil) = " + s1.replaceAll("[^0-9]", ""));
        System.out.println("s1.a-z aralığını sil) = " + s1.replaceAll("[a-z]", ""));
        System.out.println("s1.A-Z aralığını sil) = " + s1.replaceAll("[A-Z]", ""));
        System.out.println("s1.rakamları ve küçük harfleri sil) = " + s1.replaceAll("[0-9]", "").replaceAll("[a-z]", ""));

    }
}
