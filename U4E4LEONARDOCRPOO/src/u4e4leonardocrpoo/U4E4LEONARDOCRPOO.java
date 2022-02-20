package u4e4leonardocrpoo;
import java.util.Scanner;

public class U4E4LEONARDOCRPOO {

    public static void main(String[] args) {
        U4E4LEONARDOCRPOO loop=new U4E4LEONARDOCRPOO();
        loop.loop();
    }
    void loop(){
        
        //Numeros y palabra que puedes intentar buscar
        String[] palabras={"hola","adios","helou","elpepe","ete","sech","have","you","ever","loved"};
        String [][]numeros=new String[2][2];
        numeros[0][0]="1";
        numeros[1][0]="2";
        numeros[1][1]="3";
        numeros[0][1]="4";
        
        
        Scanner scanf=new Scanner(System.in);
        String comp;
        int seleccion;
        Strings exeS=new Strings();
        Ints exeI=new Ints();
        System.out.println("En qué arreglo quiere buscar?\n [1]Palabras [2]Numeros [cualquiernumero]Salir:");
        seleccion=scanf.nextInt();
        if(seleccion==1){
                System.out.println("Ingrese palabra a buscar:");
                comp=scanf.next();
                exeS.Buscar(palabras, comp);
        }
        if(seleccion==2){
                System.out.println("Ingrese numero a buscar:");
                comp=scanf.next();
                exeI.Buscar(numeros, comp);
        }else{
                System.exit(0);
        }
    }
    }
 
