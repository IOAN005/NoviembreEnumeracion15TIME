package com.corenetworks.presentacion;

import com.corenetworks.modelo.EstadoCivil;
import com.corenetworks.modelo.EstadoCivilAvanzado;

public class ProbarEstadoCivil {
    public static void main(String[] args) {
        EstadoCivil Pepito=EstadoCivil.SOLTERO;
        System.out.println(Pepito);
        EstadoCivil Laura=EstadoCivil.valueOf("CASADO");
        System.out.println(Laura);
        for (EstadoCivil elemento:
                EstadoCivil.values()){
            System.out.println(elemento);

        }
        for(int i=0;i<EstadoCivil.values().length;i++){
            System.out.println(EstadoCivil.values()[i]);
        }
        System.out.println("enumeraciones avanzadas");
        EstadoCivilAvanzado Luis=EstadoCivilAvanzado.CASADO;
        System.out.println(Luis);

        System.out.println("recorer estado civil avanzado");

        for (EstadoCivilAvanzado elemento:
            EstadoCivilAvanzado.values() ) {
            System.out.println(elemento);
            System.out.println(elemento.getDescription());
            System.out.println(elemento.name());
            System.out.println(elemento.toString());
            System.out.println(elemento.ordinal());


        }
    }
}
