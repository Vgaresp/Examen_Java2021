package com.example.lib;

public class MedidaCO2 {
    //atributos
    private long tiempo;
    private int ppmElectronica;
    private int ppmTelematica;
    private int ppmAulanueve;

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public void setPpmElectronica(int ppmElectronica) {
        this.ppmElectronica = ppmElectronica;
    }

    public void setPpmTelematica(int ppmTelematica) {
        this.ppmTelematica = ppmTelematica;
    }

    public void setPpmAulanueve(int ppmAulanueve) {
        this.ppmAulanueve = ppmAulanueve;
    }

    public MedidaCO2(long tiempo, int ppmElectronica, int ppmTelematica, int ppmAulanueve){
        this.tiempo = tiempo;
        this.ppmElectronica = ppmElectronica;
        this.ppmTelematica = ppmTelematica;
        this.ppmAulanueve = ppmAulanueve;
    }


}
