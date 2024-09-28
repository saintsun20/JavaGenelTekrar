package Tekrarlar.OOP._10_ProtectedAndFinal._01_Protected.Paket2;


import Tekrarlar.OOP._10_ProtectedAndFinal._01_Protected.Paket1.P1Hayvan;

public class Kedi extends P1Hayvan {
    public Kedi(){
        super.cinsi="Kara Kedi"; // protectedlara extend yapan classların içinden erişilebilir
    }
}
