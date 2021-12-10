package Packete;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerDou = new Scanner(System.in);
		double ValorInteres = 0;
		
		System.out.println("Bienvenido al registro de cuentas del Banco del Pichincha");
		System.out.println("\n"+"...................................................................."+"\n");
		
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese Cedula");
		String cedula = scanner.nextLine();

		System.out.println("Ingrese su numero de cuenta");
		String numeroC = scanner.nextLine();
		
		System.out.println("Ingrese saldo");
		double saldo = scannerDou.nextDouble();
		
		if(saldo>=100) {
			System.out.println("Ingrese el tipo de cuenta:");
			System.out.println("1 Para Ahorros, 2 Para Corriente ,3 Para Cuenta de Poliza");
			int tipo = scannerInt.nextInt();
			
			CuentaHabiente cuentahab = null;
			
			if(tipo==1) {
				cuentahab = new CuentaAhorros();
				ValorInteres=0.1;
			}else if(tipo==2) {
				cuentahab = new CuentaCorriente();
				ValorInteres=0.08;
			}else if(tipo==3){
				cuentahab = new CuentaPoliza();
				ValorInteres=0.15;
			}else {
				System.out.println("Tipo no admitido");
				System.exit(tipo);
			}
			
			Apertura apertura=new Apertura(cuentahab, new Cuenta());
			
			String mensaje=apertura.aperturar(nombre, apellido, cedula, numeroC, saldo,ValorInteres);
			System.out.println(mensaje);
		}else {
			System.out.println("Error: Saldo insuficiente");
		}
		
	}
	
}
