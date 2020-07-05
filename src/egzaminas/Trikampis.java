package egzaminas;

public class Trikampis extends Figura {

	public Trikampis(double skaicius1, double skaicius2) {
		super(skaicius1, skaicius2);
	}
	
@Override
	public void skaiciuokPlota() {
	super.skaiciuokPlota();
	double trikampioPlotas = super.getPlotas()/2;
	super.setPlotas(trikampioPlotas);
}
}
