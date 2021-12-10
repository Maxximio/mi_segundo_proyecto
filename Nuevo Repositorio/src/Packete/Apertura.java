package Packete;

public class Apertura {

	private CuentaHabiente cuentahab;
	private Cuenta cuenta;
	
	public Apertura(CuentaHabiente cuentahab, Cuenta cuenta) {
		this.cuentahab=cuentahab;
		this.cuenta=cuenta;
	}
	
	public String aperturar(String nombre, String apellido, String cedula, String numeroCuenta,double saldo,double ValInteres) {
		
		this.cuentahab.setNombre(nombre);
		this.cuentahab.setApellido(apellido);
		this.cuentahab.setCedula(cedula);
		
		this.cuenta.setNumeroCuenta(numeroCuenta);
		this.cuenta.setSaldo(saldo);
		this.cuenta.setValorInteres(ValInteres);
		
		this.cuentahab.setCuenta(cuenta);
		
		System.out.println(this.cuentahab);
		
		this.cuentahab.tipoCuenta(apellido, cuenta);
		
		
		return "Cuenta creada Exitosamente";
		
	}
	
}
