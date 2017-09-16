package geometria;

public class RectanguloVisitor extends FiguraVisitor {

	private Rectangulo r;

	public RectanguloVisitor(Rectangulo r) {
		this.r = r;
	}

	@Override
	public boolean visitarCirculo(Circulo c) {
		return colisionEntre.circuloRectangulo(c, r);
	}

	@Override
	public boolean visitarRectangulo(Rectangulo r2) {
		return colisionEntre.rectanguloRectangulo(r, r2);
	}

	@Override
	public boolean visitarPunto(Punto p) {
		return colisionEntre.puntoRectangulo(p, r);
	}

}
