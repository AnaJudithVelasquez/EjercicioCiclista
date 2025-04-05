
package ejerciciociclista1;


 class Velocista extends Ciclista{
    
  private double potenciaPromedio;
  private double potenciaPromedioSprint;

    public Velocista(double potenciaPromedio, double potenciaPromedioSprint, int identificador, String nombre) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.potenciaPromedioSprint = potenciaPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getPotenciaPromedioSprint() {
        return potenciaPromedioSprint;
    }

    public void setPotenciaPromedioSprint(double potenciaPromedioSprint) {
        this.potenciaPromedioSprint = potenciaPromedioSprint;
    }
  
  @Override
   public String imprimirTipo(){
       return getNombre() + "Es un velocista";
       }
   public void imprimirDatos() {
       }
 }
