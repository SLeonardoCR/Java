import java.util.Scanner;
    
    public class calendario {
    private int Year=0;
    private int FirstDay=0; 
    public calendario(int Year,int FirstDay) {
           this.Year=Year;
           this.FirstDay=FirstDay;
            }
        
         public void mostrarCalendario(){
 for(int mes= 1; mes <= 12; mes++)
        {
            int diasMes = 0;

       
            String nombreMes = "";   

            
            switch(mes)
            {
                case 1: nombreMes = "Enero"; 
                    diasMes = 31;
                    break;

                case 2: 
                    nombreMes = "Febrero";
                    if ((annio % 4 == 0) && ((annio % 100 != 0) || (annio % 400 == 0))) {
                        diasMes = 29;
                    }
                    else {
	                diasMes = 28;
                  
                        }
                    
                    break;

                case 3: nombreMes = "Marzo";
                    diasMes = 31;
                    break;

                case 4: nombreMes = "Abril";
                    diasMes = 30;
                    break; 

                case 5: nombreMes = "Mayo";
                    diasMes = 31;
                    break;

                case 6: nombreMes = "Junio";
                    diasMes = 30;
                    break; 

                case 7: nombreMes = "Julio";
                    diasMes = 31;
                    break;

                case 8: nombreMes = "Agosto";
                    diasMes = 31;
                    break;

                case 9: nombreMes = "Septiembre";
                   diasMes = 30;
                    break;

                case 10: nombreMes = "Octubre";
                    diasMes = 31;
                    break;

                case 11: nombreMes = "Noviembre";
                    diasMes = 30;
                    break;

                case 12: nombreMes = "Diciembre";
                    diasMes = 31;
                    break; 

               
                default : System.out.print("Tu mes no existe");
                   

            }
            System.out.println("                           "+nombreMes);
	    System.out.println("________________________________________________________");
            System.out.println("Domingo Lunes Martes Miercoles Jueves Viernes Sabado");

           
            int primerDiaCadaMes = (diasMes + FirstDay)%7;
            for (int espacio = 1; espacio <= primerDiaCadaMes; espacio++)
                System.out.print("   ");

           
            for (int darDias = 1; darDias <= diasMes; darDias++)
            {
                if (primerDia%7 == 0)
                    System.out.println();

                System.out.printf("%3d    ", darDias);
                primerDia = primerDia + 1;
            }
            System.out.println();
        }

    }
}  