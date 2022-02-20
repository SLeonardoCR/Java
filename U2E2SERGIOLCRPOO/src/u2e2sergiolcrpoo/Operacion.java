package u2e2sergiolcrpoo;
import java.util.Scanner;
public class Operacion {
    Scanner scanf=new Scanner(System.in);
    int i, decision;
    String nombre;
    void addData(String datos[][]){
        System.out.println("Datos ordenados en 5x2 de nombre de alumno y carrera del mismo\n\n----DATOS----");
        for(i=0; i<=4; i++){
            System.out.println("Nombre"+(i+1)+"\tCarrera"+(i+1));
        }
        for( i=0; i<=4; i++){
            System.out.println("\nIngrese nombre "+(i+1)+": ");
            datos[i][0]=scanf.next();
            System.out.println("Ingrese carrera "+(i+1)+": ");
            datos[i][1]=scanf.next();
        }
        System.out.println("\n----DATOS----");
        for(i=0; i<=4; i++){
            System.out.println(datos[i][0]+"\t"+datos[i][1]);
        }
        System.out.println("\nIngrese 1 para borrar alguna fila, 2 para modificar alguna fila o cualquier numero para salir");
        decision=scanf.nextInt();
        if(decision==1){
            delNombre(datos);
        }
        if(decision==2){
            editNombre(datos);
        }
        else{
            System.exit(0);
        }
    }
    
    void delNombre(String datos[][]){
        System.out.println("\nIngrese el nombre de la fila a borrar:");
        nombre=scanf.next();
        for ( i=0; i<=4; i++) {
            if(nombre.equals(datos[i][0])){
                datos[i][0]="Nombre"+(i+1);
                datos[i][1]="Carrera"+(i+1);
                i=5;
            }
        }
        System.out.println("\n----DATOS----");
        for( i=0; i<=4; i++){
            System.out.println(datos[i][0]+"\t"+datos[i][1]);
        }
        System.out.println("\nIngrese 1 para borrar alguna fila, 2 para modificar alguna fila o cualquier numero para salir");
        decision=scanf.nextInt();
        if(decision==1){
            delNombre(datos);
        }
        if(decision==2){
            editNombre(datos);
        }
        else{
            System.exit(0);
        }
    }
    
    void editNombre(String datos[][]){
        System.out.println("\nIngrese el nombre de la fila a modificar:");
        nombre=scanf.next();
        for ( i=0; i<=4; i++) {
            if(nombre.equals(datos[i][0])){
                System.out.println("Nuevo nombre:");
                datos[i][0]=scanf.next();
                System.out.println("Nueva carrera");
                datos[i][1]=scanf.next();
                i=5;
            }
        }
        System.out.println("\n----DATOS----");
        for( i=0; i<=4; i++){
            System.out.println(datos[i][0]+"\t"+datos[i][1]);
        }
        System.out.println("\nIngrese 1 para borrar alguna fila, 2 para modificar alguna fila o cualquier numero para salir");
        decision=scanf.nextInt();
        if(decision==1){
            delNombre(datos);
        }
        if(decision==2){
            editNombre(datos);
        }
        else{
            System.exit(0);
        }
    }
}
