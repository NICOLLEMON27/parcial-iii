package com.mycompany.losnegativos;
import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
import static spark.Spark.get;
//import static spark.Spark.post;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
    
public class LosNegativos {
    
    public static void main(String[] args) {
        
    Autor autor = new Autor("Daniel", "Venezolano", "1856");
    Libro libro = new Libro("Hambre", "Panamericana", "Terror", "1802");
    Copia copia = new Copia("V564", "Disponible", libro);
    Lector lector = new Lector(1, "Nicolle", "Montaño", "Mi Casa");
    
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Lector> lectores = new ArrayList<>();
    ArrayList<Autor> autores= new ArrayList<>();
    
    autores.add(autor);
    libros.add(libro);
    lectores.add(lector);
    
    autor.getLibros().add(libro);
    libro.getAutores().add(autor);
    libro.getCopias().add(copia);
    copia.setLector(lector);
    lector.agregarCopia(copia);
    
      Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation() // Utiliza @Expose para excluir campos específicos
                .create();
      
     get("/libros", (var req, var res) -> {
        res.type("application/json");
         return gson.toJson(libros);
        });
     
     get("/lector", (var req, var res) -> {
        res.type("application/json");
         return gson.toJson(lectores);
        });
      
      get("/autores", (req, res) -> {
            res.type("application/json");
            return gson.toJson(autores);
        });

    
        
        
    }
    
}