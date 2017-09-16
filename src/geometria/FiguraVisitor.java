package geometria;

public abstract class FiguraVisitor {

	protected ManejadorDeColisiones colisionEntre = new ManejadorDeColisiones();

	public abstract boolean visitarCirculo(Circulo c);

	public abstract boolean visitarRectangulo(Rectangulo r);

	public abstract boolean visitarPunto(Punto p);

}
