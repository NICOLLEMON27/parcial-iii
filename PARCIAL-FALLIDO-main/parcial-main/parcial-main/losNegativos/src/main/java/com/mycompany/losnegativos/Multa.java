package com.mycompany.losnegativos;

import com.google.gson.annotations.Expose;

public class Multa {
        @Expose
    private final int diasRetraso;
        @Expose
    private double montoMulta;
        @Expose
    private Lector lector;
        @Expose
    private Prestamo prestamo;

    public Multa(int diasRetraso, double montoMulta, Lector lector, Prestamo prestamo) {
        this.diasRetraso = diasRetraso;
        this.montoMulta = montoMulta;
        this.lector = lector;
        this.prestamo = prestamo;
    }

 
    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public double calcularMulta() {
        
        this.montoMulta = this.diasRetraso * 5.0; // asumimos que la multa es de 5.0 por día de retraso
        return this.montoMulta;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public double getMontoMulta() {
        return montoMulta;
    }

    public void setMontoMulta(double montoMulta) {
        this.montoMulta = montoMulta;
    }
    
}
