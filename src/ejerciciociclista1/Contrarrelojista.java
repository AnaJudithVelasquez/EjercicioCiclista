/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciociclista1;

 class Contrarrelojista extends Ciclista {
     private double velocidadMaxima;

    public Contrarrelojista(double velocidadMaxima, int identificador, String nombre) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
     @Override
    public String imprimirTipo(){
       return getNombre() + " Es un Contrarrelojista";
       }
    @Override 
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
        System.out.println(imprimirTipo());
        System.out.println("");
    }
       } 
    
    
