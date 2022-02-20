package u4e4leonardocrpoo;

public class Strings implements Buscar{

    @Override
    public void Buscar(String[] arreglo, String comparar) {
        U4E4LEONARDOCRPOO loop=new U4E4LEONARDOCRPOO();
        int loc=1;
        for(int i=0; i<=9; i++){
            if(arreglo[i].equals(comparar)){
                System.out.println("La palabra "+arreglo[i]+" está en el arreglo num."+i+"\n");
                loc=0;
            }
        }
        if(loc==1){
            System.out.println("No existe \n");
        }
        loop.loop();
    }

    @Override
    public void Buscar(String[][] arreglo, String comparar) {
        throw new UnsupportedOperationException("No soportado");
    }
    
}
