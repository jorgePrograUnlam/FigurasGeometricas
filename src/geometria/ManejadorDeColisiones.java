package geometria;

public class ManejadorDeColisiones {
	
	public boolean circuloCirculo(Circulo c1, Circulo c2) {
		return c2.getCentro().getDistancia(c1.getCentro()) < c2.getRadio()
				+ c1.getRadio();
	}

	public boolean rectanguloRectangulo(Rectangulo r1,
			Rectangulo r2) {
		return (r1.getVertice().getX() + r1.getAncho() >= r2.getVertice().getX()
				&& r1.getVertice().getX() <= r2.getVertice().getX()
						+ r2.getAncho()
				&& r1.getVertice().getY() + r1.getAlto() >= r2.getVertice()
						.getY()
				&& r1.getVertice().getY() <= r2.getVertice().getY()
						+ r2.getAlto());
	}

	public boolean circuloRectangulo(Circulo c1, Rectangulo r2) {
		// temporary variables to set edges for testing
		double bordeHorizontal = c1.getCentro().getX();
		double bordeVertical = c1.getCentro().getY();

		// which edge is closest?
		if (c1.getCentro().getX() < r2.getVertice().getX())
			bordeHorizontal = r2.getVertice().getX(); // izquierdo
		else if (c1.getCentro().getX() > r2.getVertice().getX() + r2.getAncho())
			bordeHorizontal = r2.getVertice().getX() + r2.getAncho(); // derecho
		if (c1.getCentro().getY() < r2.getVertice().getY())
			bordeVertical = r2.getVertice().getY(); // arriba
		else if (c1.getCentro().getY() > r2.getVertice().getY() + r2.getAlto())
			bordeVertical = r2.getVertice().getY() + r2.getAncho(); // abajo

		// get distance from closest edges
		double distX = c1.getCentro().getX() - bordeHorizontal;
		double distY = c1.getCentro().getY() - bordeVertical;
		double distance = Math.sqrt((distX * distX) + (distY * distY));

		// if the distance is less than the radius, collision!
		if (distance <= c1.getRadio()) {
			return true;
		}
		return false;
	}

	public boolean puntoRectangulo(Punto p1, Rectangulo r2) {
		return (r2.getVertice().getX() + r2.getAncho() >= p1.getX()
				&& r2.getVertice().getX() <= p1.getX()
				&& r2.getVertice().getY() + r2.getAlto() >= p1.getY()
				&& r2.getVertice().getY() <= p1.getY());
	}

	public boolean puntoCirculo(Punto p1, Circulo c2) {
		return p1.getDistancia(c2.getCentro()) <= c2.getRadio();
	}

	public boolean puntoPunto(Punto p1, Punto p2) {
		return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
	}


}
