
package s3trabajoclase1_eduardoaguilar;

public class TarjetaRedInalambrica {
    private int peso;
    private String enmienda;

    public TarjetaRedInalambrica() {
    }

    public TarjetaRedInalambrica(int peso, String enmienda) {
        this.peso = peso;
        this.enmienda = enmienda;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso <=35){
            this.peso = peso;
        }
        
    }

    public String getEnmienda() {
        return enmienda;
    }

    public void setEnmienda(String enmienda) {
        this.enmienda = enmienda;
    }

    @Override
    public String toString() {
        return "\nPeso: " + peso + "\nEnmienda: " + enmienda ;
    }
    
    
    
}
