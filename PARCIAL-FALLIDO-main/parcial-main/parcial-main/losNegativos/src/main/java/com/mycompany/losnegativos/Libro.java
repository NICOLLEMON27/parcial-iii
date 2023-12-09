
package com.mycompany.losnegativos;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;

public class Libro {
     @Expose
    public String nombre;
     @Expose
    public String editorial;
     @Expose
    public String tipo;
      @Expose
    public String año;
     public ArrayList<Copia> copias;
     @Expose(serialize = false, deserialize = false)
   public  transient ArrayList<Autor> Autores;

    public Libro(String nombre, String editorial, String tipo, String año) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.tipo = tipo;
        this.año = año;
        this.Autores = new ArrayList<>();
        this.copias = new ArrayList<>();
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    public void setCopias(ArrayList<Copia> copias) {
        this.copias = copias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAño() {
        return año;
    }

    public ArrayList<Autor> getAutores() {
        return Autores;
    }

    public ArrayList<Copia> getCopias() {
        return copias;
    }

    public void setAutores(ArrayList<Autor> escrito) {
        this.Autores = escrito;
    }
   
}
