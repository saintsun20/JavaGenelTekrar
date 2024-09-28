package Tekrarlar;

public class _2_String_Methodlar {
    public static void main(String[] args) {
    
        String kelime="Hello";
        String kelime1="World";
        String kelime3="";


        System.out.println("birleştir = " + kelime.concat(" ").concat(kelime1)); // kelime birleştirme yapar
        System.out.println("Büyük harf = " + kelime.toUpperCase());   // Tüm harfleri büyük yazar
        System.out.println("Küçük harf = " + kelime.toLowerCase()); // tüm harfleri küçük yazar
        System.out.println("Eşit mi = " + kelime.equals(kelime1));  // iki kelimeyi karşılaştırır, büyük veya küçük ayırt eder
        System.out.println("Eşit mi = " + kelime.equalsIgnoreCase(kelime1));  // iki kelimenin eşitliğine bakar, büyük veya küçük olmasını önemsemez
        System.out.println("Uzunluğu = " + kelime.length());  // Kelimenin kaç harften oluştuğunu verir
        System.out.println("kelime1 = " + kelime1.substring(3,5)); // verilen indexlerin arasındaki harfleri verir
        System.out.println("Başlangıç karakter sorma = " + kelime1.startsWith("W")); // Girilen harf ile başlayıp başlamadığını true/false olarak söyler
        System.out.println("Biten karakter sorma = " + kelime1.endsWith("y"));   // Girilen harf ile bitip bitmediğini true/false ile söyler
        System.out.println("içinde var mı = " + kelime1.contains("o")); // Stringde girilen harfin olup olmadığını true/false olarak söyler
        System.out.println("Boş mu = " + kelime1.isEmpty());  // stringin boş olup olmadığını true/false ile söyler
        System.out.println("Baş ve sondaki gereksiz boşlukları siler = " + kelime1.trim()); // sadece en baş ve en sondaki boşlukları siler
        System.out.println("istenilen karakteri değiştirme = " + kelime.replace("H","Y"));
        System.out.println("ilk karakteri değiştirme = " + kelime.replaceFirst("H","Y"));
        System.out.println("İndexteki char = " + kelime1.charAt(1));  // girilen indexte bulunan karakteri verir
        System.out.println("Harfin indexi = " + kelime1.indexOf("H"));  // Girilen harfin indexini verir
        System.out.println("sondan başlayıp harf indexi = " + kelime1.lastIndexOf("o")); // sondan başlayarak harf indexi verir



    
    }
}
