package u3e3sergiolcrpoo;
import java.util.Scanner;
public class PGeometria extends Matematicas{
    Scanner scan=new Scanner(System.in);
    U3E3SERGIOLCRPOO back=new U3E3SERGIOLCRPOO();
    void m(){
            System.out.println("\n**********PENDIENTE DE 2 PUNTOS**********\nIngrese los datos pedidos\n\nCoordenada X de punto 1:");
            setX(scan.nextFloat());
            System.out.println("Y de punto 1:");
            setY(scan.nextFloat());
            System.out.println("X de punto 2:");
            setW(scan.nextFloat());
            System.out.println("Y de punto 2:");
            setZ(scan.nextFloat());
            setA((getZ()-getY())/(getW()-getX()));
            System.out.println("La pendiente es: "+getA());
            back.loop();
}
    void Dist(){
    System.out.println("\n**********DISTANCIA ENTRE 2 PUNTOS**********\nIngrese los datos pedidos\n\nCoordenada X de punto 1:");
            setX(scan.nextFloat());
            System.out.println("Y de punto 1:");
            setY(scan.nextFloat());
            System.out.println("X de punto 2:");
            setW(scan.nextFloat());
            System.out.println("Y de punto 2:");
            setZ(scan.nextFloat());
            setA(getW()-getX());
            setA(getA()*getA());
            setB(getZ()-getY());
            setB(getB()*getB());
            setC(getA()+getB());
            System.out.println("La Distancia es: "+Math.sqrt(getC()));
            back.loop();
}
    void PMedio(){
     System.out.println("\n**********PUNTO MEDIO DE 2 PUNTOS**********\nIngrese los datos pedidos\n\nCoordenada X de punto 1:");
            setX(scan.nextFloat());
            System.out.println("Y de punto 1:");
            setY(scan.nextFloat());
            System.out.println("X de punto 2:");
            setW(scan.nextFloat());
            System.out.println("Y de punto 2:");
            setZ(scan.nextFloat());
            setA((getX()+getW())/2);
            setB((getY()+getZ())/2);
            System.out.println("El punto medio es: ("+getA()+","+getB()+")");
            back.loop();
}
}
