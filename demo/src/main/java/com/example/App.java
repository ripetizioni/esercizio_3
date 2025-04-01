package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Cantante cantante1 = new Cantante("Paolo", "Rossi", "RSSMRA80L05F593A");
        Cantante cantante2 = new Cantante("Luca", "Verdi", "ggyuguyfdids858dicy");
        Canzone canzone1 = new Canzone("015", cantante1, 2.55, 2025, 5.50 );
        Canzone canzone2 = new Canzone("018", cantante2, 3.15, 2024, 8.50 );
        Canzone canzone3 = new Canzone("019", cantante1, 4.00,2023, 10.50 );
        Canzone canzone4 = new Canzone("020", cantante2, 3.00,2023, 7.50 );
        Canzone canzone5 = new Canzone(canzone3);
        
        System.out.println("La canzone costa: " + canzone1.calcolaCostoCanzone() + " €");
        System.out.println(canzone2.verificaCanzone());
        System.out.println(canzone2.verificaDurata(120));
    }           
    
}
