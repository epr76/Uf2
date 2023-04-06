
import java.util.Scanner;
/**
 * 
 * @author Ernest
 *Esta aplicaccion nos permite introducir tres notas y calcular su nota media
 */


//HE MODIFICADO EL CODIGO DESDE GIT HUB

public class notas {
	//declaramos la variables que nos hacen falta
	
	/**
	 * @param unidadFormativa1 Esta es la variable donde almacenamos la nota de la primera uf del alumno.
	 * @param uf2 Esta es la variable donde almacenamos la nota de la segunda uf del alumno.
	 * @param uf3 Esta es la variable donde almacenamos la nota de la tercera uf del alumno.
	 */
	
	
	/**
	 * @param acu1 Esta es la variable donde almacenamos la nota calculada de la primera uf del alumno.
	 * @param acu2 Esta es la variable donde almacenamos la nota calculada de la segunda uf del alumno.
	 * @param acu3 Esta es la variable donde almacenamos la nota calculada de la tercera uf del alumno.
	 * @param def Esta es la variable donde almacenamos la nota definitiva del alumno.
	 */
	double unidadFormativa1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizames el escaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	

	
	/**
	 * Metodo para ingresar 3 notas de un estudiante.
	 */
	public void IngresaNotas() {
		
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		unidadFormativa1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar que estan correctas las notas.	
	/**
	 * Este metodo nos controla que las notas introducidas estan dentro del rango correcto 0 al 10.
	 */
	public void comprobarcion(){
		
		if (unidadFormativa1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}	
	}
	// metodo para calcular nota
	
	/**
	 * Con este metodo calculamos las notas introducidas, pero no las mostramos.
	 */
	public void Calculonotas() {
		acu1= unidadFormativa1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	/**
	 * Con este metodo mostraremos todas las notas por separado .
	 * Tambien mostraremos la nota definitiva con el calculo que hemos hecho en el metodo anterior.
	 * 
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + unidadFormativa1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * Con este metodo mostraremos si ha sido aprobado ,suspendido o si tenemos un error en las notas.
	 */
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		

	/**
	 * clase arranque o start de la aplicacion.
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
