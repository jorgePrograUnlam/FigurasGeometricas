import geometria.Circulo;
import geometria.Punto;
import geometria.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo rectan1 = new Rectangulo(new Punto(0, 0), 2, 2);
		
		Rectangulo rectan2 = new Rectangulo(new Punto(1, 1), 1, 1);
		
		Circulo circ1 = new Circulo(new Punto(5, 5), 1);
		
		//circ1.instersectan(rectan1);
		
		System.out.println(rectan1.colisionaCon(circ1));
	}

}
