import java.util.Scanner;
public class ACcalendario{
	       public static void main(String[] args) {
               int annio=0;
	       int primerDia=0;
               Scanner sc = new Scanner(System.in);
               System.out.print("Ingresa un año: ");
               annio = sc.nextInt();

                System.out.print("¿Que dia de la semana comienza el año? ");
                primerDia = sc.nextInt();

               

                 calendario c = new calendario(annio,primerDia);
                 c.mostrarCalendario();
                 
	}
}