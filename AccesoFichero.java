package com.paquete.fichero;

import java.io.File;

public class AccesoFichero {

	public static int crearCarpeta(String ruta_completa) {
		// TODO Auto-generated method stub
		File f=new File(ruta_completa);
		
		int codigo=0;
		if(f.isDirectory())
		{
			codigo=4;
			
		}
		else
		{
				try {
				boolean creado=f.mkdir();
				if (creado)
					{
						codigo=0;
					}
					else
					{
						codigo=1;
					}
				} catch(SecurityException e)
				{
					codigo=2;
				}
		}
		return codigo;
	}

}
