package Modelos;

public class CuentaCorriente implements ICuenta{

	public float montoMinimo;
	
	///interface
	@Override
	public void calcularDescuento(String numero) {
		System.out.println("Calculando corriente... "+numero);
		
	}

	@Override
	public void calcularBeneficio() {
		System.out.println("Calculando Beneficio corriente...");
	}
	
	
	//metodos set y get
	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

}
