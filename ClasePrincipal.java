package com.paquete.fichero;

import java.io.File;

public class ClasePrincipal {

	public static void main(String[] args) {
		int opcion=EntradaSalida.mostrarMenu();
		File f;
		String ruta_base="T:\\ficheros\\";
		while(opcion != EntradaSalida.SALIR)
		{
			String nombre=EntradaSalida.preguntarNombre();
			String ruta_completa=ruta_base+nombre;
			switch(opcion)
			{
			case EntradaSalida.CREAR_CARPETA:
			int codigo_respuesta=AccesoFichero.crearCarpeta(ruta_completa);
			EntradaSalida.mostrarRespuesta(codigo_respuesta);
				break;
			case EntradaSalida.BORRAR_CARPETA:
				
				break;
			case EntradaSalida.CREAR_FICHERO:
				
				break;
			case EntradaSalida.BORRAR_FICHERO:
				
				break;
			
			}
			opcion=EntradaSalida.mostrarMenu();	
		}
	}

}
