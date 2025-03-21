package com.example;

public class Cantante {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Cantante (String nome, String cognome, String codiceFiscale){
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
    }
    
    public Cantante(Cantante c){
        this.nome=c.getNome();
        this.cognome=c.getCognome();
        this.codiceFiscale=c.getCodiceFiscale();
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    } 
    
    @Override
    public String toString(){
        return "\nnome: "+nome  +"\ncognome: " +  cognome +"\ncodiceFiscale: " + codiceFiscale;
    }
    
}
