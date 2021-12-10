package Packete;

public class Cuenta {

	private String NumeroCuenta;
	private double Saldo;
	private double ValorInteres;
	
	
	public String getNumeroCuenta() {
		return NumeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public double getValorInteres() {
		return ValorInteres;
	}
	public void setValorInteres(double valorInteres) {
		ValorInteres = valorInteres;
	}
	
	
	@Override
	public String toString() {
		return "Cuenta [NumeroCuenta=" + NumeroCuenta + ", Saldo=" + Saldo + ", ValorInteres=" + ValorInteres + "]";
	}
	
	
	
}
