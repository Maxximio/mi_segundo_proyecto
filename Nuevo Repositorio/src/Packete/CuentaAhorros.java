package Packete;

public class CuentaAhorros extends CuentaHabiente {

	private int PorcentajeDescuento;
	
	public void tipoCuenta(String apellido,Cuenta cuenta) {
		System.out.println("El señor "+apellido+" desea crear una cuenta en el Banco del Pichincha");
		System.out.println("Pago realizado");
		System.out.println("el tipo de cuenta es: Cuenta de Ahorros");
	}

	public int getPorcentajeDescuento() {
		return PorcentajeDescuento;
	}

	public void setPorcentajeDescuento(int porcentajeDescuento) {
		PorcentajeDescuento = porcentajeDescuento;
	}
	
	
	
}
