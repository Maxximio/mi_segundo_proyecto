package Packete;

public class CuentaPoliza extends CuentaHabiente{
	
	private String FechaVigencia;
	
	public void tipoCuenta(String apellido,Cuenta cuenta) {
		System.out.println("El señor "+apellido+" desea crear una cuenta en el Banco del Pichincha");
		System.out.println("Pago realizado");
		System.out.println("el tipo de cuenta es: Cuenta de Poliza");
	}

	public String getFechaVigencia() {
		return FechaVigencia;
	}

	public void setFechaVigencia(String fechaVigencia) {
		FechaVigencia = fechaVigencia;
	}
	
	

}
