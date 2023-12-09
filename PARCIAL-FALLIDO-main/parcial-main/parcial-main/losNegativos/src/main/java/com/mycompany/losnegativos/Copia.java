package com.mycompany.losnegativos;

import com.google.gson.annotations.Expose;

public class Copia {
        @Expose
  public String identificador;
         @Expose   
  public String estado;
        @Expose     
  public Libro original;
      @Expose
  public Lector lector;
      @Expose
  public Multa multa;
  
    public Copia(String identificador, String estado, Libro original) {
        this.identificador = identificador;
        this.estado = estado;
        this.original = original;
    }
   
   
    public void prestar(){
    this.estado= "prestado";
        System.out.println("El libro se ha prestado");
    }
    public void devolver(){
    this.estado= "disponible";
        System.out.println("El libro esta disponible");
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getEstado() {
        return estado;
    }

    public Libro getOriginal() {
        return original;
    }

    public Lector getLector() {
        return lector;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setOriginal(Libro original) {
        this.original = original;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    
}
