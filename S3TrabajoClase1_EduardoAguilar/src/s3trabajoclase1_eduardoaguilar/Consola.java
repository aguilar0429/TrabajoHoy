
package s3trabajoclase1_eduardoaguilar;


public class Consola {
    private String nombre;
    private int serie;
    private int puertos;
    private int botones;
    private Pantalla pantalla;
    private TarjetaGrafica grafica;
    private TarjetaRedInalambrica red;

    public Consola() {
    }

    public Consola(String nombre, int serie, int puertos, int botones) {
        this.nombre = nombre;
        this.serie = serie;
        setBotones(botones);
        setPuertos(puertos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        
        if(puertos <5){
            this.puertos = puertos;
        }
        
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        if(botones<11){
            this.botones = botones;
        }
        
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public TarjetaGrafica getGrafica() {
        return grafica;
    }

    public void setGrafica(TarjetaGrafica grafica) {
        this.grafica = grafica;
    }

    public TarjetaRedInalambrica getRed() {
        return red;
    }

    public void setRed(TarjetaRedInalambrica red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "Consola: \n" + "Nombre: " + nombre + "\nSerie: " + serie + "\nPuertos: " + puertos + "\nBotones: " + botones + "\nPantalla: " + pantalla + "\nTarjeta Grafica: " + grafica + "\nTarjeta Red Inalamrbica: " + red ;
    }
    
    

  
    
    
    
    
}
