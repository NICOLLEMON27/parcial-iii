package com.mycompany.losnegativos;

import com.google.gson.annotations.Expose;

public class Lector {
        @Expose
    public int numSocio;
         @Expose  
    public String nombre;
        @Expose
    public String apellido;
        @Expose
    public String direccion;
        @Expose
    public Copia[] copias;
        @Expose
    public Multa multa;
    
    public Lector(int numSocio, String nombre, String apellido, String direccion) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.copias = new Copia[4];
        
    }
      public void comprobarMultaPendiente() {
        if (this.multa != null) {
            double montoMulta = this.multa.calcularMulta();
            if (montoMulta > 0) {
                System.out.println("El lector " + this.nombre + " " + this.apellido + " tiene una multa pendiente de " + montoMulta);
            } else {
                System.out.println("El lector " + this.nombre + " " + this.apellido + " no tiene multas pendientes.");
            }
        }
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public Multa getMulta() {
        return multa;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Copia[] getCopias() {
        return copias;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCopias(Copia[] copias) {
        this.copias = copias;
    }
  
    public void agregarCopia(Copia copia){
    for( int i=0;i<3;i++){
     if(copias[i]==null){
        copias[i]=copia;
        break;
    }
    }
    }
}
