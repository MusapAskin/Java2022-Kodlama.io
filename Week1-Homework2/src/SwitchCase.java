
public class SwitchCase {
	public static void grade(int vize, int Final) {
		int avarage = (vize*40) / 100 + (Final*60) / 100;
		char grade;
		if (80 <= avarage) {
			grade='A';
		}else if (60 <= avarage && avarage < 80) {
			grade='B';
		}else if (40 <= avarage && avarage < 60) {
			grade='C';
		}else if (20 <= avarage && avarage < 40) {
			grade='D';
		}else {
			grade='F';
		}
		switch (grade) {
		case 'A':
				System.out.println("Mukemmel : Gectiniz");
				break;
		case 'B':
				System.out.println("Cok guzel : Gectiniz");
				break;
		case 'C':
				System.out.println("Iyi : Gectiniz");
				break;
		case 'D':

				System.out.println("Fena degil : Gectiniz.");
				break;
		case 'F':
				System.out.println("Maledef Kaldınız.");
				break;
		}
	}
}
