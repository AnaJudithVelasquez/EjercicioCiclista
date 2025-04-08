
package ejerciciociclista1;


 class Velocista extends Ciclista{
    
  private double potenciaPromedio;
  private double velocidadPromedioSprint;

    public Velocista(double potenciaPromedio, int identificador, String nombre) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

  
  @Override
   public String imprimirTipo(){
       return getNombre() + " Es un velocista";
       }
   
  @Override
   public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println(" Potencia promedio: " + potenciaPromedio + " W");
        System.out.println(" Velocidad promedio sprint: " + velocidadPromedioSprint + " km/h");
    }
       
 }
 
