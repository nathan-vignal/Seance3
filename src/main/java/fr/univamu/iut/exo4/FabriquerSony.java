package fr.univamu.iut.exo4;

public class FabriquerSony extends FabriquerAbstraite {
    @Override
    void equiper(String gadget, Connectable connectable) {
        System.out.println("Sony equips "+connectable.getClass()+" with "+gadget+".");
    }
}
