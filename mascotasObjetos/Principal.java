package mascotasObjetos;

public class Principal {

	public static void main(String[] args) {

		Procesamiento mascotas = new Procesamiento(null, null, 0);
		
		mascotas.ingresar();
		mascotas.mostrarInformacion();
		mascotas.hacerSonido();
		mascotas.mostrarRegistros();
		mascotas.buscarMascota();
		
		

	}

}
