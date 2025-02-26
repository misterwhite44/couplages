package org.sebsy.demo.orchestre;

import org.sebsy.demo.orchestre.couplagefort.Batterie;
import org.sebsy.demo.orchestre.couplagefort.Piano;

public class Musicien {
    private Instrument instrument;
    private String morceau;

    public Musicien(Instrument instrument, String morceau) {
        this.instrument = instrument;
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        instrument.afficher();
        System.out.println("et je joue le morceau " + morceau);
        instrument.jouer();
    }

    public static void main(String[] args) {
        Musicien pianiste = new Musicien(new Piano(), "La lettre à Elise");
        pianiste.jouerMorceau();

        Musicien batteur = new Musicien(new Batterie(), "Smoke on the water");
        batteur.jouerMorceau();
    }
}
