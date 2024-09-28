package Tekrarlar;

public class _9_Break_Debug_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // i 5 olduğunda döngünün geri kalanını atlar, yani döngü 5. kez dönerken continue altındakileri yapmaz
            }             // ama sadece 5. dönme için yapmaz 6,7,8 diye diğer döngülere devam eder.
            System.out.println("true = " + true);
            System.out.println(i);
        }
//------------------------------------BREAK--------------------------------------------------------------------------------------
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // i=5 olduğunda döngünün geri kalanını yapmaz tamamen döngüyü bitirir
            }
            System.out.println("true = " + true);
            System.out.println(i);
        }
    }
}
// Burada Debug ile hangi kısımlarda continue veya break talimatlarının çalıştığını görebiliriz.