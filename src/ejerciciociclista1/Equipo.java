
package ejerciciociclista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    
    static Scanner sc = new Scanner(System.in);
    
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
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
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }
    
    protected void añadirCiclista(Ciclista ciclista){
        ciclistas.add(ciclista);
    }
    
 
     
    protected void imprimirDatosEquipo(){
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " min");
    }
    
    protected void listarNombresCiclistas(){
        for (Ciclista ciclista : ciclistas)
            System.out.println(" - " + ciclista.getNombre());
            
    }
    
    protected void imprimirDatosCiclistasPorld(int identificador){
       boolean encontrado = false;
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == identificador) {
                c.mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un ciclista con ese ID.");
        }
    }
    
    protected void calcularTiempoTotal() {
        int total = 0;
        for (int i = 0; i < ciclistas.size(); i++) {
            Ciclista ciclista = ciclistas.get(i);
            total += ciclista.getTiempoAcumulado();
        }
        Equipo.tiempoTotalEquipo = total;
        
    }
    void buscarCiclista() {
     
        System.out.println(" Indica el indentificador del cliclista a buscar ");

        int ciclista = sc.nextInt();

        int control= 0;
        boolean buscar = false;

        for (int i = 0; i < ciclistas.size(); i++) {
            if (ciclista == ciclistas.get(i).getIdentificador()) {
              control = i;
                buscar = true;
            }
        }

        if ( buscar == true) {
            System.out.println("El nombre del ciclista es: " + ciclistas.get(control).getNombre());
            
        } else {
            System.out.println("El ciclsita no esta registrado");
        }
    }
}


