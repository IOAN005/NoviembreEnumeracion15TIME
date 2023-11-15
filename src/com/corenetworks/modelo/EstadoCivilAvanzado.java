package com.corenetworks.modelo;

public enum  EstadoCivilAvanzado {
    CASADO("Casado"),
    DIVORCIADO ("Divorciado") ,
    SOLTERO ("Soltero"),
    VIUDO ("VIudo"),
    OTRO ("Otro");
    private final String description;
    private EstadoCivilAvanzado(String description){
        this.description=description;

    }

    public String getDescription() {
        return description;
    }
}
