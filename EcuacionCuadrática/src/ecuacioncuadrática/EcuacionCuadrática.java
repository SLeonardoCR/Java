/*
Campos Rangel Sergio Leonardo
No. de Control: 19141127
Proyecto: Ecuacion Cuadrática
 */
package ecuacioncuadrática;

import java.util.Scanner;

public class EcuacionCuadrática {
    

    public static void main(String[] args) {
        Operacion j=new Operacion();
        Scanner scanf=new Scanner(System.in);
        System.out.println("Resolver una ecuacion cuadratica, forma: ax+by+c \nIntroduce a");
        int a=scanf.nextInt();
        System.out.println("Introduce b");
        int b=scanf.nextInt();
        System.out.println("Introduce c");
        int c=scanf.nextInt();
        System.out.println();
        j.formula(a, b, c);
    }
    
}
