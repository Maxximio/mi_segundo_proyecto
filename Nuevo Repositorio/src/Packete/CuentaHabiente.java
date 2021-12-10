package Packete;

public class CuentaHabiente {
	
	protected String nombre;
	protected String apellido;
	protected String cedula;
	
	protected Cuenta cuenta;
	
	public void tipoCuenta(String apellido,Cuenta cuenta) {
		System.out.println("El señor "+apellido+" desea crear una cuenta en el Banco del Pichincha");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public Cuenta getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "CuentaHabiente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", cuenta="
				+ cuenta + "]";
	}
	
	
	
}
