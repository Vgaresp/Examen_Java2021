package com.example.lib;

public class MedidaCO2 {
    //atributos
    private String tiempo;
    private double ppmElectronica;
    private double ppmTelematica;
    private double ppmAulanueve;

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public double getPpmElectronica() {
        return ppmElectronica;
    }

    public void setPpmElectronica(double ppmElectronica) {
        this.ppmElectronica = ppmElectronica;
    }

    public double getPpmTelematica() {
        return ppmTelematica;
    }

    public void setPpmTelematica(double ppmTelematica) {
        this.ppmTelematica = ppmTelematica;
    }

    public double getPpmAulanueve() {
        return ppmAulanueve;
    }

    public void setPpmAulanueve(double ppmAulanueve) {
        this.ppmAulanueve = ppmAulanueve;
    }

    public MedidaCO2( String tiempo, double ppmElectronica, double ppmTelematica, double ppmAulanueve){
        this.tiempo = tiempo;
        this.ppmElectronica = ppmElectronica;
        this.ppmTelematica = ppmTelematica;
        this.ppmAulanueve = ppmAulanueve;
    }


}
