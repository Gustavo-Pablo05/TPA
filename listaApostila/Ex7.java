import java.util.Scanner;
public class Ex7 {
	public static void main(String [] args) {
		String nome1, nome2, nome3, nome4, nome5;
		int idade1, idade2, idade3, idade4, idade5;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome: ");
		nome1 = in.next();
		System.out.println("Digite a primeira idade: ");
		idade1 = in.nextInt();
		System.out.println("Digite o segundo nome: ");
		nome2 = in.next();
		System.out.println("Digite a segunda idade: ");
		idade2 = in.nextInt();
		System.out.println("Digite o terceiro nome: ");
		nome3 = in.next();
		System.out.println("Digite a terceira idade: ");
		idade3 = in.nextInt();
		System.out.println("Digite o quarto nome: ");
		nome4 = in.next();
		System.out.println("Digite a quarta idade: ");
		idade4 = in.nextInt();
		System.out.println("Digite o quinto nome: ");
		nome5 = in.next();
		System.out.println("Digite a quinta idade: ");
		idade5 = in.nextInt();
		
		if (idade1 < idade2 && idade1 < idade3 && idade1 < idade4 && idade1 < idade5) {
			
			System.out.println("O aluno mais novo �: "+nome1);
			System.out.println("Sua idade: "+idade1);
			
		} else if (idade2 < idade3 && idade2 < idade4 && idade2 < idade5) {
			
			System.out.println("O aluno mais novo �: "+nome2);
			System.out.println("Sua idade: "+idade2);
			
		} else if (idade3 < idade4 && idade3 < idade5) {
			
			System.out.println("O aluno mais novo �: "+nome3);
			System.out.println("Sua idade: "+idade3);
			
		} else if (idade4 < idade5) {
			
			System.out.println("O alunos mais novo �: "+nome4);
			System.out.println("Sua idade: "+idade4);
			
		} else {
			
			System.out.println("O alunos mais novo �: "+nome5);
			System.out.println("Sua idade: "+idade5);
			
		} if (idade1 > idade2 && idade1 > idade2 && idade3 > idade4 && idade1 > idade5) {
			
			System.out.println("O alunos mais velho �: "+nome1);
			System.out.println("Sua idade: "+idade1);
			
		} else if (idade2 > idade3 && idade2 > idade4 && idade2 > idade5) {
			
			System.out.println("O aluno mais velho �: "+nome2);
			System.out.println("Sua idade: "+idade2);
			
		} else if (idade3 > idade4 && idade3 > idade5) {
			
			System.out.println("O aluno mais velho �: "+nome3);
			System.out.println("Sua idade: "+idade3);
			
		} else if (idade4 > idade5) {
			
			System.out.println("O aluno mais velho �: "+nome4);
			System.out.println("Sua idade: "+idade4);
			
		} else {
			
			System.out.println("O aluno mais velho �: "+nome5);
			System.out.println("Sua idade: "+idade5);
			System.exit(0);
			
		}
		
		
	}
	
}

