package u3e3sergiolcrpoo;
import java.util.Scanner;
public class U3E3SERGIOLCRPOO {

    public static void main(String[] args) {
        U3E3SERGIOLCRPOO back=new U3E3SERGIOLCRPOO();
        back.loop();
    }
    /*el siguiente método es una interfaz que hice para que se puedan ingresar los datos a mano y
    salir en el momento que se desee (osease es algo extra hehe)*/
    void loop(){
        Scanner scan=new Scanner(System.in);
        PFisica exeF=new PFisica();
        PGeometria exeG=new PGeometria();
        System.out.println("\n-------Elija la clase a usar 1-Fisica 2-Geometría (Cualq.Num. para Salir):-------");
        int r=scan.nextInt();
        if(r==1){
            System.out.println("Elija que encontrar \n1-Distancia \n2-Velocidad Final \n3-Tiempo");
            int r2=scan.nextInt();
            switch(r2){
                case 1:
                    exeF.distancia();
                    break;
                case 2:
                    exeF.velocidadF();
                    break;
                case 3:
                    exeF.tiempo();
                    break;
            }
        }
        if(r==2){
            System.out.println("Elija \n1-Pendiente de dos puntos \n2-Distancia entre dos puntos \n3-Punto medio");
            int r2=scan.nextInt();
            switch(r2){
                case 1:
                    exeG.m();
                    break;
                case 2:
                    exeG.Dist();
                    break;
                case 3:
                    exeG.PMedio();
                    break;
            }
        }
        if(r!=1&&r!=2){
            System.exit(0);
        }
    }
    
}
