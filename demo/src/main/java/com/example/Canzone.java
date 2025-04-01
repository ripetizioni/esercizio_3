package com.example;

//visibilità tipo_variabile_ritorno nomeFunzione(tipo_variabile nome_parametro, ...)

public class Canzone {
    private String codiceCanzone;
    private Cantante cantante;
    private double durataInSecondi;
    private int annoDiUscita;
    private double prezzo;

    public Canzone(String codiceCanzone, Cantante cantante, double durataInSecondi, int annoDiUscita, double prezzo) {
        this.codiceCanzone = codiceCanzone;
        this.cantante = cantante;
        this.durataInSecondi = durataInSecondi;
        this.annoDiUscita = annoDiUscita;
        this.prezzo = prezzo;
    }

    public Canzone(Canzone c) {
        this.codiceCanzone = c.getCodiceCanzone();
        this.cantante = c.getCantante();
        this.durataInSecondi = c.getDurataInSecondi();
        this.annoDiUscita = c.getAnnoDiUscita();
        this.prezzo = c.getPrezzo();
    }

    public double calcolaCostoCanzone() {
        if (durataInSecondi == 0) {
            System.out.println("Errore, la durata non puo' essere 0");
        }
        return prezzo / durataInSecondi;
    }

    public boolean verificaCanzone(Canzone altraCanzone) {
        return this.annoDiUscita == altraCanzone.annoDiUscita;
    }

    public int verificaCanzone() {
        int contaVocali = 0;
        String vocali = "aeiouAEIOU";

        for (int i = 0; i < cantante.getCognome().length(); i++) {
            char c = cantante.getCognome().charAt(i);
            if (vocali.indexOf(c) != -1) {
                contaVocali++;
            }
        }
        return contaVocali;
    }

    public int verificaDurata(int durata) {
        if (this.durataInSecondi == durata) {
            return 0;
        } else if (this.durataInSecondi > durata) {
            return 1;
        } else {
            return -1;
        }
    }

    public String uscitaCantante(Canzone altrCanzone) {
        if (this.annoDiUscita == altrCanzone.annoDiUscita) {
            return this.cantante.getCognome();
        } else {
            return null;
        }
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

    public double getDurataInSecondi() {
        return durataInSecondi;
    }

    public void setDurataInSecondi(double durata) {
        this.durataInSecondi = durata;
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
    public String toString() {
        return "\nIl codice della canzone e': " + codiceCanzone + "\nIl cantante e' : " + cantante.toString()
                + "\nLa canzone dura: : " + durataInSecondi + "\nE' uscita nell'anno: ; " + annoDiUscita
                + "\nIl costo e' : " + prezzo;
    }

}
