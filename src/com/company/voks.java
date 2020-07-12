package com.company;

// OLIO JOSSA ON KIRJAIN JA LUKUMAARA.

public class voks {
    public char kirjain;
    public int lkm;

    public voks(char kirjain, int lkm) {
        this.kirjain = kirjain;
        this.lkm = lkm;
    }

    public void lisaaLkm() {
        lkm++;
    }

    public int palautaLkm() {
        return lkm;
    }

    public String toString() {
        return kirjain + " lukumäärä " + lkm;
    }
}
