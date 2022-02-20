/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaymoda;

/**
 *
 * @author serch
 */
public class Operaciones {
    float media, moda;
    
    void media(int a[]){
        for(int i=0; i<=19; i++){
        media=media+a[i];
    }
    media=media/20;
        System.out.println("La media es:"+media);    
    }
    
    void moda(int a[]){
        int[] frecuencia=new int [20];
        int[] control=new int [20];
        int i, j, moda=0, r=0;
        for(i=0; i<=19; i++){
            for(j=0;j<=19; j++){
                if(a[i]==a[j]){
                    frecuencia[i]++;
                }
            }
        }
        for(i=0; i<=19; i++){
            for(j=0;j<=19;j++){
                if(frecuencia[i]<frecuencia[j]){
                    moda=frecuencia[j];
                    r=j;
                }
            }
        }
        System.out.println("La moda es:"+a[r]+" Se repite "+moda+" veces");
}
    
}
