package fr.univamu.iut.exo5;
import fr.univamu.iut.exo4.*;
public class AppliDomotique {
    public static void main(String[] args) {
        ImprimanteLocal imprimante = new ImprimanteLocal();
    ImprimanteConnectable imprimanteConnectable = new ImprimanteConnectable(imprimante);
    imprimanteConnectable.demarer();
    imprimanteConnectable.equiper("lapin");



    }
}
