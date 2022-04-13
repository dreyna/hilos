package model;

import dto.HiloEjemplo;

public class Main {

	public static void main(String[] args) {

		HiloEjemplo h = null;
        
        for (int i = 0; i < 4; i++){
              h = new HiloEjemplo(i+1); 
              h.start(); 
        }
        System.out.println("4 hilos creados");
	}

}
