/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciociclista1;

 class Escalador extends Ciclista {
   
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(float aceleracionPromedio, float gradoRampa, int identificador, String nombre) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    
    @Override
    public String imprimirTipo(){
       return getNombre() + "Es un Escalador";
       }
    @Override
    public void imprimirDatos() {
         super.imprimirDatos();
        System.out.println("Aceleración Subida: " + aceleracionPromedio + " m/s²");
        System.out.println("Grado de Rampa: " + gradoRampa + "°");
        System.out.println(imprimirTipo());
       }
    
}
