package com.paquete.fichero;

import java.util.Scanner;

public class EntradaSalida {
	public static final int SALIR=5;
	public static final int CREAR_CARPETA=1;
	public static final int BORRAR_CARPETA=2;
	public static final int CREAR_FICHERO=3;
	public static final int BORRAR_FICHERO=4;
	public static int mostrarMenu()
	{
		System.out.println(CREAR_CARPETA+"-CREAR CARPETA");
		System.out.println(BORRAR_CARPETA+"-BORRAR CARPETA");
		System.out.println(CREAR_FICHERO+"-CREAR FICHERO");
		System.out.println(BORRAR_FICHERO+"-BORRAR FICHERO");
		System.out.println(SALIR+"-SALIR");
		Scanner sc=new Scanner (System.in);
		int opcion=sc.nextInt();
		return opcion;
	}
	public static String preguntarNombre() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Escriba el nombre");
	String nombre=sc.nextLine();
	return nombre;
	
	}
	public static void mostrarRespuesta(int codigo_respuesta) {
		// TODO Auto-generated method stub
		switch(codigo_respuesta)
		{
		case 0:
			System.out.println("Creado correctamente");
			break;
		case 1:
			System.out.println("No se ha podido crear");
			break;
		case 2:
			System.out.println("Ha habido algún prioblema de seguridad");
			break;
		case 4:
			System.out.println("Ya existe. No se puede crear");
			break;
		}
	}
}
