package geometria;

public class CirculoVisitor extends FiguraVisitor {

	private Circulo c;

	public CirculoVisitor(Circulo c) {
		this.c = c;
	}

	@Override
	public boolean visitarCirculo(Circulo c2) {

		return colisionEntre.circuloCirculo(c, c2);

	}

	@Override
	public boolean visitarRectangulo(Rectangulo r) {
		return colisionEntre.circuloRectangulo(c, r);
		
	}

	@Override
	public boolean visitarPunto(Punto p) {
		return colisionEntre.puntoCirculo(p, c);

	}

}
