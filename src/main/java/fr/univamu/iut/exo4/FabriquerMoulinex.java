package fr.univamu.iut.exo4;

public class FabriquerMoulinex extends FabriquerAbstraite {
    @Override
    void equiper(String gadget, Connectable connectable) {
        System.out.println("Moulinex equips "+connectable.getClass()+" with a "+gadget+".");
    }
}
