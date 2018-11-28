package fr.univamu.iut.exo4;

public class CoffeeMaker implements Connectable {

    public CoffeeMaker() {
    }

    public void equiper(String gadget){
        System.out.println("Equip the coffee maker with "+ gadget);
    }

    @Override
    public void demarer() {
        System.out.println("Starting the coffee maker  BOO BIP.");
    }
}
