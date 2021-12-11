package Modelos;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerInt = new Scanner(System.in);
		
		System.out.println("Ingrese el tipo de cuenta:");
		System.out.println("1 Para Corriente, 2 Para Ahorros, 3 Cuneta Futuro");
		int tipo = scannerInt.nextInt();
		
		ICuenta cuenta=null;
		
		if(tipo==1) {
			cuenta=new CuentaCorriente();
		}else if(tipo==2) {
			cuenta=new CuentaAhorros();
		}else /*if(tipo==3)*/ {
			cuenta=new CuentaFuturo();
		}/*else if(tipo==4){
			cuenta=new ICuenta() {
				
				@Override
				public void calcularDescuento(String numero) {
					System.out.println("opcion 4");
				}
				
				@Override
				public void calcularBeneficio() {
					System.out.println("beneficio 4");
				}
			};
		}*/
		
		GestorCuentas gestor=new GestorCuentas(cuenta);
		gestor.registrarCuentaHabiente();
	}

}
