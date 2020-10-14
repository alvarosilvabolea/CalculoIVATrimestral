package edu.gestion;

import java.util.ArrayList;

import edu.facturacion.Factura;
import edu.facturacion.Producto;

public class ejercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ArrayList <Producto> productos = new ArrayList<Producto>();
			productos.add( new Producto(0.75, "Leche"));
			productos.add( new Producto(0.50, "Pan"));
			productos.add( new Producto(8.99, "Salmon"));
			productos.add( new Producto(2.95, "Aguacates"));
			productos.add( new Producto(1.20, "Friegasuelos"));
			productos.add( new Producto(0.56, "Cerveza"));
			productos.add( new Producto(1.45, "Sandia"));
			Factura facturas = new Factura(0, productos);
			System.out.println(facturas.toString());
	}

}
