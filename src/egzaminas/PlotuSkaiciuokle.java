package egzaminas;

public class PlotuSkaiciuokle {

	public static void main(String[] args) {
	boolean loop = true;
	
	while (loop) {								//while kilpa del patogumo, kad iskart skaiciuoti kitos figuros plota.
	IvestisIsvestis ii = new IvestisIsvestis();

	ii.suzinokFigura();
	ii.suzinokKrastines();
	
	
	if (ii.getFigura() == 1) {
		Kvadratas kvadratas = new Kvadratas(ii.getKrastine1());
		kvadratas.skaiciuokPlota();
		ii.spausdinkPlota(kvadratas.toString());
	}
	
	else if (ii.getFigura() == 2) {
		Trikampis trikampis = new Trikampis(ii.getKrastine1(), ii.getKrastine2());
		trikampis.skaiciuokPlota();
		ii.spausdinkPlota(trikampis.toString());
	}
	
	else if (ii.getFigura() == 3) {
		Skritulys skritulys = new Skritulys(ii.getKrastine1());
		skritulys.skaiciuokPlota();
		ii.spausdinkPlota(skritulys.toString());
	}
	else {loop = false;}
	}
	}
}

