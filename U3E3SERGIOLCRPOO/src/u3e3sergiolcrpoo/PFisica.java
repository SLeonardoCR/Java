package u3e3sergiolcrpoo;
import java.util.Scanner;
public class PFisica extends Matematicas{
    Scanner scan=new Scanner(System.in);
    U3E3SERGIOLCRPOO back=new U3E3SERGIOLCRPOO();
    void distancia(){
        System.out.println("\n**********DISTANCIA**********\nIngrese los datos pedidos\n\nVelocidad Inicial(en m/s):");
        setX(scan.nextFloat());
        System.out.println("Tiempo(en seg):");
        setY(scan.nextFloat());
        System.out.println("Aceleracion(en m/(s^2):");
        setZ(scan.nextFloat());
        setA(getX()*getY()+(getZ()*getY()*getY())/2);
        System.out.println("La distancia es: "+getA()+"m");
        back.loop();
}
    void velocidadF(){
        System.out.println("\n**********VELOCIDAD FINAL**********\nIngrese los datos pedidos\n\nVelocidad Inicial(en m/s):");
        setX(scan.nextFloat());
        System.out.println("Aceleracion(m/s^2):");
        setY(scan.nextFloat());
        System.out.println("Tiempo(en seg):");
        setW(scan.nextFloat());
        setZ(getX()+getY()*getW());
        System.out.println("La velocidad final es: "+getZ()+"m/s");
        back.loop();
}
    void tiempo(){
        System.out.println("\n**********TIEMPO**********\nIngrese los datos pedidos\n\nVelocidad final(en m/s):");
        setX(scan.nextFloat());
        System.out.println("Velocidad inicial(en m/s):");
        setY(scan.nextFloat());
        System.out.println("Aceleracion(m/(s^2)):");
        setZ(scan.nextFloat());
        setA((getX()-getY())/getZ());
        System.out.println("El tiempo es: "+getA()+"seg");
        back.loop();
}
}
