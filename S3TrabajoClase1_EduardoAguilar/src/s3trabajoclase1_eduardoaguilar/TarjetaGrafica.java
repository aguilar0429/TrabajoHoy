
package s3trabajoclase1_eduardoaguilar;

public class TarjetaGrafica {
    private int capacidad;
    private int velocidad;

    public TarjetaGrafica() {
    }

    public TarjetaGrafica(int capacidad, int velocidad) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad <=1024){
            this.capacidad = capacidad;
        }
        
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad <=555){
            this.velocidad = velocidad;
        }
        
    }

    @Override
    public String toString() {
        return "\nCapacidad: " + capacidad + "\nVelocidad: " + velocidad ;
    }
    
    
    
}
