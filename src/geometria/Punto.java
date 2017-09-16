package geometria;

public class Punto implements IColisionable {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistancia(Punto p){
		return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
	}

	@Override
	public boolean colisionaCon(IColisionable figura) {
		PuntoVisitor pvisitor = new PuntoVisitor(this);
		return figura.accept(pvisitor);
	}

	@Override
	public boolean accept(FiguraVisitor visitor) {
		return visitor.visitarPunto(this);
	}
	
}
