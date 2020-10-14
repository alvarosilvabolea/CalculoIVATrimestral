package edu.facturacion;

public class Producto {
		private double importe;
		private String descripcion;
		public Producto(double importe, String descripcion) {
			super();
			this.importe = importe;
			this.descripcion = descripcion;
		}
	
		@Override
		public String toString() {
			return "Producto [importe=" + importe + ", descripcion=" + descripcion + "]";
		}

		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
}
