package geometria;

public class PuntoVisitor extends FiguraVisitor {

	private Punto p;

	public PuntoVisitor(Punto p) {
		this.p = p;
	}

	@Override
	public boolean visitarCirculo(Circulo c) {
		return colisionEntre.puntoCirculo(p, c);
	}

	@Override
	public boolean visitarRectangulo(Rectangulo r) {
		return colisionEntre.puntoRectangulo(p, r);
	}

	@Override
	public boolean visitarPunto(Punto p2) {
		return colisionEntre.puntoPunto(p, p2);
	}

}
