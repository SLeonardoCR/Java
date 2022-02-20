package u4e4leonardocrpoo;

public class Ints implements Buscar{

    @Override
    public void Buscar(String[][] arreglo, String comparar) {
        U4E4LEONARDOCRPOO loop=new U4E4LEONARDOCRPOO();
        int loc=1;
        for(int i=0; i<=1; i++){
            for(int j=0; j<=1; j++){
                if(arreglo[i][j].equals(comparar)){
                System.out.println("El número "+arreglo[i][j]+" está en el arreglo num. ["+i+"]["+j+"]\n");
                loc=0;
            }
            }
        }
        if(loc==1){
            System.out.println("No existe \n");
        }
        loop.loop();
    }
    
    @Override
    public void Buscar(String[] arreglo, String comparar) {
        throw new UnsupportedOperationException("No soportado"); 
    }
    
}
