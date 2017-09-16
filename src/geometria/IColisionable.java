package geometria;

public interface IColisionable {
	public boolean colisionaCon(IColisionable figura);

	public boolean accept(FiguraVisitor visitor);
}
