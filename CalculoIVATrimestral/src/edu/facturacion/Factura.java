package edu.facturacion;

import java.util.List;

public class Factura {
		private int numero;
		private List<Producto> productos;
		
		public Factura(int numero, List<Producto> productos) {
			super();
			this.numero = numero;
			this.productos = productos;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public List<Producto> getProductos() {
			return productos;
		}

		public void setProductos(List<Producto> productos) {
			this.productos = productos;
		}

		@Override
		public String toString() {
			return "Factura [numero=" + numero + ", productos=" + productos + "]";
		}
		
		
		
}
