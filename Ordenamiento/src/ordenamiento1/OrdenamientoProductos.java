package ordenamiento1;

import java.util.Arrays;
public class OrdenamientoProductos {
	
	
	public static void main(String[] args) {
		
		
		productos[] productos = {
	 new productos(5,1200.50,"Laptop"),
	 new productos(10,800.99,"Celular"),
	 new productos(8,500.75,"Tablet"),
	 new productos(6,300.40,"Monitor"),
	 new productos(15,50.99,"Teclado"),
	 new productos(20, 25.99,"Mouse"),
	 new productos(3,200.80,"Impresora"),
     new productos(7,450.30,"Cámara"),
     new productos(12,100.60,"Auriculares" ),
     new productos(9, 150.90,"Disco Duro"),
		};
		   productos[] productosBubble = Arrays.copyOf(productos, productos.length);
		   productos[] productosInsertion = Arrays.copyOf(productos, productos.length);
	
		   bubbleSort(productosBubble);
	        System.out.println("Productos ordenados con Bubble Sort:");
	        for (productos p : productosBubble) {
	           p.mostrarinfo();
	        }
	
	        insertionSort(productosInsertion);
	        System.out.println("\nProductos ordenados con Insertion Sort:");
	        for (productos p : productosInsertion) {
	            p.mostrarinfo();
	        }
	
	}

	
	public static void bubbleSort(productos[] producto) {
        int n = producto.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (producto[j].precio > producto[j + 1].precio) {
                    productos temp = producto[j];
                    producto[j] = producto[j + 1];
                    producto[j + 1] = temp;
                }
            }
        }
   	}

	public static void insertionSort(productos[] producto) {
        int n = producto.length;
        for (int i = 1; i < n; i++) {
            productos key = producto[i];
            int j = i - 1;
            while (j >= 0 && producto[j].precio > key.precio) {
                producto[j + 1] = producto[j];
                j = j - 1;
            }
            producto[j + 1] = key;
        }
    }
	

	

}
	


