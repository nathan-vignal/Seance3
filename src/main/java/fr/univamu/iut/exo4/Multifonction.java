package fr.univamu.iut.exo4;

public abstract class Multifonction implements Imprimante {
    private Imprimante imprimante;

    public Multifonction(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        imprimante.imprimer();
        System.out.println("La fonction"+getClass()+" est activée.");
    }
}
