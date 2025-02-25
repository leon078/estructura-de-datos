package ordenamiento1;
public class OrdenamientoProductos {
	
	
	public static void main(String[] args) {
		
		
	 productos productos1= new productos(1829,5,1200.50,"Laptop");
	 productos productos2= new productos(1523,10,800.99,"Celular");
	 productos productos3=new productos(2982,8,500.75,"Tablet");
	 productos productos4=new productos(4028,6,300.40,"Monitor");
	 productos productos5=new productos(2192,15,50.99,"Teclado");
	 productos productos6=new productos(9823,20, 25.99,"Mouse");
	 productos productos7=new productos(8763,3,200.80,"Impresora");
	 productos productos8=new productos(6371,7,450.30,"Cámara");
	 productos productos9=new productos(7252,12,100.60,"Auriculares" );
	 productos productos10=new productos(9238,9, 150.90,"Disco Duro");

		
		productos[] misProductos = {
	            productos1, productos2, productos3, productos4, productos5, 
	            productos6, productos7, productos8, productos9, productos10  
	};
		
		
		productos[] ordenador = (misProductos);
		    for(int i = 0; i < ordenador.length; i++) {
	            System.out.println("Codigo: " +  ordenador[i].getCodigo() +", Producto: " + ordenador[i].getNombre() + ", Precio: " + ordenador[i].getPrecio() + ", Cantidad: " + ordenador[i].getCantidad());
	        }
		
		   
		   productos[] ordenador2 = (misProductos);
		   
		   System.out.println('\n');
		   
		   for(int i = 0; i < ordenador2.length; i++) {
	        	System.out.println("Codigo: " +  ordenador2[i].getCodigo() +"Producto: " + ordenador2[i].getNombre() + ", Precio: " + ordenador2[i].getPrecio() + ", Cantidad: " + ordenador2[i].getCantidad());
	        }
		
	}

	
	public static productos[] compararProductos(productos[] p) {
        int tamanio = p.length;
        productos misProductos[] = p.clone();

        for(int i = 0; i < tamanio-1; i++) {
            for(int j = 0; j < tamanio-1-i; j++) {
                if(misProductos[j].compareTo(misProductos[j+1]) > 0) {
                    productos temp = misProductos[j];
                    misProductos[j] = misProductos[j+1];
                    misProductos[j+1] = temp;
                }
            }
        }

        return misProductos;
    	}
	public static productos[] compararProductos2(productos[] p) {
	
		int tamanio = p.length;
        productos misProductos[] = p.clone();

		for(int i = 1; i < tamanio; i++) {
        productos temp = misProductos[i];
        int j = i - 1;

        while(j >= 0 && new CompararPorCantidad().compare(misProductos[j], temp) > 0) {
            misProductos[j+1] = misProductos[j];
            j--;
        }

        misProductos[j+1] = temp;
    }

    return misProductos;

	}
}
	
	
	
	
	




