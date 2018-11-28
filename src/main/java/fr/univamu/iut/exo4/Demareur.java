package fr.univamu.iut.exo4;

import java.util.ArrayList;

public class Demareur {
    private ArrayList<Connectable> objetsActif;

    public Demareur() {
        objetsActif = new ArrayList<Connectable>();
    }

    public void demarerLesActivites(){
        for(Connectable connectable : objetsActif ){
            connectable.demarer();
        }
    }
    public void attacher(Connectable connectable){
        objetsActif.add(connectable);
    }
    public void detacher(Connectable connectable){
        objetsActif.remove(connectable);

    }

}
