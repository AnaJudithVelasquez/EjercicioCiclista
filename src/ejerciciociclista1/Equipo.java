
package ejerciciociclista1;

import java.util.ArrayList;

public class Equipo {
    
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
        this.tiempoTotalEquipo = tiempoTotalEquipo;
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
        for (int i = 0; i < ciclistas.size(); i++) {
            Ciclista ciclista = ciclistas.get(i);
            ciclista.mostrarDatos();
            System.out.println("Tipo: " + ciclista.imprimirTipo());
            System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado() + "\n");
        }
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
    
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo Aguilas", "Perú");

        Velocista velocista = new Velocista(540.5, 1, "Lucas");
        velocista.setVelocidadPromedioSprint(56.0);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(4.6f, 9.0f, 4, "Daniel");
        escalador.setTiempoAcumulado(130);

        Contrarrelojista contrarrelojista = new Contrarrelojista(80.0, 2, "Juan");
        contrarrelojista.setTiempoAcumulado(115);

        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);
        equipo.calcularTiempoTotal();
        equipo.listarNombresCiclistas(); 

        System.out.println("Tiempo total del equipo: " + equipo.getTiempoTotalEquipo());
    }
    
}
