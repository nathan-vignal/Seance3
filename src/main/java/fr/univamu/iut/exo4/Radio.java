package fr.univamu.iut.exo4;

public class Radio implements Connectable {
    public Radio() {
    }

    public void equiper(String gadget){
        System.out.println("Equip the Radio with "+ gadget);
    }

    @Override
    public void demarer() {
        System.out.println("Starting the radio  BIP BIP BIP.");
    }
}
