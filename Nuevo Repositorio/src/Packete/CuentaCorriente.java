package Packete;

public class CuentaCorriente extends CuentaHabiente{

	private int MontoMinimo;
	
	public void tipoCuenta(String apellido,Cuenta cuenta) {
		System.out.println("El señor "+apellido+" desea crear una cuenta en el Banco del Pichincha");
		System.out.println("Pago realizado");
		System.out.println("Su tipo de cuenta es: Cuenta Corriente");
	}

	public int getMontoMinimo() {
		return MontoMinimo;
	}

	public void setMontoMinimo(int montoMinimo) {
		MontoMinimo = montoMinimo;
	}
	
	
	
}
