package ordenamiento1;

import java.util.Comparator;

public class productos implements Comparable<productos> {

	
	int codigo;
	int cantidad;
	double precio;
	private String nombre;

	public productos(int codigo,int cantidad, double precio, String nombre) {

		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	
	public int getCodigo() {
		return codigo;
		
	}
	
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
		
	}
	
	

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(productos p) {
		if (this.getPrecio() < p.getPrecio()) {
			return 1;
		} else {
			if (this.getPrecio() > p.getPrecio()) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
	class CompararPorCantidad implements Comparator<productos> {
		@Override
	    public int compare(productos p1, productos p2) {
	        if(p1.getCantidad() < p2.getCantidad()) {
	            return 1;
	        }
	        else {
	            if(p1.getCantidad() > p2.getCantidad()) {
	                return -1;
	            }
	            else {
	                return 0;
	            }
	        }
		}
	}
	