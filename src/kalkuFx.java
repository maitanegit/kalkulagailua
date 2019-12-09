
public class  kalkuFx {
	
	public  double batuketa(double zbk1, double zbk2) {
		return zbk1+zbk2;
	}
	public  double kenketa(double zbk1, double zbk2) {
		return zbk1-zbk2;
	}
	public  double biderketa(double zbk1, double zbk2) {
		return zbk1*zbk2;
	}
	public  double zatiketa(double zbk1, double zbk2) throws ArithmeticException{ 
		if (zbk2 == 0.0f) {
			throw new ArithmeticException();  
		} else {
			return zbk1/zbk2;
		}
	}
	public  double berreketa(double zbk1, double zbk2) {
		return Math.pow(zbk1, zbk2);
	}
	public  double errokarratua(double zbk1) {
		return Math.sqrt(zbk1);
	}
	
}
