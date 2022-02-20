package ecuacioncuadrática;

public class Operacion {
    
    
    void formula(int a, int b, int c){
        double raiz=(b*b-4*a*c);
        if(raiz<0){
            System.out.println("No hay solucion");
        }
        else{
                double x1=(-b+Math.sqrt(raiz))/(2*a);
                double x2=(-b-Math.sqrt(raiz))/(2*a);
                System.out.println("Los valores son\nx1="+x1+"\tx2="+x2);
        }
}
}
