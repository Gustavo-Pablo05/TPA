package Lista1;
import java.util.Scanner;
public class Escolafutebol {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
	
		int i;
		System.out.println("Qual a idade do aluno?");
		i = in.nextInt();
		switch(i) {
		case 6:
			System.out.println("A categoria sera dente de leite");
			break;
		case 7:
			System.out.println("A categoria sera j�nior");
			break;
		case 8:
			System.out.println("A categoria sera j�nior max");
			break;
		case 9:
			System.out.println("A categoria sera j�nior master");
			break;
		case 10:
			System.out.println("A categoria sera master");
			break;
			default:
				System.out.println("o aluno n�o pode estudar com essa idade.");
		}
	}

}
