package com.example;

//visibilità tipo_variabile_ritorno nomeFunzione(tipo_variabile nome_parametro, ...)

public class Canzone {
    private String codiceCanzone;
    private Cantante cantante;
    private double durata;
    private int annoDiUscita;
    private double prezzo;
    
    public Canzone(String codiceCanzone,Cantante cantante,double durata, int annoDiUscita,double  prezzo){
        this.codiceCanzone=codiceCanzone;
        this.cantante=cantante;
        this.durata=durata;
        this.annoDiUscita=annoDiUscita;
        this.prezzo=prezzo;
    }

    public String getCodiceCanzone() {
        return codiceCanzone;
    }

    public void setCodiceCanzone(String codiceCanzone) {
        this.codiceCanzone = codiceCanzone;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public int getAnnoDiUscita() {
        return annoDiUscita;
    }

    public void setAnnoDiUscita(int annoDiUscita) {
        this.annoDiUscita = annoDiUscita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    @Override
    public String toString(){
        return "\nIl codice della canzone e': "+ codiceCanzone + "\nIl cantante e' : "+ cantante.toString() + "\nLa canzone dura: : " + durata + "\nE' uscita nell'anno: ; " + annoDiUscita + "\nIl costo e' : " + prezzo;
    }

}

