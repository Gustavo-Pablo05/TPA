import java.util.Scanner;
public class Exercicio1 {
  
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int anoNasci,anoAtual,idade;
		
		System.out.println("Escreva o ano do seu nascimento.");
		anoNasci = in.nextInt();
		System.out.println("Escreva o ano atual.");
		anoAtual = in.nextInt();
		
		idade = anoAtual-anoNasci;
		
		if (idade<10) {System.out.println(+idade+ " Anos, criança");}
			else if (idade >= 10 && idade<18) {System.out.println(+idade+" anos, adolescente");}
			else if (idade >=18 && idade<60) {System.out.println(+idade+" anos, adulto");}
			else {System.out.println(+idade+" idoso");}
		
		
	}
}
