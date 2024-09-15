package tugas1;

import tugas1dan2.*;

public class MatematikaInheritance extends Matematika2 {
	public static void main(String[] args) {
		Matematika2 mtk2 = new Matematika2();
		Matematika mtk = new Matematika();
		
		System.out.println("pertambahan 20 + 10 = " + mtk.pertambahan(20, 10));
		System.out.println("pengurangan 20 + 10 = " + mtk.pengurangan(10, 5));
		System.out.println("perkalian 20 + 10 = " + mtk.perkalian(10, 3));
		System.out.println("pertambahan 20 + 10 = " + mtk.pembagian(20, 2));
		System.out.println("Hasil modulus dari 20 % 3 = " + mtk2.modulus(20, 3));
	}
}
