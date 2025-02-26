package org.sebsy.demo.orchestre.couplagefort;

import org.sebsy.demo.orchestre.Instrument;

public class Batterie implements Instrument {
    @Override
    public void afficher() {
        System.out.println("Je suis une batterie...");
    }

    @Override
    public void jouer() {
        System.out.println("BOUM BOUM TCHAK");
    }
}
