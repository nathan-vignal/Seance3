package fr.univamu.iut.exo5;

import fr.univamu.iut.exo4.Imprimante;
import fr.univamu.iut.exo4.Connectable;
// pattern adaptateur
public class ImprimanteConnectable implements Connectable {
    private Imprimante imprimante;

    public ImprimanteConnectable(Imprimante imprimante) {
        this.imprimante = imprimante;

    }

    @Override
    public void equiper(String gadget) {
        System.out.println("Equip the printer with "+ gadget);

    }
    @Override
    public void demarer() {
        System.out.println("Starting the printer  BIP BOOOOOM.");
    }


}
/*public void equiper(String gadget){
        System.out.println("Equip the Radio with "+ gadget);
    }

    @Override
    public void demarer() {
        System.out.println("Starting the radio  BIP BIP BIP.");
    }*/