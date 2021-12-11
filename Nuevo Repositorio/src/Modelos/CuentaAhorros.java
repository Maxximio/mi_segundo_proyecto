package Modelos;

public class CuentaAhorros implements ICuenta{

	private String numAhorro;
	private int monto;
	
	
	//interface
	@Override
	public void calcularDescuento(String numero) {
		System.out.println("Se calcula el descuento de: "+numero);
	}
	@Override
	public void calcularBeneficio() {
		System.out.println("Se calcula el beneficio...");
	}
	
		
	//Metodos get y set
	public String getNumAhorro() {
		return numAhorro;
	}
	public void setNumAhorro(String numAhorro) {
		this.numAhorro = numAhorro;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}

}
