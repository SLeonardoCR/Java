import javax.swing.JOptionPane;
public class ACanimales
{
	public static void main(String[] x)
	{
			String nombres[]=new String[31];
			String animales[]=new String[31];
			
			nombres[0]="Cristina";
			nombres[1]="Emmanuel";
			nombres[2]="Andrea";
			nombres[3]="Uriel";
			nombres[4]="Alejandro";
			nombres[5]="Emmanuel";
			nombres[6]="Victor";
			nombres[7]="Carlos";
			nombres[8]="Frida";
			nombres[9]="Adriana";
			nombres[10]="Ruben";
			nombres[11]="Daniel";
			nombres[12]="Karen";
			nombres[13]="Ruben";
			nombres[14]="Nicolas";
			nombres[15]="Osvaldo";
			nombres[16]="Luis";
			nombres[17]="Cesar";
			nombres[18]="Martha";
			nombres[19]="Edgar";
			nombres[20]="Andres";
			nombres[21]="Alan";
			nombres[22]="Vicky";
			nombres[23]="Kevan";
			nombres[24]="Fernando";
			nombres[25]="Yu";
			nombres[26]="Edgar";
			nombres[27]="Bryan";
			nombres[28]="Fabiola";
			nombres[29]="Aaron";
			nombres[30]="Rafael";
			
			animales[0]="Catarina";
			animales[1]="Elefante";
			animales[2]="Aguila";
			animales[3]="Unknown";
			animales[4]="Avestruz";
			animales[5]="Escorpion";
			animales[6]="Vaca";
			animales[7]="Cocodrilo";
			animales[8]="Foca";
			animales[9]="Araña";
			animales[10]="Rata";
			animales[11]="Delfin";
			animales[12]="Koala";
			animales[13]="Rinoceronte";
			animales[14]="Nutria";
			animales[15]="Oso";
			animales[16]="Leon";
			animales[17]="Caballo";
			animales[18]="Mamut";
			animales[19]="Erizo";
			animales[20]="Alacran";
			animales[21]="Alebrije";
			animales[22]="Venado";
			animales[23]="Kiwi";
			animales[24]="Flamingo";
			animales[25]="Yegua";
			animales[26]="Escarabajo";
			animales[27]="Buho";
			animales[28]="Faisan";
			animales[29]="Asno";
			animales[30]="Raton";
			
			String animal=JOptionPane.showInputDialog("en que animal viene montado ");
			String salida="No tiene dueño";
			for(int i=0; i<31; i++)
			{
				if(animales[i].equals(animal))
				{
					System.out.println(nombres[i] +" viene montad@ en un@ "+animales[i]);
				}
			} 
	}
}