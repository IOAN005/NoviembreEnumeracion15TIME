package com.corenetworks.modelo;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Baraja {
    private Carta[] barajas;

    @Override
    public String toString() {
        return "Baraja{" +
                "barajas=" + Arrays.toString(barajas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baraja baraja = (Baraja) o;
        return Arrays.equals(barajas, baraja.barajas);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(barajas);
    }


    public  Baraja() {

         barajas = new Carta[52];
        int indice = 0;
        for (int i = 0; i < Palo.values().length; i++) {

            for (int j = 0; j < Numeros.values().length; j++) {
                barajas[indice]= new Carta(Palo.values()[i],Numeros.values()[j]);

                   indice++;


            }
        }

    }

    public Carta[] getBarajas() {
        return barajas;
    }

    public void setBarajas(Carta[] barajas) {
        this.barajas = barajas;
    }
}


