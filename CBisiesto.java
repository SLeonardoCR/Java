import java.util.Scanner;
public class CBisiesto{
	public boolean NumeroBisiesto(){
		Scanner entrada=new Scanner(System.in);
       		int anio;
		boolean x;
      		System.out.println("Ingresa anio");
     		anio = entrada.nextInt();
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
			System.out.println("El anio es bisiesto");
			x = true;
		}
		else{
			System.out.println("El anio no es bisiesto");
			x = false;
		}
		return x;
		
	}
	
	public class Calendario{
		public int CalcularCalendario(){
			String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
			int[][] Enero = new int[5][7];
			int[][] Febrero = new int[5][7];
			int[][] Marzo = new int[5][7];
			int[][] Abril = new int[5][7];
			int[][] Mayo = new int[5][7];
			int[][] Junio = new int[5][7];
			int[][] Julio = new int[5][7];
			int[][] Agosto = new int[5][7];
			int[][] Septiembre = new int[5][7];
			int[][] Octubre = new int[5][7];
			int[][] Noviembre = new int[5][7];
			int[][] Diciembre = new int[5][7];
		}
	}
}