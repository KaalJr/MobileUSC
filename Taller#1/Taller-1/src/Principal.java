import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("Ingrese el nombre de la persona");
		p.setNombre(sc.next());
		
		System.out.println("Ingrese la altura de la persona");
		p.setAltura(sc.nextDouble());
		
		System.out.println("Ingrese el peso de la persona");
		p.setPeso(sc.nextDouble());
		
		Operacion o = new Operacion();
		p = o.generarImc(p);
		System.out.println("El imc de la persona es :" + p.getImc());
	
		 
		{
		
			{
				float altura = 0, peso = 0, imc = 0;
				
				Scanner lectura = new Scanner(System.in);
				
				System.out.println("Introduce tu altura en metros: ");
				altura = lectura.nextFloat();
				System.out.println("Introduce tu peso en kilogramos: ");
				peso = lectura.nextFloat();
				
				imc = peso/(altura * altura);
				
				if (imc <= 18.4) 
				{
					System.out.println("Tu peso esta bajo");
					
				}
				else if (imc >= 18.5 && imc <= 25) 
				{
					System.out.println("Tu peso es normal");
				}
				else if (imc >= 25 && imc <= 29.9) 
				{
					System.out.println("Tienes sobrepeso");
				}
				else if (imc >= 30 && imc < 34.9) 
				{
					System.out.println("Tienes obesidad grado 1");
					
				}
			}
		}
	}
}
	

