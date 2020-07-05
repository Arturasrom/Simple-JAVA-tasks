package egzaminas;

import java.util.Scanner;

public class IvestisIsvestis {
	private int figura;
	private double krastine1;
	private double krastine2;
	
	public int getFigura() {
		return figura;
	}
	public double getKrastine1() {
		return krastine1;
	}
	public double getKrastine2() {
		return krastine2;
	}
	
	public void suzinokFigura() {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Kokios figuros plota norite skaiciuoti? Iveskite skaiciu 1 -jei kvadratas, 2 - jei statusis trikampis, 3 - skritulys.");
		int userInput = myScanner.nextInt();
		this.figura = userInput;
	}
	
	public void suzinokKrastines() {
		
		Scanner myScanner = new Scanner(System.in);
		if (this.figura == 1 ) {
			System.out.println("Jusu pasirinkta figura yra kvadratas. Iveskite kvadrato krastines ilgi centimetrais ir spauskite 'Enter':");
			double userInput = myScanner.nextDouble();
			this.krastine1 = userInput;
		}
		else if (this.figura == 2) {
			System.out.println("Jusu pasirinkta figura yra statusis trikampis.");
			System.out.println("Iveskite pirmojo statinio ilgi centimetrais ir spauskite 'Enter': ");
			double userInput = myScanner.nextDouble();
			this.krastine1 = userInput;
			System.out.println("Iveskite antrojo statinio ilgi centimetrais ir spauskite 'Enter': ");
			double userInput2 = myScanner.nextDouble();
			this.krastine2 = userInput2;
		}
		else if (this.figura == 3) {
			System.out.println("Jusu pasirinkta figura yra skritulys. Iveskite skritulio spinduli centimetrais ir spauskite'Enter':");
			double userInput = myScanner.nextDouble();
			this.krastine1 = userInput;
		}
		else {System.out.println("Tokios figuros ploto skaiciuoti nemoku.\n");}
	}
	
	public void spausdinkPlota(String plotasString) {
		System.out.println(plotasString);
		System.out.println("******Skaiciavimo pabaiga******\n");
	}
}
