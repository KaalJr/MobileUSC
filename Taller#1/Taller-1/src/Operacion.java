
public class Operacion 
{
	public Persona generarImc(Persona Per) {
	
		Per.setImc((Per.getPeso()/ Per.getAltura())*(Per.getAltura()));
		return Per;
		
	}
}
