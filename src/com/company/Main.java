package com.company;

import java.util.Scanner;
import java.util.ArrayList;

    // LASKETAAN KUINKA MONTA VOKAALIA ON ANNETUSSA SANASSA, MUKANA VOKS OLIO.

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana, lasketaan siitä vokaalit.");
         //LUODAAN VOKAALEISTA OLIOT
        voks a = new voks('a', 0);
        voks e = new voks('e', 0);
        voks i = new voks('i', 0);
        voks o = new voks('o', 0);
        voks u = new voks('u', 0);
        voks y = new voks('y', 0);
        voks ä = new voks('ä', 0);
        voks ö = new voks('ö', 0);

        String syote = lukija.nextLine();       //Kayttajan syote
        int vokaalit = 0;
        ArrayList<voks> voksut = new ArrayList();


        for(int j = 0; j < syote.length(); j++) {

            if(syote.charAt(j) == 'a' || syote.charAt(j) == 'A') {
                vokaalit++;
                a.lisaaLkm();
            } else if(syote.charAt(j) == 'e' || syote.charAt(j) == 'E') {
                vokaalit++;
                e.lisaaLkm();
            } else if(syote.charAt(j) == 'i' || syote.charAt(j) == 'I') {
                vokaalit++;
                i.lisaaLkm();
            } else if(syote.charAt(j) == 'o' || syote.charAt(j) == 'O') {
                vokaalit++;
                o.lisaaLkm();
            } else if(syote.charAt(j) == 'u' || syote.charAt(j) == 'U') {
                vokaalit++;
                u.lisaaLkm();
            } else if(syote.charAt(j) == 'y' || syote.charAt(j) == 'Y') {
                vokaalit++;
                y.lisaaLkm();
            } else if(syote.charAt(j) == 'ä' || syote.charAt(j) == 'Ä') {
                vokaalit++;
                ä.lisaaLkm();
            } else if(syote.charAt(j) == 'ö' || syote.charAt(j) == 'Ö') {
                vokaalit++;
                ö.lisaaLkm();
            }

        }

        voksut.add(a);
        voksut.add(e);
        voksut.add(i);
        voksut.add(o);
        voksut.add(u);
        voksut.add(y);
        voksut.add(ä);
        voksut.add(ö);

        System.out.println("Vokaaleja oli: " + vokaalit);   // TULOSTETAAN KUINKA MONTA VOKAALIA OLI YHTEENSÄ

        //TULOSTETAAN ERITELLEN MONTAKO VOKAALIA OLI(ESIM: i = 4, a =2 jne.)

        for(int x = 0; x < voksut.size(); x++) {
            if(voksut.get(x).palautaLkm() > 0) {
                System.out.println(voksut.get(x));
            }

        }

    }
}
