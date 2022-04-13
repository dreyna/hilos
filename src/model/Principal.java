package model;

import java.util.Scanner;

public class Principal extends Thread{
	Scanner sc = new Scanner(System.in);
	String n, d;
	double h;
	
	public Principal(String nombre, String dia, double hora) {
		n = nombre;
		d = dia;
		h = hora;
		System.out.println("Nombre:");
		n = sc.next();
		System.out.println("Día: ");
		d = sc.next();
		System.out.println("Hora: ");
		h = sc.nextDouble();
	}


	@Override
	public void run() {
		if(h>8) {
			System.out.println(n + " llego tarde el día "+d);
		}else {
			System.out.println(n + " llego temprano el día "+d);
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			Thread emp1 = new Principal("","",0);
			emp1.start();
			Thread.sleep(3000);
			Thread emp2 = new Principal("","",0);
			emp2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
