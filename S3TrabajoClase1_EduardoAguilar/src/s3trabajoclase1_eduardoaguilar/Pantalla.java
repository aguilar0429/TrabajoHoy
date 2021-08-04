
package s3trabajoclase1_eduardoaguilar;


public class Pantalla {
    private int size;
    private int resolucion;
    private int peso;

    public Pantalla() {
    }

    public Pantalla(int size, int resolucion, int peso) {
        setSize(size);
        this.resolucion = resolucion;
        setPeso(peso);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <=15){
            this.size = size;
        }
        
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso <=30){
            this.peso = peso;
        }
        
    }

    @Override
    public String toString() {
        return "Size: " + size + "\nResolucion: " + resolucion + "\nPeso: " + peso ;
    }
    
    
}
