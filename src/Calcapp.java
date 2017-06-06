public class Calcapp {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.mostrarResultado( calc.suma( "20.3", "33.44", "2.0", "77.88", "41.32" ) );

		calc.mostrarResultado( calc.suma(2,2) );
		
		calc.mostrarResultado( calc.suma( 2, 2, 2 ) );
		
		calc.mostrarResultado( calc.suma( 2.2, 2.3 ) );
		
		calc.mostrarResultado( calc.suma( 2.2, 2.3, 2.4 ) );
		
	}

}
