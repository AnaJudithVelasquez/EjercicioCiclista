
package ejerciciociclista1;

import java.util.ArrayList;

public class Equipo {
    
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais, ArrayList<Ciclista> ciclistas) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }
    

    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        this.tiempoTotalEquipo = tiempoTotalEquipo;
    }
    
    public void añadirCiclista(Ciclista ciclista){
    
    }
    
    public void calcularTiemposCiclistas(){
    
    }
     
    public void imprimirDatosEquipo(){
    
    }
    
    public void listarNombresCiclistas(){
    
    }
    
    public void imprimirDatosCiclistasPorld(Ciclista ciclista){
    
    }
    
}
