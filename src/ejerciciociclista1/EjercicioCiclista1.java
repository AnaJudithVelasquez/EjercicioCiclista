
package ejerciciociclista1;


public class EjercicioCiclista1 {

    
    public static void main(String[] args) {
       Equipo equipo = new Equipo(" Equipo Aguilas ", " Peru ");

        Velocista velocista = new Velocista(540.5, 1, " Lucas ");
        velocista.setVelocidadPromedioSprint(56.0);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(4.6f, 9.0f, 4, " Daniel ");
        escalador.setTiempoAcumulado(130);

        Contrarrelojista contrarrelojista = new Contrarrelojista(80.0, 2, " Juan ");
        contrarrelojista.setTiempoAcumulado(115);
      
        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);
        
        equipo.calcularTiempoTotal();
        equipo.imprimirDatosEquipo(); 
        equipo.listarNombresCiclistas(); 
        equipo.buscarCiclista();
    }
}
