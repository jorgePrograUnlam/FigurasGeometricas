package geometria;

public class Rectangulo implements IColisionable {
	
	private Punto vertice;
	private double ancho;
	private double alto;

	public Rectangulo(Punto vertice, int ancho, int alto) {
		this.vertice = vertice;
		this.ancho = ancho;
		this.alto = alto;
	}

	public Punto getVertice() {
		return vertice;
	}

	public double getAncho() {
		return ancho;
	}

	public double getAlto() {
		return alto;
	}

	@Override
	public boolean colisionaCon(IColisionable figura) {
		RectanguloVisitor rvisitor = new RectanguloVisitor(this);
		return figura.accept(rvisitor);
	}

	@Override
	public boolean accept(FiguraVisitor visitor) {
		return visitor.visitarRectangulo(this);
	}

}
