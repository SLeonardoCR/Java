package factorial;

import java.util.Scanner;

public class Operaciones {
    Scanner scanf=new Scanner(System.in);
    
    void inicio(){
        System.out.println("Introduce un numero");
        int num=scanf.nextInt();
        //double Resultado=fact(num);
        System.out.println(fact(num));
    }
    
    double fact(int n){
        double f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
}
