/*
Campos Rangel Sergio Leonardo
No. de Control: 19141127
Proyecto: Media y Moda
 */
package mediaymoda;

import java.util.Scanner;

/**
 *
 * @author serch
 */
public class MediayModa {
    
    public static void main(String[] args) {
        int[] datos=new int[20];
        Scanner scanf= new Scanner(System.in);
        Operaciones mym=new Operaciones();
        
        System.out.println("Ingrese 20 datos\n");
        for(int i=0; i<=19; i++){
            System.out.println(i+1+":");
            datos[i]=scanf.nextInt();
        }
        mym.media(datos);
        mym.moda(datos);
    }
    
}
