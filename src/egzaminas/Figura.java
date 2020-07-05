package egzaminas;

public class Figura {
	private double plotas;
	private double krastine1;
	private double krastine2;
	
	public double getPlotas() {
		return plotas;
	}
	public void setPlotas(double plotas) {
		this.plotas = plotas;
	}

	public Figura (double skaicius1, double skaicius2) {
		this.krastine1 = skaicius1;
		this.krastine2 = skaicius2;
	}
	
	public void skaiciuokPlota() {
		this.plotas = krastine1 * krastine2;
	}
	public String toString() {
		String figurosPlotas = "Jusu figuros plotas yra lygus " + this.plotas + " kv.cm.";
		return figurosPlotas;
	}
	
}
