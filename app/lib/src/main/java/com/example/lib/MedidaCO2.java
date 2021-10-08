package com.example.lib;

public class MedidaCO2 {
    //atributos
    private long tiempo;
    private int ppmElectronica;
    private int ppmTelematica;
    private int ppmAulanueve;

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public int getPpmElectronica() {
        return ppmElectronica;
    }

    public void setPpmElectronica(int ppmElectronica) {
        this.ppmElectronica = ppmElectronica;
    }

    public int getPpmTelematica() {
        return ppmTelematica;
    }

    public void setPpmTelematica(int ppmTelematica) {
        this.ppmTelematica = ppmTelematica;
    }

    public int getPpmAulanueve() {
        return ppmAulanueve;
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

    @Override
    public String toString() {
        return "MedidaCO2{" +
                "tiempo=" + tiempo +
                ", ppmElectronica=" + ppmElectronica +
                ", ppmTelematica=" + ppmTelematica +
                ", ppmAulanueve=" + ppmAulanueve +
                '}';
    }
}
