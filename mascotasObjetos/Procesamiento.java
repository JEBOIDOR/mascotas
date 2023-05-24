package mascotasObjetos;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Procesamiento {

	ArrayList<String> informacionMascota;

		int codigo;
	    String nombre;
	    String especie;
	    int edad;

	    
	    public void ingresar() {
	    
	    	informacionMascota = new ArrayList<>();
	    	
	    	String validacion;
	    	
	    	do {
	    	nombre = JOptionPane.showInputDialog("Ingrese nombre");
	        especie = JOptionPane.showInputDialog("ingrese la especie de: " + nombre);
	        edad = Integer.parseInt(JOptionPane.showInputDialog("edad de: " + nombre));
	    
	        informacionMascota.add(nombre);
	        informacionMascota.add(especie);
	        informacionMascota.add(edad + " ");
	        
	        validacion = JOptionPane.showInputDialog("¿desea ingresar otra mascota?");
	        
	    	}while(validacion.equalsIgnoreCase("SI"));
	    }

	    

	    public Procesamiento(String nombre, String especie, int edad) {
	        this.nombre = nombre;
	        this.especie = especie;
	        this.edad = edad;
	    }
	    

	    public void mostrarInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Especie: " + especie);
	        System.out.println("Edad: " + edad + " años");
	    }
	    
	    public void mostrarRegistros() {
	    	
	    	for(int i = 0; i < informacionMascota.size(); i++) {
	    		
	    		System.out.println(informacionMascota.get(i));
	    		
	    	}
	    	
	    }
	    
	    public void buscarMascota() {
	    	
	    	String nombreMascota = JOptionPane.showInputDialog("ingrse el nombre de las mascota que desea buscar");
	    	
	    	for (int i = 0; i < informacionMascota.size(); i++) {
				
	    		if(informacionMascota.get(i).equalsIgnoreCase(nombreMascota)) {
	    			
	    			System.out.println(nombreMascota + " se encuentra registrada");
	    			
	    		}
	    		
			}
	    	
	    }


	    public void hacerSonido() {
	        if (especie.equalsIgnoreCase("perro")) {
	            System.out.println("¡Guau guau!");
	        } else if (especie.equalsIgnoreCase("gato")) {
	            System.out.println("¡Miau miau!");
	        } else {
	            System.out.println("La mascota no hace sonidos conocidos.");
	        }
	    }
	    
	    
	    
	    
	    
	    
}
	

