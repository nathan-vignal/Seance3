package fr.univamu.iut.exo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppliDomotique {
    private static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    private static int menu() {
        int choix = 1;
        System.out.println("Taper 0 pour finir, 1 pour connecter une cafetière et 2 pour une radio");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    private static void connecter(int type) {
        switch (type) {
            case 1:
                Connectable radio = new Radio();
                radio.equiper("nimbus 2000");
                objets.add(radio);
                break;
            case 2:
                Connectable coffeeMaker = new CoffeeMaker();
                coffeeMaker.equiper("cofee");
                objets.add(coffeeMaker);
                break;
        }
    }

    public static void main(String[] args) {
        int type = 0;
        while ((type = menu()) != 0) {
            connecter(type);
        }
        System.out.println(objets);
    }
}
