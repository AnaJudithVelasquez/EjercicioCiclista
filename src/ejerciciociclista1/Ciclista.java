
package ejerciciociclista1;

//import java.util.ArrayList;

public abstract class Ciclista {
    
    private int identificador;
    private String nombre;
    private int tiempoAcomulado = 0;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }


    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcomulado() {
        return tiempoAcomulado;
    }

    public void setTiempoAcomulado(int tiempoAcomulado) {
        this.tiempoAcomulado = tiempoAcomulado;
    }

  
   protected abstract String imprimirTipo();
   
   public void mostrarDatos(){
   
       System.out.println("ID: " + identificador + ", Nombre: " + nombre + ", Tiempo" + tiempoAcomulado);
   }
    
}
