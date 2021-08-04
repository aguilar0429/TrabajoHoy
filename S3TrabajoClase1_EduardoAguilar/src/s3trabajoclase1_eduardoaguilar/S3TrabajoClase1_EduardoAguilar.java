
package s3trabajoclase1_eduardoaguilar;

import java.util.ArrayList;
import java.util.Scanner;

public class S3TrabajoClase1_EduardoAguilar {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList PROTOS  = new ArrayList();  // no typeada porque van strings e ints
        
        
        
        System.out.println("1. Agregar Prototipo\n"
            +"2. Modificar\n"
            +"3. Eliminar\n"
            +"4. Listar\n"
            +"5. Salir");
        int opcion = sc.nextInt();
        while(opcion!=5){
            switch(opcion){
                case 1:{
                    Consola c = new Consola();
                    Pantalla p = new Pantalla();
        
                    TarjetaGrafica g = new TarjetaGrafica();
        
                    TarjetaRedInalambrica r = new TarjetaRedInalambrica();
                    System.out.println("Ingresar nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    c.setNombre(nombre);
                    System.out.println("Ingresar numero de serie: ");
                    int serie = sc.nextInt();
                    c.setSerie(serie);
                    System.out.println("Ingresar numero de puertos: ");
                    int puertos = sc.nextInt();
                    c.setPuertos(puertos);
                    System.out.println("Ingresar numero de botones: ");
                    int botones = sc.nextInt();
                    c.setBotones(botones);
                    
                    System.out.println("Ingresar tamanio en pulgadas de la pantalla: ");
                    int size = sc.nextInt();
                    p.setSize(size);
                    System.out.println("Ingresar resolucion: ");
                    int res = sc.nextInt();
                    p.setResolucion(opcion);
                    System.out.println("Ingresar peso: ");
                    int peso = sc.nextInt();
                    p.setPeso(peso);
                    
                    System.out.println("Ingresar capacidad de Tarjeta Grafica: ");
                    int capacidad = sc.nextInt();
                    g.setCapacidad(capacidad);
                    System.out.println("Ingresar velocidad de procesamiento: ");
                    int velocidad = sc.nextInt();
                    g.setVelocidad(velocidad);
                    
                    System.out.println("Ingresar peso de Tarjeta de Red Inalambrica");
                    int pesoRed= sc.nextInt();
                    r.setPeso(peso);
                    System.out.println("Ingresar enmienda: ");
                    String enmienda = sc.next();
                    r.setEnmienda(enmienda);
                    c.setPantalla(p);
                    c.setGrafica(g);
                    c.setRed(r);
                    
                    
                    PROTOS.add(c);
                    
                    
                    break;
                }case 2:{
                    Consola c = new Consola();
                    Pantalla p = new Pantalla();
        
                    TarjetaGrafica g = new TarjetaGrafica();
        
                    TarjetaRedInalambrica r = new TarjetaRedInalambrica();
                    System.out.println("Ingrese numero de prototipo: ");
                    int posicion = sc.nextInt();
                    
                    System.out.println("Ingrese cualidad: \n"
                    +"0. Nombre\n"
                    +"1. Serie\n"
                    +"2. Numero de puertos\n"
                    +"3. Numero de botones\n"
                    +"4. Tamanio de pantalla\n"
                    +"5. Resolucion\n"
                    +"6. Peso\n"
                    +"7. Capacidad de Grafica\n"
                    +"8. Velocidad\n"
                    +"9. Peso TRI\n"
                    +"10. Enmienda");
                    int cualidad = sc.nextInt();
                    
                    switch(cualidad){
                        case 0:{
                            if(PROTOS.get(posicion) instanceof  Consola){
                                System.out.println("Ingrese");
                                String nombre = sc.next();
                                
                                ((Consola)PROTOS.get(posicion)).setNombre(nombre);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }
                        case 1:{
                            if(PROTOS.get(posicion) instanceof  Consola){
                                System.out.println("Ingrese");
                                int serie = sc.nextInt();
                                
                                ((Consola)PROTOS.get(posicion)).setSerie(serie);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 2:{
                            if(PROTOS.get(posicion) instanceof  Consola){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((Consola)PROTOS.get(posicion)).setPuertos(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            break;
                        }case 3:{
                            if(PROTOS.get(posicion) instanceof  Consola){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((Consola)PROTOS.get(posicion)).setBotones(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 4:{
                            if(PROTOS.get(posicion) instanceof  Pantalla){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((Pantalla)PROTOS.get(posicion)).setSize(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 5:{
                            if(PROTOS.get(posicion) instanceof  Pantalla){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((Pantalla)PROTOS.get(posicion)).setResolucion(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 6:{
                            if(PROTOS.get(posicion) instanceof  Pantalla){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((Pantalla)PROTOS.get(posicion)).setPeso(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 7:{ 
                            
                           System.out.println("Ingrese: ");
                            int puertos = sc.nextInt();
                                
                            
                            c.getGrafica().setCapacidad(puertos);
                                
                           
                            
                            break;
                        }case 8:{
                            if(PROTOS.get(posicion) instanceof  TarjetaGrafica){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((TarjetaGrafica)PROTOS.get(posicion)).setVelocidad(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 9:{
                            if(PROTOS.get(posicion) instanceof  TarjetaRedInalambrica){
                                System.out.println("Ingrese");
                                int puertos = sc.nextInt();
                                
                                ((TarjetaRedInalambrica)PROTOS.get(posicion)).setPeso(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                            break;
                        }case 10:{
                            if(PROTOS.get(posicion) instanceof  TarjetaRedInalambrica){
                                System.out.println("Ingrese");
                                String puertos = sc.next();
                                
                                ((TarjetaRedInalambrica)PROTOS.get(posicion)).setEnmienda(puertos);
                                
                            }else{
                                System.out.println("No es posible");
                            }
                            
                        }
                        
                       
                        
                    }
                                        
                    
                    break;
                }case 3:{
                    System.out.println("Ingresar posicion del prototipo a eliminar: ");
                    int posicion = sc.nextInt();
                    PROTOS.remove(posicion);
                    break;
                }case 4:{
                    for(int i =0; i<PROTOS.size();i++){
                        System.out.println(i+". "+PROTOS.get(i));
                    }
                    break;
                }case 5:{
                  
                    
                }
            }
            System.out.println("1. Agregar Prototipo\n"
            +"2. Modificar\n"
            +"3. Eliminar\n"
            +"4. Listar\n"
            +"5. Salir");
            opcion = sc.nextInt();
        }
    }
    
}
