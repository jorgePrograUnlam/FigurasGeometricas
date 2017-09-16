package geometria;

public class Circulo implements IColisionable {
	
	private double radio;
	private Punto centro;
	
	public Circulo(Punto centro, double radio) {
		this.radio = radio;
		this.centro = centro;
	}
	
	public double getRadio() {
		return radio;
	}

	public Punto getCentro() {
		return centro;
	}

	@Override
	public boolean colisionaCon(IColisionable figura) {
		CirculoVisitor cvisitor = new CirculoVisitor(this);
		return figura.accept(cvisitor);

	}

	@Override
	public boolean accept(FiguraVisitor visitor) {
		return visitor.visitarCirculo(this);
	}
		
}
