package egzaminas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura {

	public Skritulys(double skaicius1) {
		super(skaicius1, 1);
	}

@Override
public void skaiciuokPlota() {
	
	super.skaiciuokPlota();
	double spindulys = super.getPlotas();
	double skritulioPlotas = Math.pow(spindulys, 2) * Math.PI;
//	skritulioPlotas = Math.round(skritulioPlotas);
	BigDecimal skritulioPlotasBd = new BigDecimal(skritulioPlotas);
	skritulioPlotasBd = skritulioPlotasBd.setScale(2, RoundingMode.UP);
	skritulioPlotas = skritulioPlotasBd.doubleValue();
	super.setPlotas(skritulioPlotas);
}
}
