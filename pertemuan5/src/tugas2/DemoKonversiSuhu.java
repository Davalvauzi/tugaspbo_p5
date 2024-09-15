package tugas2;

public class DemoKonversiSuhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KonversiSuhu2 konv = new KonversiSuhu2();
		
		double c = 100;
		double fah = konv.celciusTofahrenheit(c);
		System.out.println(c + " derajat celsius = " + fah + " derajat fahrenheit");
		
		double reamur = konv.celciusToReamur(c);
		System.out.println(c + " derajat celsius = " + reamur + " derajat reamur");
		
		double reamurasli = konv.fahrenheitToreamur(fah);
		System.out.println(fah + " derajat fah = " + reamurasli + " derajat reamur");
	}

}
