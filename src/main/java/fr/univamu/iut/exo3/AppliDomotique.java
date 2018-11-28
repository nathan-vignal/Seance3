package fr.univamu.iut.exo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppliDomotique {

    public static int menu() {
        int choix = 1;
        System.out.println("Taper 0 pour finir, scanner sur une imprimante local et 2 pour faxer sur une imprimante réseau");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    public static void connecter(int type)  {

        switch (type) {
            case 1:
                ImprimanteLocal imprimanteLocal = new ImprimanteLocal();
                Scanner scanner = new Scanner(imprimanteLocal);
                scanner.imprimer();
                break;
            case 2:
                ImprimanteReseau imprimanteReseau = new ImprimanteReseau();
                Fax fax = new Fax(imprimanteReseau);
                fax.imprimer();


                break;
        }
    }

    public static void main(String[] args) {
        int type = 0;
        while ((type = menu()) != 0) {
            connecter(type);
        }
    }
}
